package com.ady.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ady.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
	
}
