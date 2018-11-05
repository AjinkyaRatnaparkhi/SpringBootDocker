package com.example.SpringStarterDemo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringStarterDemo.Entity.Student;

@Repository
public interface StudentDAO extends CrudRepository<Student, Long> {

}
