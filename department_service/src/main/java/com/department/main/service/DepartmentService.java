package com.department.main.service;

import com.department.main.dao.DepartmentDao;
import com.department.main.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    public Department saveDepartment(Department department){
        return departmentDao.save(department);
    }

    public List<Department> getallDepartment() {
        return departmentDao.findAll();
    }

    public Optional<Department> findDepartmentById(Long id) {
        return departmentDao.findById(id);
    }
}
