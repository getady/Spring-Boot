package com.tns.cg.ady.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.cg.ady.entities.Placement;
import com.tns.cg.ady.services.PlacementService;

//  Mark class as Controller 
@RestController
public class PlacementController 
{
	
//  Autowired the PlacementService class
	@Autowired
	public PlacementService service;
	
//   RESTful API methods for Retrieval operations
//   Creating a get mapping that retrieves all the placements detail from the database
	 @GetMapping("/placements")
	 public List<Placement> list() 
	 {
	 return service.listAll();
	 }
	 
//   Creating a get mapping that retrieves the detail of a specific placement
	 @GetMapping("/placements/{id}")
	 public ResponseEntity<Placement> get(@PathVariable Integer id) 
	 {
	 try
	 {
	 Placement placement = service.get(id);
	 return new ResponseEntity<Placement>(placement, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 
//   RESTful API method for Create operation
//   Creating post mapping that post the placement detail in the database
	 @PostMapping("/placements")
	 public void add(@RequestBody Placement placement) 
	 {
	 service.save(placement);
	 }
	 
//   RESTful API method for Update operation
//   Creating put mapping that updates the placement detail
	 @PutMapping("/placements/{id}")
	 public ResponseEntity<?> update(@RequestBody Placement placement, 
			 						 @PathVariable Integer id) 
	 {
	 try
	 {
	 Placement existPlacement = service.get(id);
	 service.save(placement);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 
//   RESTful API method for Delete operation
//   Creating a delete mapping that deletes a specific placement
	 @DeleteMapping("/placements/{id}")
	 public void delete(@PathVariable Integer id) 
	 {
	 service.delete(id);
	 }
}
