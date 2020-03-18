package com.imooc.oa.biz;

import com.imooc.oa.entity.Employee;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/12/13.
 */

public interface GlobalBiz {
    Employee login(String sn, String password);

    void changePassword(Employee employee);

}
