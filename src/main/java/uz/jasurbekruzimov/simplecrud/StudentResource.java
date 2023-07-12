package uz.jasurbekruzimov.simplecrud;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class StudentResource {
    @GetMapping("/students")
    public ResponseEntity getAll() {
        Student student = new Student("1", "Jasurbek", "Ruzimov", "TTP-1", "IT", "4");
        Student student1 = new Student("2", "Jasurbek", "Ruzimov", "TTP-1", "IT", "4");
        Student student2 = new Student("3", "Jasurbek", "Ruzimov", "TTP-1", "IT", "4");
        Student student3 = new Student("4", "Jasurbek", "Ruzimov", "TTP-1", "IT", "4");
        Student student4 = new Student("5", "Jasurbek", "Ruzimov", "TTP-1", "IT", "4");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);




        return ResponseEntity.ok(students);
    }

}
