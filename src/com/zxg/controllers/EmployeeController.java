package com.zxg.controllers;

import com.zxg.mybatis.Employee;
import com.zxg.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by zxg on 2017/6/9.
 */
@Controller
public class EmployeeController {
    private EmployeeService employeeService;

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("emps-list")
    public String emps(Map<String, Object> map) {
        List<Employee> employeeList = employeeService.getEmps();
        map.put("emps", employeeList);
        return "list";
    }

    @RequestMapping("/list")
    public String list() {
        return "redirect:index.jsp";
    }
}
