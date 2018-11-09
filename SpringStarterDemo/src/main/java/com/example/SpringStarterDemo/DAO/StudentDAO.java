package com.example.SpringStarterDemo.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringStarterDemo.Entity.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Long> {

}
