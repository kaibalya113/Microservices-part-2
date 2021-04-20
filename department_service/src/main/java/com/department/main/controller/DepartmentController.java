package com.department.main.controller;

import com.department.main.model.Department;
import com.department.main.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department save(@RequestBody Department department){
        log.info("callling department service..."+ department);
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/get")
    public List<Department> getAll(){
        return departmentService.getallDepartment();
    }

    @GetMapping("/{id}")
    public Optional<Department> findDepartmentById(@PathVariable("id") Long id){
        return departmentService.findDepartmentById(id);
    }
}
