package com.imooc.oa.controller;

import com.imooc.oa.biz.GlobalBiz;
import com.imooc.oa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2019/12/13.
 */
@Controller("globalController")
public class GlobalController {
    @Autowired
    GlobalBiz globalBiz;

    @RequestMapping("/to_login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, @RequestParam String sn, @RequestParam String password) {  //接收用户提交的多个信息
        Employee employee = globalBiz.login(sn, password);
        if (employee == null) {
            return "redirect:to_login";
        } else {
            session.setAttribute("employee", employee);
            return "redirect:self";
        }
    }

    @RequestMapping("/quit")
    public String logout(HttpSession session) {  //接收用户提交的多个信息
        session.setAttribute("employee", null);
        return "redirect:to_login";
    }

    @RequestMapping("/self")
    public String self() {
        return "self";
    }

    @RequestMapping("/to_change_password")
    public String tochangePassword() {
        return "change_password";
    }


    @RequestMapping("/change_password")
    public String changePassword(HttpSession session, @RequestParam String old, @RequestParam String new1, @RequestParam String new2) {
        Employee employee = (Employee) session.getAttribute("employee");
        if (employee.getPassword().equals(old)) {
            if (new1.equals(new2)) {
                employee.setPassword(new1);
                globalBiz.changePassword(employee);
                return "redirect:self";
            }
        }
        return "redirect:to_change_password";
    }
}
