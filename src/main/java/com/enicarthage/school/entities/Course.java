package com.enicarthage.school.entities;


import javax.persistence.*;

@Entity
@Table
public class Course {
    @Id
    @SequenceGenerator(name="course_sequence",
            sequenceName ="course_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "course_sequence")
    private int id;
    private String name;
    private String classe;
    private String teacher;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classe='" + classe + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Course(String name, String classe, String teacher) {
        this.name = name;
        this.classe = classe;
        this.teacher = teacher;
    }

    public Course() {
    }

    public Course(int id, String name, String classe, String teacher) {
        this.id = id;
        this.name = name;
        this.classe = classe;
        this.teacher = teacher;
    }
}
