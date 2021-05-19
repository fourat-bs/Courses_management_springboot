package com.enicarthage.school.controllers;

import com.enicarthage.school.entities.Student;
import com.enicarthage.school.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "api/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentSrv) {
        this.studentService = studentSrv;
    }

    @GetMapping
    public List<Student> getStudents(){
     return this.studentService.getStudents();
    }

    @PostMapping
    public void register(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId) {
        studentService.deleteStudent(studentId);
    }
    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId) {
        studentService.updateStudent(studentId);
    }
}
