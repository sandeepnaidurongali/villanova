package com.example.villanova.Models;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name="Student")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    @Column(name="StudentName",nullable = false)
    private String name;
    @Column(unique = true,nullable = false)
    private String email;

    @OneToMany(cascade=CascadeType.ALL, targetEntity=Enrollments.class)
    @JoinColumn(name="studentId")
    private Set<Enrollments> Enrollments = new TreeSet<>();
    @OneToMany(cascade=CascadeType.ALL, targetEntity=DisEnrollments.class)
    @JoinColumn(name="studentId")
    private Set<Enrollments> DisEnrollements = new TreeSet<>();
    private int enrollment;
    private int disEnrolment;

    public Students() {
    }

    public Set<com.example.villanova.Models.Enrollments> getEnrollments() {
        return Enrollments;
    }

    public void setEnrollments(Set<com.example.villanova.Models.Enrollments> enrollments) {
        Enrollments = enrollments;
    }

    public Set<com.example.villanova.Models.Enrollments> getDisEnrollements() {
        return DisEnrollements;
    }

    public void setDisEnrollements(Set<com.example.villanova.Models.Enrollments> disEnrollements) {
        DisEnrollements = disEnrollements;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public int getDisEnrolment() {
        return disEnrolment;
    }

    public void setDisEnrolment(int disEnrolment) {
        this.disEnrolment = disEnrolment;
    }
}
