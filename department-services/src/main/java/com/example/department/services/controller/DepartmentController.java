package com.example.department.services.controller;

import com.example.department.services.model.Department;
import com.example.department.services.services.DepartmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departmnets")
public class DepartmentController {

    @Autowired
    private DepartmentServices departmentServices;

    @PostMapping("/")
    public Department createDepartment(@RequestBody Department department){
       return departmentServices.createDepartment(department);
    }
    @GetMapping("/{id}")
    public Department getById(@PathVariable int id){
        return departmentServices.getById(id);

    }
}
