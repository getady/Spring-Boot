package com.tns.cg.ady.services;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.cg.ady.entities.Placement;
import com.tns.cg.ady.repositories.PlacementRepository;

// defining the business logic 
@Service
@Transactional
public class PlacementService 
{
	@Autowired
	private PlacementRepository repo;
	
//  getting all placement record by using the method findAll() of JpaRepository  
	public List<Placement> listAll() 
	 {
	 return repo.findAll();
	 }
	
//	 getting a specific record by using the method findById() of CrudRepository  
	 public Placement get(Integer id) 
	 {
	 return repo.findById(id).get();
	 }
	
//   saving a specific record by using the method save() of CrudRepository  
	 public void save(Placement placement) 
	 {
	 repo.save(placement);
	 }

	 
//   deleting a specific record by using the method deleteById() of CrudRepository 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }
}
