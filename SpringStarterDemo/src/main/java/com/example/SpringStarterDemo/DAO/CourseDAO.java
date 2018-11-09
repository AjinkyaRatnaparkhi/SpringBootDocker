package com.example.SpringStarterDemo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringStarterDemo.Entity.Course;

@Repository
public interface CourseDAO extends JpaRepository<Course, Long> {

	List<Course> findByStudentId(Long student_id);
	
}
