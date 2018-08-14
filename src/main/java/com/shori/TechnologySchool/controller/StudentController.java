package com.shori.TechnologySchool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.shori.TechnologySchool.domain.Department;
import com.shori.TechnologySchool.domain.Students;
import com.shori.TechnologySchool.repo.DepartmentRepo;
import com.shori.TechnologySchool.repo.StudentRepo;

@RestController
@RequestMapping("/students")

public class StudentController {

	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private DepartmentRepo departmentRepo;

	@GetMapping("/findallstudents/{branchName}")
	public List<Students> getStudents(@PathVariable String branchName) {

		return studentRepo.findByName(branchName);

	}

	// inject data

	// @RequestMapping(value = "/update/{name}", method = RequestMethod.POST)
	@PostMapping("/update/{name}")
	public Students addStudent(@RequestBody Students students, @PathVariable String name) {
		Department dp = new Department();

		dp.setDept_name("elec");
		departmentRepo.save(dp);

		students.setname(name);
		return studentRepo.save(students);

	}

}
