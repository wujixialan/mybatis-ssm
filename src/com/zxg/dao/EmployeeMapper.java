package com.zxg.dao;

import com.zxg.mybatis.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by zxg on 2017/5/23.
 * @author zxg
 */
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);
    public List<Employee> getEmps();
}
