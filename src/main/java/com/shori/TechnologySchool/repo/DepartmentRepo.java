package com.shori.TechnologySchool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shori.TechnologySchool.domain.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}