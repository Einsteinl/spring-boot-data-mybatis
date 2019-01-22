package com.lsl.springboot.controller;

import com.lsl.springboot.Mapper.DepartmentMapper;
import com.lsl.springboot.bean.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);

        return department;
    }
}
