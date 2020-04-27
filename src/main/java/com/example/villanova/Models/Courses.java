package com.example.villanova.Models;

import javax.persistence.*;

@Entity
@Table(name="Course")
public class Courses {
    @Id
    private int courseId;
    @Column(name="courseName",nullable = false)
    private String name;
    @Column(name="courseCredits",nullable = false)
    private int credits;
    @OneToOne
    @JoinColumn(name="courseId")
    private Enrollments enrollments;
    @OneToOne
    @JoinColumn(name="courseId")
    private DisEnrollments disEnrollments;

    public Courses() {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Enrollments getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(Enrollments enrollments) {
        this.enrollments = enrollments;
    }

    public DisEnrollments getDisEnrollments() {
        return disEnrollments;
    }

    public void setDisEnrollments(DisEnrollments disEnrollments) {
        this.disEnrollments = disEnrollments;
    }
}
