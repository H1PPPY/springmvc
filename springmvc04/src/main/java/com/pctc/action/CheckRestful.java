package com.pctc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author H1PPPY
 * @date 2021/10/11 19:18
 */
@Controller
@RequestMapping(value = "/hello")
public class CheckRestful {
    //http://localhost:8080/springmvc04/hello/checkRestful
    @RequestMapping(value = "checkRestful/{id}",method = RequestMethod.GET)
    public String checkRestful(@PathVariable("id") Integer id){
        System.out.println("checkRestful GET:" +id);
        //查询业务
        return "success";
    }

    //http://localhost:8080/springmvc04/hello/checkRestful/1
    //http://localhost:8080/springmvc04/hello/checkRestful?id=1
    @RequestMapping(value = "checkRestful",method = RequestMethod.POST)
    public String checkRestful(){
        System.out.println("checkRestful POST:");
        //添加业务
        return "success";
    }

    @RequestMapping(value = "checkRestful/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String checkRestfulDelete(@PathVariable("id") Integer id){
        System.out.println("checkRestful PUT:删除" + id);
        //删除业务
        return "success";
    }

    @RequestMapping(value = "/checkRestful/{id}", method = RequestMethod.PUT)
    @ResponseBody//idea 和eclipse 要加，myeclipse不用加
    public String checkRestPut(@PathVariable("id") Integer id) {
        System.out.println("checkRestful Put:修改 " + id);
        //修改业务
        return "success";
    }
}
