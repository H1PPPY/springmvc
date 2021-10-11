package com.pctc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author H1PPPY
 * @date 2021/10/11 19:29
 */
@Controller
@RequestMapping("/antAction")
public class CheckAntAction {

    //*代表输入任意值都能够跳转
    @RequestMapping(value = "/*/createstudent", method = RequestMethod.GET)
    public String checkAntPath1() {
        System.out.println("/abc/createstudent、/xyz/createstudent");
        return "success";
    }


    @RequestMapping(value = "/**/createstudent1", method = RequestMethod.GET)
    public String checkAntPath2() {
        System.out.println("/xyz/abc/createstudent1、/abc/xyz/createstudent1");
        return "success";
    }


    @RequestMapping(value = "/createstudent2??", method = RequestMethod.GET)
    public String checkAntPath3() {
        System.out.println("/createstudent2ab、/createstudent2xy");
        return "success";
    }


}
