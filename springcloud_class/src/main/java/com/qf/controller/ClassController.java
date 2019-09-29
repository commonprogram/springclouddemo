package com.qf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/cls")
public class ClassController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/showAllStudents")
    @ResponseBody
    public String showAllStudents(){
        System.out.println("班级控制");
        String result = restTemplate.getForObject("http://web-student/stu/show", String.class);
        System.out.println("调用了学生服务");
        return "result"+result;
    }
}
