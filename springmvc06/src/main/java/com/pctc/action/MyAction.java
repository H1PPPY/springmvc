package com.pctc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author H1PPPY
 * @date 2021/10/12 16:42
 */
@Controller
@RequestMapping("myAction")
public class MyAction {

    @RequestMapping("myOne")
    public String testMyOne(){
        System.out.println("testMyOne方法调用 InterceptAction");
        return "success";
    }

}
