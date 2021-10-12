package com.pctc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author H1PPPY
 * @date 2021/10/12 16:58
 */
@Controller
@RequestMapping("yourAction")
public class YourAction {
    @RequestMapping("yourOne")
    public String testYourOne(){
        System.out.println("testYourOne方法调用 InterceptAction");
        return "success";
    }
}
