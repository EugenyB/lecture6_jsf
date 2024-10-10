package ua.mk.berkut.lecture6_jsf.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import ua.mk.berkut.lecture6_jsf.data.Student;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Named
@SessionScoped
public class StudentBean implements Serializable {
    private Student student = new Student();

    public String sayHello() {
        return "hello";
    }

    public List<Student> getStudents() {
        return List.of(
                new Student(1, "John", 20),
                new Student(4, "Kate", 19),
                new Student(3, "Jake", 22),
                new Student(2, "Jane", 21)
        );
    }
}
