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
@Table(name = "student")
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
//	@Column(name = "name")
	private String name;
//	@Column(name = "roll")
	private Integer roll;
//	@Column(name = "qualification")
	private String qualification;
//	@Column(name = "course")
	private String course;
//	@Column(name = "year")
	private Integer year;
//	@Column(name = "hallTicketNo")
	private Integer hallTicketNo;
	
//	Mapping
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "college_id")
	private College college;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "certificate_id")
	private Certificate certificate;
	
	
	public Student() 
	{
		
	}

	public Student(Integer id, String name, String college, Integer roll, String qualification, String course,
			Integer year, String certificate, Integer hallTicketNo) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.hallTicketNo = hallTicketNo;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getHallTicketNo() {
		return hallTicketNo;
	}

	public void setHallTicketNo(Integer hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", roll=" + roll + ", qualification="
				+ qualification + ", course=" + course + ", year=" + year + ", certificate=" + certificate
				+ ", hallTicketNo=" + hallTicketNo + "]";
	}
	
	
}
