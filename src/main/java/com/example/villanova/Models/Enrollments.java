package com.example.villanova.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Enrollments")
public class Enrollments {
    private int studentId;
    private int courseId;
    private Grade grade;

    public Enrollments(int studentId, int courseId, Grade grade) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.grade = grade;
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
