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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "certificate")
public class Certificate implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "year")
	private String year;

//  Mapping
	@OneToOne(mappedBy="certificate")
	private Student student;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "college_id")
	private College college;
	
	public Certificate()
	{

	}
	public Certificate(Integer id, String year, String college) {
	super();
	this.id = id;
	this.year = year;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
		}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
	this.year = year;
	}
	
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", year=" + year + ", college=" + college + "]";
	}


}
