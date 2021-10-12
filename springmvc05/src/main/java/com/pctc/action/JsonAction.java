package com.pctc.action;

import com.pctc.model.Address;
import com.pctc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author H1PPPY
 * @date 2021/10/12 10:49
 */
@Controller
@RequestMapping("json")
public class JsonAction {

    @RequestMapping("checkJsonObject")
    @ResponseBody
    public Student checkJsonObject() {
        Student student = new Student();
        student.setId(9);
        student.setUsername("熊腾");
        student.setEmail("17679158748@qq.com");
        student.setAge(20);
        student.setPassword("xt898989");
        Address address = new Address();
        address.setProvince("江苏");
        address.setCity("南京");
        student.setAddress(address);

        return student;
    }

    @ResponseBody
    @RequestMapping(value = "/checkJsonListObject")
    public List<Student> testJsonListObject() {
        List<Student> list = new ArrayList<>();

        Student student = new Student();
        student.setId(9);
        student.setUsername("熊腾");
        student.setEmail("18979749@qq.com");
        student.setAge(20);
        student.setPassword("xt898989");
        Address address = new Address();
        address.setProvince("江西");
        address.setCity("丰城");
        student.setAddress(address);
        list.add(student);

        Student student1 = new Student();
        student1.setId(2);
        student1.setUsername("肖帅");
        student1.setEmail("470803969@qq.com");
        student1.setAge(30);
        student1.setPassword("ncdjcnjvdjv");
        Address address1 = new Address();
        address1.setProvince("江西");
        address1.setCity("南昌");
        student1.setAddress(address1);
        list.add(student1);

        Student student2 = new Student();
        student2.setId(200);
        student2.setUsername("温帅");
        student2.setEmail("870803969@qq.com");
        student2.setAge(40);
        student2.setPassword("333333");
        Address address2 = new Address();
        address2.setProvince("江西");
        address2.setCity("新余");
        student2.setAddress(address2);
        list.add(student2);

        return list;
    }

    @RequestMapping("checkJsonObjectParam")
    @ResponseBody
    public Student checkJsonObjectParam(Student student) {
        student.setId(9);
        student.setEmail("17679158748@qq.com");
        student.setAge(20);
        Address address = new Address();
        address.setProvince("江苏");
        address.setCity("南京");
        student.setAddress(address);
        return student;
    }

    @ResponseBody
    @RequestMapping(value = "/checkJsonListObjectParam")
    public List<Student> testJsonListObject(Student stu) {
        List<Student> list = new ArrayList<>();

        Student student = new Student();
        student.setId(9);
        student.setUsername(stu.getUsername());
        student.setEmail("18979749@qq.com");
        student.setAge(20);
        student.setPassword(stu.getPassword());
        Address address = new Address();
        address.setProvince("江西");
        address.setCity("丰城");
        student.setAddress(address);
        list.add(student);

        Student student1 = new Student();
        student1.setId(2);
        student1.setUsername("肖帅");
        student1.setEmail("470803969@qq.com");
        student1.setAge(30);
        student1.setPassword("ncdjcnjvdjv");
        Address address1 = new Address();
        address1.setProvince("江西");
        address1.setCity("南昌");
        student1.setAddress(address1);
        list.add(student1);

        Student student2 = new Student();
        student2.setId(200);
        student2.setUsername("温帅");
        student2.setEmail("870803969@qq.com");
        student2.setAge(40);
        student2.setPassword("333333");
        Address address2 = new Address();
        address2.setProvince("江西");
        address2.setCity("新余");
        student2.setAddress(address2);
        list.add(student2);

        return list;
    }

}
