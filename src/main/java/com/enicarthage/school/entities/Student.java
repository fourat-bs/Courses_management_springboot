package com.enicarthage.school.entities;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(name="student_sequence",
                       sequenceName ="student_sequence",
                        allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "student_sequence")
    private int cin;
    private String fullname;
    private String email;
    private String classe;
    private String password;
    private int phone;

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public  String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }


    public Student() {
    }

    public Student(String fullname, String email, String classe, String password, int phone) {
        this.fullname = fullname;
        this.email = email;
        this.classe = classe;
        this.password = password;
        this.phone = phone;
    }
    public Student(int cin, String fullname, String email, String classe, String password, int phone) {
        this.cin = cin;
        this.fullname = fullname;
        this.email = email;
        this.classe = classe;
        this.password = password;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "student{" +
                "cin=" + cin +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", classe='" + classe + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                '}';
    }




}
