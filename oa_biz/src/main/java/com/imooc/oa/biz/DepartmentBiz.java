package com.imooc.oa.biz;

import com.imooc.oa.entity.Department;

import java.util.List;

/**
 * Created by Administrator on 2019/12/11.
 */
public interface DepartmentBiz {
    void add(Department department);

    void edit(Department department);

    void remove(String sn);

    Department get(String sn);

    List<Department> getAll();
}
