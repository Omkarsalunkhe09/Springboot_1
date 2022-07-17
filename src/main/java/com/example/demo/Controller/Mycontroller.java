package com.example.demo.Controller;

import com.example.demo.Service.CourseService;
import com.example.demo.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontroller {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "this is home page guyzz";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.courseService.getCourses(Long.parseLong(courseId));
    }

    ;

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course x) {
        return this.courseService.addourse(x);
    }

    @DeleteMapping("/courses/{courseId}")
    public String delte() {
        return "Sucessfully Deleted";
    }
}
