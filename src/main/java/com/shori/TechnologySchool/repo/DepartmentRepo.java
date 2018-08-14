package com.shori.TechnologySchool.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shori.TechnologySchool.domain.Department;
import com.shori.TechnologySchool.domain.Students;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {


}
