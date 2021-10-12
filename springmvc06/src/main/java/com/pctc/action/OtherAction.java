package com.pctc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author H1PPPY
 * @date 2021/10/12 17:04
 */
@Controller
@RequestMapping("format")
public class OtherAction {

    @RequestMapping("formatOne")
    public String testFormatOne(){
        System.out.println("testFormatOne方法调用 InterceptAction");
        return "success";
    }
}
