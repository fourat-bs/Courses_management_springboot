package com.enicarthage.school.configuration;

import com.enicarthage.school.entities.Student;
import com.enicarthage.school.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class GlobalConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
       return args -> {
           Student m = new Student(
                   "student1",
                   "student1@gmail.com",
                   "2eme info A",
                   "azerty",
                   4555
           );

           studentRepository.saveAll(
                   List.of(m)
           );
       };
    }
}
