package com.shori.TechnologySchool.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shori.TechnologySchool.domain.Department;
import com.shori.TechnologySchool.domain.Students;

public interface StudentRepo extends JpaRepository<Students, Integer> {

	List<Department> findByName(String dept_name);


}
