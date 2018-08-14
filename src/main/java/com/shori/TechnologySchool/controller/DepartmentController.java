package com.shori.TechnologySchool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.shori.TechnologySchool.domain.Department;

import com.shori.TechnologySchool.repo.DepartmentRepo;

@RestController
@RequestMapping("/department")

public class DepartmentController {

	@Autowired
	private DepartmentRepo departmentRepo;

	@GetMapping("/findall")
	public List<Department> findall() {
		return departmentRepo.findAll();

	}

	// @GetMapping("/{dept_id}")
	// public Optional<Department> getDepartmentById(@PathVariable int dept_id)
	// {
	//
	// return departmentRepo.findById(dept_id);
	// }

	// add a dept

	@RequestMapping(value = "/adddepartment", method = RequestMethod.POST)
	public void addDepartment(@RequestBody Department department) {

	}

	// // delete dept
	//
	// @RequestMapping(value = "/delete/{dept_id}", method =
	// RequestMethod.DELETE)
	// public void deleteDepartment(@PathVariable int dept_id) {
	// departmentRepo.deleteById(dept_id);
	//
	// }
}