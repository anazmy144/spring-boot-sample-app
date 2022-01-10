package com.example.demo.api;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class   StudentController {
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService =studentService;
    }
    @GetMapping
    public List<Student> getStudent(){
        return studentService.getStudent() ;
    }
    @GetMapping("/add")
    public String addStudent(){
        studentService.saveStudent( new Student( "ahmed", 24, "ddd@ddd"  ) );
        return "Added!";
    }
}
