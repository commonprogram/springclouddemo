package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/stu")
public class StuController {

    @RequestMapping("/show")
    @ResponseBody
    public String show(){
        return "学生列表";
    }
}