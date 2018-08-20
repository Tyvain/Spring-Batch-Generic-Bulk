package student.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.core.io.Resource;

import com.opencsv.bean.CsvToBeanBuilder;

public class StudentReader implements ItemReader<Student> {
    private Iterator<Student> iteratorStudent;

    public StudentReader(Resource inputFile) throws IOException {		
	Reader reader = new BufferedReader(new InputStreamReader(inputFile.getInputStream()));
	iteratorStudent = new CsvToBeanBuilder<Student>(reader).withType(Student.class)
		.withIgnoreLeadingWhiteSpace(true)
		.withSeparator('	')
		.build()
		.iterator();
    }

    @Override
    public Student read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
	return iteratorStudent.hasNext() ? iteratorStudent.next() : null;
    }

}
