package student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public final static String TABLE_NAME = "student";
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
