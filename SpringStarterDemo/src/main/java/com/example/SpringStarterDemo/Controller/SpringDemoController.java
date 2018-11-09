package com.example.SpringStarterDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringStarterDemo.DAO.StudentDAOImpl;
import com.example.SpringStarterDemo.Entity.Course;
import com.example.SpringStarterDemo.Entity.Student;

@RestController
public class SpringDemoController {

	
	@Autowired
	private StudentDAOImpl studentDAOImpl;
	
	
	@RequestMapping("/")
	public String getHello() {
		return "HI Spring Starter Demo";
	}
	
	
	@RequestMapping("/GetStudents")
	public List<Student> getStudentsList() {
		
		List<Student> studentsList = studentDAOImpl.getStudents();
		
		 return studentsList;
	
	}
	
	@RequestMapping("/Student/{id}/courses")
	public List<Course> getCourseList(@PathVariable(value="id") Long studentId) {
		
		List<Course> courseList = studentDAOImpl.getCourses(studentId);
		
		 return courseList;
	
	}
	
}
