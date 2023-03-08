package student.student.Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Student {
    
    @Id
    
    private Long id;
    private String name;
    private String lastName;
    private String city;
    private int age;
    private String subject;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // {
    //     "id": 1,
    //     "name": "Student1",
    //     "lastName": "StudentSurname1",
    //     "city": "Aurangabad",
    //     "age": "22",
    //     "subject": "Java"
        
    // }
    
    //http://localhost:8080/students

}
