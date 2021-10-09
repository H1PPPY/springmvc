package com.pctc.action;

import com.pctc.model.Address;
import com.pctc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Map;

/**
 * @author H1PPPY
 * @date 2021/10/9 17:04
 */
@Controller
@RequestMapping("/first")
public class Handler {

    @RequestMapping("/checkServlet")
    public void checkServlet(HttpServletRequest request,
                             HttpServletResponse response, Writer out) throws IOException {
        System.out.println("checkServlet:" + request + response);
        System.out.println(request.getParameter("id"));
        System.out.println(request.getParameter("username"));
        out.write("hello springmvc");
    }

    @RequestMapping("/checkServlet1")
    public String checkServlet1(HttpServletRequest request,
                             HttpServletResponse response) {
        System.out.println("checkServlet1:" + request + response);
        System.out.println(request.getParameter("id"));
        System.out.println(request.getParameter("username"));
        return "success";
    }

    @RequestMapping("/checkModelAndView")
    public ModelAndView checkModelAndView(){
        ModelAndView modelAndView = new ModelAndView();

        Student student = new Student();
        Address address = new Address();
        address.setCity("江西");
        address.setProvince("南昌");
        student.setId(9);
        student.setAge(20);
        student.setUsername("熊腾");
        student.setEmail("17327327238@189.com");
        student.setAddress(address);

        modelAndView.addObject("stu",student);
        modelAndView.setViewName("success1");
        return modelAndView;
    }

    @RequestMapping("/checkMap")
    public String checkMap(Map<String,Object> map){
        System.out.println(map.getClass().getName());

        map.put("usernames", Arrays.asList("bantang","lisi","wanger"));

        Student student = new Student();
        Address address = new Address();
        address.setCity("江西");
        address.setProvince("南昌");
        student.setId(9);
        student.setAge(20);
        student.setUsername("熊腾");
        student.setEmail("17327327238@189.com");
        student.setAddress(address);
        map.put("stu",student);

        map.put("username","熊腾");

        return "success2";
    }

    @RequestMapping("/checkModel")
    public String checkModel(Model model){
        model.addAttribute("usernames", Arrays.asList("bantang","lisi","wanger"));

        Student student = new Student();
        Address address = new Address();
        address.setCity("江西");
        address.setProvince("南昌");
        student.setId(9);
        student.setAge(20);
        student.setUsername("熊腾");
        student.setEmail("17327327238@189.com");
        student.setAddress(address);

        model.addAttribute("username","熊腾");

        model.addAttribute("stu",student);

        return "success3";
    }

    @RequestMapping("/checkModelMap")
    public String checkModelMap(ModelMap modelMap){
        modelMap.addAttribute("usernames", Arrays.asList("bantang","lisi","wanger"));

        Student student = new Student();
        Address address = new Address();
        address.setCity("江西");
        address.setProvince("南昌");
        student.setId(9);
        student.setAge(20);
        student.setUsername("熊腾");
        student.setEmail("17327327238@189.com");
        student.setAddress(address);

        modelMap.addAttribute("username","熊腾");

        modelMap.addAttribute("stu",student);

        return "success3";

    }
}
