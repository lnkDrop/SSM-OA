package com.imooc.oa.biz.impl;

import com.imooc.oa.biz.DepartmentBiz;
import com.imooc.oa.dao.DepartmentDao;
import com.imooc.oa.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/12/11.
 */

@Service("departmentBiz")
public class DepartmentBizImpl implements DepartmentBiz {
    @Autowired
    DepartmentDao departmentDao;

    public void add(Department department) {
        departmentDao.insert(department);
    }

    public void edit(Department department) {
        departmentDao.update(department);
    }

    public void remove(String sn) {
        departmentDao.delete(sn);
    }

    public Department get(String sn) {
        Department department = departmentDao.select(sn);
        return department;
    }

    public List<Department> getAll() {
        List<Department> departments = departmentDao.selectAll();
        return departments;
    }
}
