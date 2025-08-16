package com.bhaskar.Security.Controller;

import com.bhaskar.Security.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    private List<Student> students = new ArrayList<>( List.of(new Student("hehe",89,79))) ;


    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student ){
        students.add(student);
        return student;
    }
}
