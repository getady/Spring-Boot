package com.tns.cg.ady.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.cg.ady.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> 
{

}
