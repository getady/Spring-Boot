package com.ady.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	private String mailid;
	
	
	public Student() 
	{
		
	}

	public Student(Integer sid, String sname, String mailid) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.mailid = mailid;
	}
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", mailid=" + mailid + "]";
	}
	
	
	
	
	
}
