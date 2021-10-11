package com.pctc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author H1PPPY
 * @date 2021/10/11 19:17
 */
@Controller
@RequestMapping(value = "/hello")
public class CheckForwardAndRedirect {
    @RequestMapping("/checkRedirect")//重定向
    public String checkRedirect(HttpServletRequest request) {
        System.out.println("checkRedirect");
        request.setAttribute("username", "pkd");
        return "redirect:/index.jsp";
    }


    @RequestMapping("/checkForward")//转发
    public String checkForward(HttpServletRequest request) {
        System.out.println("checkForward");
        request.setAttribute("username", "pkd");
        return "forward:/index.jsp";
    }


    @RequestMapping("/checkForwardAction")//转发到处理器
    public String checkForwardAction() {
        System.out.println("checkForwardAction");
        return "forward:/hello/check2";
    }


    @RequestMapping("/checkRedirectAction")//重定向到处理器
    public String checkRedirectAction() {
        System.out.println("checkRedirectAction");
        return "redirect:/hello/checkRedirect";
    }
}
