package com.enicarthage.school.entities;

import javax.persistence.*;

@Entity
@Table
public class Teacher {
    @Id
    @SequenceGenerator(name="teacher_sequence",
            sequenceName ="teacher_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "teacher_sequence")
    private int cin ;
    private String fullname;
    private String email;
    private int phone;
    private String password;

    public Teacher(String fullname, String email, int phone, String password) {
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public Teacher() {
    }

    public Teacher(int cin, String fullname, String email, int phone, String password) {
        this.cin = cin;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
