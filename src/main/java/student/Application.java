package student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import student.model.Student;
import utils.MyReflectionUtils;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);
    
    public static void main(String[] args) throws Exception {
	log.info("number of field in Student:" + MyReflectionUtils.getFieldsFromClass(Student.class).length);	
        SpringApplication.run(Application.class, args);
    }
}
