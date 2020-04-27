package com.example.villanova.Models;

import javax.persistence.*;

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
    @OneToMany(mappedBy = "studentId",cascade = CascadeType.ALL)
    private Enrollments Enrollments;
    @OneToMany(mappedBy = "studentId",cascade = CascadeType.ALL)
    private DisEnrollments DisEnrollements;
    private int enrollment;
    private int disEnrolment;

    public Students(int studentId, String name, String email, com.example.villanova.Models.Enrollments enrollments, DisEnrollments disEnrollements, int enrollment, int disEnrolment) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        Enrollments = enrollments;
        DisEnrollements = disEnrollements;
        this.enrollment = enrollment;
        this.disEnrolment = disEnrolment;
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

    public com.example.villanova.Models.Enrollments getEnrollments() {
        return Enrollments;
    }

    public void setEnrollments(com.example.villanova.Models.Enrollments enrollments) {
        Enrollments = enrollments;
    }

    public DisEnrollments getDisEnrollements() {
        return DisEnrollements;
    }

    public void setDisEnrollements(DisEnrollments disEnrollements) {
        DisEnrollements = disEnrollements;
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
