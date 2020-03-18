package com.imooc.oa.biz;

import com.imooc.oa.entity.Department;
import com.imooc.oa.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/12/11.
 */
public interface EmployeeBiz {
    void add(Employee employee);

    void edit(Employee employee);

    void remove(String sn);

    Employee get(String sn);

    List<Employee> getAll();
}
