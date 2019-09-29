package com.qf.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "web-student",fallback = StuServiceFallback.class)
public interface IStuService {

    @RequestMapping("/stu/show")
    String show();
}
