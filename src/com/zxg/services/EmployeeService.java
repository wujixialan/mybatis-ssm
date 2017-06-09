package com.zxg.services;

import com.zxg.mybatis.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zxg on 2017/6/9.
 */
@Service
public interface EmployeeService {
    List<Employee> getEmps();
}
