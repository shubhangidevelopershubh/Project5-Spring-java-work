package com.santosh.sms.springbootStudentMgtSysWithJPA;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int sid;
	private String sName;
	private String sCourse;
	private String sBloodGr;
	private String sgender;
	private double sFee;
	

	// Default Constructor
	public Student() {
		
	}
	
	public Student(int sid, String sName, String sCourse, String sBloodGr, String sgender, double sFee) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sCourse = sCourse;
		this.sBloodGr = sBloodGr;
		this.sgender = sgender;
		this.sFee = sFee;
	}


	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsCourse() {
		return sCourse;
	}

	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}

	public String getsBloodGr() {
		return sBloodGr;
	}

	public void setsBloodGr(String sBloodGr) {
		this.sBloodGr = sBloodGr;
	}

	public String getSgender() {
		return sgender;
	}

	public void setSgender(String sgender) {
		this.sgender = sgender;
	}

	public double getsFee() {
		return sFee;
	}

	public void setsFee(double sFee) {
		this.sFee = sFee;
	}

	
	
	
	}