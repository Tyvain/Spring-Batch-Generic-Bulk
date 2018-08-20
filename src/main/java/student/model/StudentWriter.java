package student.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import student.utils.MyReflectionUtils;

public class StudentWriter implements ItemWriter<Student> {
    private static final Logger log = LoggerFactory.getLogger(StudentWriter.class);
    
    StudentRepository studentRepo;

    public StudentWriter(StudentRepository studentRepo) {
	this.studentRepo = studentRepo;
    }
    
    @Override
    public void write(List<? extends Student> items) throws Exception {
	log.info("Received the information of {} students", items.size());
	for (Student student : items) {
	    log.info("inserting: " + MyReflectionUtils.ObjectToStr(student));	    
	    studentRepo.save(student);
	}
    }
}