package student.student.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import student.student.Entity.Student;


@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private Map<Long, Student> students = new ConcurrentHashMap<>();

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }

    @Override
    public Student findById(Long id) {
        return students.get(id);
    }

    @Override
    public void save(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public void deleteById(Long id) {
        students.remove(id);
    }

    @Override
    public void update(Student student) {
        students.put(student.getId(), student);
    }


}
