package com.wipro.hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name = "studid")
	private Integer studentId;
	
	@Column(name = "sname")
	private String studentName;
	
	@Column(name = "mobile")
	private String studentMobile;

	public Student() {
		super();
	}

	public Student(Integer studentId, String studentName, String studentMobile) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMobile = studentMobile;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	@Override
	public String toString() {
		return String.format("Student [ %-4d   %-15s   %-10s ]", studentId, studentName, studentMobile);
	}

}
