package com.shori.TechnologySchool.domain;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;

import org.springframework.stereotype.Service;

@Service
@Entity
public class Department {

	private Integer dept_id;

	private String dept_name;

	private Students students;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	public Integer getDept_id() {
		return dept_id;
	}

	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

}
