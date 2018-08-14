package com.shori.TechnologySchool.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity

public class Students {

	private Integer rollNo;
	private String name;
	private Integer student_id;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Department department;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getname() {
		return name;
	}

	public void setname(String nameString) {
		this.name = nameString;
	}

	public Integer student_id() {
		return student_id;
	}

	public void student_id(Integer student_id) {
		this.student_id = student_id;
	}

}
