package com.lsl.springboot.Mapper;

import com.lsl.springboot.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void saveEmp(Employee employee);
}
