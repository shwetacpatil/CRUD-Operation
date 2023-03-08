package student.student.Repository;

import java.util.List;

import student.student.Entity.Student;

public interface StudentRepository {
    
        List<Student> findAll();
        Student findById(Long id);
        void save(Student student);
        void deleteById(Long id);
        void update(Student student);
    
    
}
