package com.enicarthage.school.controllers;

import com.enicarthage.school.entities.Student;
import com.enicarthage.school.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "admin/")
public class AdminController {
    private final StudentService studentService;
    @Autowired
    public AdminController(StudentService studentService) {
        this.studentService = studentService;
    }
    @RequestMapping(path="student/")
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
