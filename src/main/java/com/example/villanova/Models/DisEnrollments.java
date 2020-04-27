package com.example.villanova.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
@Entity
@Table(name="DisEnrollments")
public class DisEnrollments {
    private int studentId;
    private int courseId;
    @Column(name="DateTime",nullable = false)
    private Date dateTime;
    private String comment;

    public DisEnrollments(int studentId, int courseId, Date dateTime, String comment) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.dateTime = dateTime;
        this.comment = comment;
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

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
