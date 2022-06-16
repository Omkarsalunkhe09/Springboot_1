package com.example.demo.Service;
import com.example.demo.entities.Course;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl(){
        list=  new ArrayList<>();
        list.add(new Course(123,"java course", "OOPS"));
        list.add(new Course(193,"React course", "PROPS"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourses(long courseId) {
        Course c = null;
        for(Course course : list){
            if(course.getId()==courseId){
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addourse(Course course) {
        list.add(course);
        return course;
    }
}
