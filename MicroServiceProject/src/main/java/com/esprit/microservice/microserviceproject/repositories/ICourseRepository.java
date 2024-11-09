package com.esprit.microservice.microserviceproject.repositories;

import com.esprit.microservice.microserviceproject.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICourseRepository extends JpaRepository<Course, Long> {



}
