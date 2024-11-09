package com.esprit.microservice.microserviceproject.services;



import com.esprit.microservice.microserviceproject.entities.Course;

import java.util.List;

public interface ICourseServices {

    List<Course> retrieveAllCourses();

    Course  addCourse(Course  course);

    Course updateCourse(Course course);

    Course retrieveCourse(Long numCourse);

    void removeCourse(Long numCourse);
    }


