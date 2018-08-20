package student;

import java.io.IOException;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import student.model.Student;
import student.model.StudentReader;
import student.model.StudentRepository;
import student.model.StudentWriter;
import student.tasks.ArchiveFileTask;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;
    
    @Autowired
    private StudentRepository studentRepository;

    @Value("${file.input-path}")
    private Resource inputFile;
    
    @Value("${file.archive-directory}")
    private FileSystemResource archiveDirectory;
    
    @Bean
    public StudentReader reader() throws IOException {
	return new StudentReader (inputFile);
    }
    
    @Bean
    public StudentWriter writer() throws Exception {
        return new StudentWriter(studentRepository);
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener, Step step1_readFileWriteDB, Step step2_archiveFile) {
	return jobBuilderFactory.get("importUserJob")
		.incrementer(new RunIdIncrementer())
		.listener(listener)
		.start(step1_readFileWriteDB)
		.next(step2_archiveFile)
		.build();
    }

    @Bean
    public Step step1_readFileWriteDB(StudentRepository repository) throws Exception {
	return stepBuilderFactory.get("step1_readFileWriteDB")
		.<Student, Student>chunk(10)
		.reader(reader())
		.writer(writer())
		.build();
    }
    
    @Bean
    public Step step2_archiveFile() throws Exception {
	return stepBuilderFactory.get("step2_archiveFile")
		.tasklet(new ArchiveFileTask(inputFile, archiveDirectory))
		.build();
    }
}
