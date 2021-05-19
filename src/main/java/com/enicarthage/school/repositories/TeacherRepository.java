package com.enicarthage.school.repositories;

import com.enicarthage.school.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    @Query("SELECT t from Teacher t where t.email =  ?1")
    Optional<Teacher> findStudentByEmail(String email);
}
