package student.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import student.student.Entity.Student;

@Repository
public interface UserRepository extends JpaRepository<Student , Long> {


}
