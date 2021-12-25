package com.example.department.services.services;

import com.example.department.services.model.Department;
import com.example.department.services.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServices {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(Department department) {
      return   departmentRepository.save(department);
    }

    public Department getById(int id) {
        return departmentRepository.findById(id).get();
    }
}
