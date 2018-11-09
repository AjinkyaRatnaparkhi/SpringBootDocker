package com.example.SpringStarterDemo.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.SpringStarterDemo.Entity.Course;
import com.example.SpringStarterDemo.Entity.Student;

@Component
public class StudentDAOImpl{

	@Autowired
	 private StudentDAO studentDAO;
	

	@Autowired
	 private CourseDAO courseDAO;
	
	
	public List<Student> getStudents(){
		
		
		Iterable<Student> list = studentDAO.findAll();
		List<Student> studentsList = new ArrayList<Student>();
		list.forEach(studentsList::add);
	
		return studentsList;
		
	}
	
	
	public List<Course> getCourses(Long student_id){
		
	
		return  courseDAO.findByStudentId(student_id);
		
	}
	
	
}
