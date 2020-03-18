package com.imooc.oa.dao;

import com.imooc.oa.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2019/12/11.
 */

@Repository("departmentDao")
public interface DepartmentDao {
    void insert(Department department);

    void delete(String sn);

    void update(Department department);

    Department select(String sn);

    List<Department> selectAll();
}
