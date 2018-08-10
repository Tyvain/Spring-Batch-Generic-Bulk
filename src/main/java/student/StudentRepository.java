package student;

import org.springframework.data.repository.CrudRepository;

import student.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
