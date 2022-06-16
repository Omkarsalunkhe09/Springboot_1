package com.example.demo.Service;

import com.example.demo.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourses(long courseId);

    public Course addourse(Course course);
}
