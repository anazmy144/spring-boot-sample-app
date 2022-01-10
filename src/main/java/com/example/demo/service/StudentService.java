package com.example.demo.service;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repo.StudentRepo;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;
    @Autowired
    StudentService(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }
    public List<Student> getStudent(){
        return studentRepo.findAll();
    }
    public void saveStudent(Student student){
         studentRepo.save(student);
    }
}
