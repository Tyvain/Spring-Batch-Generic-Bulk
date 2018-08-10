package student;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import student.model.Student;
import utils.MyReflectionUtils;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public DelimitedLineTokenizer lineTokenizer() {
	DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer(DelimitedLineTokenizer.DELIMITER_TAB);
	tokenizer.setNames(MyReflectionUtils.getFieldsFromClass(Student.class));
	return tokenizer;
    }

    @Bean
    public DefaultLineMapper<Student> lineMapper() {
	DefaultLineMapper<Student> lineMapper = new DefaultLineMapper<>();
	lineMapper.setLineTokenizer(lineTokenizer());
	lineMapper.setFieldSetMapper(new BeanWrapperFieldSetMapper<Student>() {
	    {
		setTargetType(Student.class);
	    }
	});
	return lineMapper;
    }

    @Bean
    public FlatFileItemReader<Student> reader() {
	return new FlatFileItemReaderBuilder<Student>().name("personItemReader")
		.resource(new ClassPathResource("sample-data.csv"))
		.linesToSkip(1)
		.lineMapper(lineMapper())
		.build();
    }

    @Bean
    public ItemWriter<Student> writer() throws Exception {
        return new StudentWriter();
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
	return jobBuilderFactory.get("importUserJob")
		.incrementer(new RunIdIncrementer())
		.listener(listener)
		.flow(step1)
		.end()
		.build();
    }

    @Bean
    public Step step1(StudentRepository repository) throws Exception {
	return stepBuilderFactory.get("step1")
		.<Student, Student>chunk(10)
		.reader(reader())
		.writer(writer())
		.build();
    }
}
