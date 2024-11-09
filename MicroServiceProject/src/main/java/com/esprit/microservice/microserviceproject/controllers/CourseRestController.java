package com.esprit.microservice.microserviceproject.controllers;

import com.esprit.microservice.microserviceproject.entities.Course;
import com.esprit.microservice.microserviceproject.services.ICourseServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseRestController {
    
private final ICourseServices iCourseServices;
    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course){
        return  iCourseServices.addCourse(course);
    }

    @GetMapping("/all")
    public List<Course> getAllCourses(){
        return iCourseServices.retrieveAllCourses();
    }

    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course){
        return  iCourseServices.updateCourse(course);
    }

    @GetMapping("/get/{id-course}")
    public Course getById(@PathVariable("id-course") Long numCourse){
        return iCourseServices.retrieveCourse(numCourse);}

    @DeleteMapping("/delete/{id-course}")
    public void deleteById(@PathVariable("id-course") Long numCourse){
        iCourseServices.removeCourse(numCourse); }

}
