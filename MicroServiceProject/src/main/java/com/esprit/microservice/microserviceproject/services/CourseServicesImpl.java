package com.esprit.microservice.microserviceproject.services;

import com.esprit.microservice.microserviceproject.entities.Course;
import com.esprit.microservice.microserviceproject.repositories.ICourseRepository;
import lombok.AllArgsConstructor;
import lombok.Generated;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Generated

public class CourseServicesImpl implements  ICourseServices{

    private ICourseRepository courseRepository;

    @Override
    public List<Course> retrieveAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        return courseRepository.findById(numCourse).orElse(null);
    }

    @Override
    public void removeCourse(Long numCourse) {  courseRepository.deleteById(numCourse);}

}
