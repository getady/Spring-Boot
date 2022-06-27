package com.tns.cg.ady.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.cg.ady.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> 
{
	
}