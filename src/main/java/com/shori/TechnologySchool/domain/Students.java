package com.shori.TechnologySchool.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class Students {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rollNo;
	private String name;
	private Integer student_id;

	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="department_id")

	private Department department;


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Integer getRollNo() {
		return rollNo;
	}


	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getStudent_id() {
		return student_id;
	}


	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	
	
	
	
}
