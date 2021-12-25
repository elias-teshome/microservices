package com.example.department.services.repository;

import com.example.department.services.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Integer> {
}
