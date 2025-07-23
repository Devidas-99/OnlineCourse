package com.practice.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registrations")
public class Online {
	
	@Id
	private int id;
	
	private String studentName;
	
	private String courseName;
	
	private double feesPaid;
	
	private String registrationDate;
	
	
	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	

	public double getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}

	@Override
	public String toString() {
		return "Online [id=" + id + ", studentName=" + studentName + ", courseName=" + courseName + ", feesPaid="
				+ feesPaid + ", registrationDate=" + registrationDate + "]";
	}

	
	
	
	
	
}
