package com.zxg.services.impl;

import com.zxg.dao.EmployeeMapper;
import com.zxg.mybatis.Employee;
import com.zxg.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zxg on 2017/6/9.
 */
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeMapper employeeMapper;

    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<Employee> getEmps() {
        System.out.println(employeeMapper);
        return employeeMapper.getEmps();
    }
}
