package com.tns.cg.ady.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.cg.ady.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> 
{

}
