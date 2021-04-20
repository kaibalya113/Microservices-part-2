package com.department.main.dao;

import com.department.main.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {
    //Department findDepartmentById(Long id);
}
