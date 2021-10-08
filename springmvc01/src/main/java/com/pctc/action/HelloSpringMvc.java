package com.pctc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author H1PPPY
 * @date 2021/10/8 17:06
 */
@Controller
public class HelloSpringMvc {

    @RequestMapping("/first")
    public String firstHandler() {
        return "success";
    }
}
