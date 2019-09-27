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
        System.out.println("生生不息，源源不断");
        System.out.println("我的第一个分支");
        System.out.println("mybranch");
        return "学生列表";
    }
}
