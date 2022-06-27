package com.tns.cg.ady.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//  Mark class as an Entity   
@Entity
@Table(name = "placement")
public class Placement implements Serializable
{
	private static final long serialVersionUID = 1L;
//	Defining id as primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "date")
	private String date;
	@Column(name = "qualification")
	private String qualification;
	@Column(name = "year")
	private Integer year;
	
//	Mapping
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "college_id")
	private College college;
	
	
	public Placement() 
	{
		
	}
	 public Placement(Integer id, String name, String college, String date, 
			 			String qualification, Integer year) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.qualification = qualification;
		this.year = year;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", college=" + 
				college + ", date=" + date + ", qualification="
				+ qualification + ", year=" + year + "]";
	}
	
}
