package com.tns.cg.ady.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.cg.ady.entities.Admin;
import com.tns.cg.ady.repositories.AdminRepository;

@Service
@Transactional
public class AdminService 
{
	@Autowired
	private AdminRepository repo;
	
	public List<Admin>ListAll()
	{
		return repo.findAll();
	}
	public void save(Admin admin)
	{
		repo.save(admin);	
	}
	public Admin get(Integer id)
	{
		return repo.findById(id).get();
	}
	public void delete(Integer id)
	{
		repo.deleteById(id);
	} 

	

}