package com.example.SpringStarterDemo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringStarterDemo.DAO.StudentDAO;
import com.example.SpringStarterDemo.Entity.Student;

@RestController
public class SpringDemoController {

	@Autowired
	 private StudentDAO studentDAO;
	
	@RequestMapping("/")
	public String getHello() {
		return "HI Spring Starter Demo";
	}
	
	
	@RequestMapping("/Students")
	public String getStudents() {
		
		StringBuffer sb =new StringBuffer();
		
		sb.append(" List Of Students ");
		sb.append("\n");
		
		Iterable<Student> list = studentDAO.findAll();
		
		for(Student s : list) {
			
			sb.append(s.toString());
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
}
