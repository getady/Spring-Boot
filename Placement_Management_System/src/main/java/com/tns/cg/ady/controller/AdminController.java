package com.tns.cg.ady.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.tns.cg.ady.entities.Admin;
import com.tns.cg.ady.services.AdminService;

@RestController
public class AdminController 
{
	@Autowired
	private AdminService service;
	
	
	//Restful API method for Retrival Operation
	@GetMapping("/Admins")
	public List<Admin> list()
	{
		return service.ListAll();
	}
	 
	@GetMapping("/Admins/{id}")
	public ResponseEntity<Admin> get(@PathVariable Integer id)
	{
		try
		{
			Admin admin = service.get(id);
			return new ResponseEntity<Admin>(admin, HttpStatus.OK);
		}
		catch (NoSuchElementException e) 
		{
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		} 		
	}
	
	// RESTful API method for Create operation
	 @PostMapping("/Admins")
	 public void add(@RequestBody Admin admin) 
	 {
		service.save(admin);
	 }
	 
	// RESTful API method for Update operation
	@PutMapping("/Admins/{id}")
	public ResponseEntity<?> update(@RequestBody Admin admin, @PathVariable Integer id)
	{
		try
		{
			Admin existadmin = service.get(id);
			service.save(admin);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	// RESTful API method for Delete operation
	 @DeleteMapping("/Admins/{id}")
	 public void delete(@PathVariable Integer id) 
	 {
		service.delete(id);
	 } 	 	
}