package com.example.villanova.Controllers;

import com.example.villanova.Models.Courses;
import com.example.villanova.Models.Enrollments;
import com.example.villanova.Models.Students;
import com.example.villanova.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/student")
public class StudentRegistration {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping(value="/getStudents")
    public List<Students> getStudents()
    {
       return (List<Students>) studentRepository.findAll();
    }
    @PostMapping(value="/addStudent")
    public Students addStudent()
    {
        Students student=new Students();
        student.setName("sandeep");
        student.setEmail("srongali@villanova.edu");
        System.out.println("asdfg"+student.getName());
         studentRepository.save(student);
         return student;
    }
    @PostMapping(value="/addCourses")
    public void addCourses()
    {
        Courses course=new Courses();
         course.setName("physics");
         course.setCredits(3);
        Enrollments enrollments=new Enrollments();


    }

}
