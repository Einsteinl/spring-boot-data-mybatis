package com.lsl.springboot.controller;

import com.lsl.springboot.Mapper.EmployeeMapper;
import com.lsl.springboot.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;
    @GetMapping("/emp/{empId}")
    public Employee getEmp(@PathVariable("empId") Integer id){
        return employeeMapper.getEmpById(id);
    }
}
