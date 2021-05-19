package com.enicarthage.school.services;

import com.enicarthage.school.entities.Student;
import com.enicarthage.school.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class StudentService {
    private final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public  void addNewStudent(Student s) {
       Optional<Student> studentByEmail = studentRepository.findStudentByEmail(s.getEmail());
       if (studentByEmail.isPresent()){
           throw new IllegalStateException("email already exists");
       }
        studentRepository.save(s);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void deleteStudent(Integer studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists){
            throw new IllegalStateException(
                    "student with id " + studentId+ " does not exists"
            );
        }
        studentRepository.deleteById(studentId);
    }

    public void updateStudent(Integer studentId) {
    }
}
