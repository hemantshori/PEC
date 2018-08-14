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

	@GetMapping("/findallstudents/{dept_name}")
	public List<Department> getStudents(@PathVariable String dept_name) {

		return studentRepo.findByName(dept_name);

	}

	// inject data

	// @RequestMapping(value = "/update/{name}", method = RequestMethod.POST)
	@PostMapping("/update/{name}/{dept_id}")
	public void addStudent(@RequestBody Students students, @PathVariable String name,@PathVariable Integer dept_id) {
		Department dp = new Department();
		Students sp = new Students();
		sp.setName(name);
		sp.setStudent_id(dept_id);
		dp.setDept_id(dept_id);
		departmentRepo.save(dp);
		studentRepo.save(sp);

	
		

	}

}
