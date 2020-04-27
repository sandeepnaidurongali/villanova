package com.example.villanova.Models;

import javax.persistence.*;

@Entity
@Table(name="Enrollments")
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int enrollmentId;
    private int studentId;
    private int courseId;
    @Enumerated(EnumType.ORDINAL)
    private Grade grade;

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
