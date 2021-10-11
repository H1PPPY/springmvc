package com.pctc.action;

import com.pctc.model.Address;
import com.pctc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author H1PPPY
 * @date 2021/10/11 19:16
 */
@Controller
@RequestMapping(value = "/hello")
@SessionAttributes(value = {"stu", "username"})
public class CheckSessionAttributes {
    @RequestMapping("/checkSessionAttributes")
    public String checkSessionAttributes(Map<String, Object> map) {
        Student student = new Student();
        student.setId(9);
        student.setUsername("熊腾");
        Address address = new Address();
        address.setProvince("江苏");
        address.setCity("南京");
        student.setAddress(address);

        map.put("stu", student);
        map.put("username", "H1PPPY");

        return "success";
    }

    @RequestMapping("check1")
    public String check1(Map<String, Object> map) {

        System.out.println(map.get("stu"));
        System.out.println(map.get("username"));

        return "success";
    }

    @RequestMapping("check2")
    public String check2(HttpSession session) {
        Student student = new Student();
        student.setId(9);
        student.setUsername("熊腾1");
        Address address = new Address();
        address.setProvince("江苏");
        address.setCity("南京");
        student.setAddress(address);

        session.setAttribute("stu", student);
        session.setAttribute("username", "熊腾1");

        return "success";
    }

    @RequestMapping("check3")
    public String check3(HttpSession session) {
        session.getAttribute("stu");
        session.getAttribute("username");

        return "success";
    }

    @RequestMapping("check4")
    public String check4(Map<String, Object> map, SessionStatus sessionStatus) {

        sessionStatus.setComplete();
        System.out.println(map.get("stu"));
        System.out.println(map.get("username"));


        return "success";
    }
}
