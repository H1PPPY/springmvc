package com.pctc.action;

import com.pctc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author H1PPPY
 * @date 2021/10/9 10:54
 */
@Controller
@RequestMapping("/first")
public class FirstHandle {

    @RequestMapping(value = "/checkParams",params = {"username","height=100"})
    public String checkParam(){
        System.out.println("checkParam");
        return "success";
    }

    @RequestMapping(value = "checkRequestParam")
    public String testRequestParam(@RequestParam(value = "username") String user,
                                   @RequestParam(value = "age",required = false,defaultValue = "10") int age){
        System.out.println("username:" + user +"\n"+ "age:" + age);
        return "success";
    }
    @RequestMapping("checkRequestParam1")
    public String testCheckRequestParam1(@RequestParam(value = "name") String username,//url传值时参数名是name不是username
                                         @RequestParam(value = "age",required = false,defaultValue = "10") int age,
                                         //url不传age的值时,默认为age=10
                                         double salary){
        System.out.println(username + age + salary);
        return "success";
    }

    @RequestMapping(value ="/checkPojo",method= RequestMethod.POST)
    public String testPojo(Student student) {
        System.out.println("testPojo: " + student);
        return "success";
    }
}
