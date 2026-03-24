package co.edu.cesde.ga.repository;


import co.edu.cesde.ga.model.Student;
import java.util.List;

public interface StudentRepository {
    Student create(Student student);
    List<Student> findAll();

    Student findById(long studentId);

    Student findByDocumentNumber(String documentNumber);

    boolean update(Student updateStudent);

    boolean existsByDocumentNumber(String documentNumber);

    boolean delete(Long studentId);

    int count();


}
