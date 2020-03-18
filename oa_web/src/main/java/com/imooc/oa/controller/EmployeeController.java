package com.imooc.oa.controller;

import com.imooc.oa.biz.DepartmentBiz;
import com.imooc.oa.biz.EmployeeBiz;
import com.imooc.oa.entity.Employee;
import com.imooc.oa.global.Contant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Administrator on 2019/12/11.
 */
@Controller("employeeController")
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeBiz employeeBiz;
    @Autowired
    private DepartmentBiz departmentBiz;


    @RequestMapping("/list")
    public String list(Map<String, Object> map) {
        map.put("list", employeeBiz.getAll());
        return "employee_list";
    }

    @RequestMapping("/to_add")
    public String toAdd(Map<String, Object> map) {
        map.put("employee", new Employee());
        map.put("dlist", departmentBiz.getAll());
        map.put("plist", Contant.getPosts());
        return "employee_add";
    }


    @RequestMapping("/add")
    public String add(Employee employee) {
        employeeBiz.add(employee);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update", params = "sn")
    public String toUpdate(String sn, Map<String, Object> map) {
        map.put("employee", employeeBiz.get(sn));
        map.put("dlist", departmentBiz.getAll());
        map.put("plist", Contant.getPosts());
        return "employee_update";
    }

    @RequestMapping("/update")
    public String update(Employee employee) {
        employeeBiz.edit(employee);
        return "redirect:list";
    }

    @RequestMapping(value = "/remove", params = "sn")
    public String remove(String sn) {
        employeeBiz.remove(sn);
        return "redirect:list";
    }
}
