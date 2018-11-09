package com.example.SpringStarterDemo.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student  {

	
	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID", unique = true, nullable = false)
	private Long id;
	private String name;
	private String qualification;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Student  \n  { id  : " + id + ", \n name : " + name + ", \n  qualification  :" + qualification + " \n }";
	}
	
}
