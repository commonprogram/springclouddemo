package com.qf.service;

import org.springframework.stereotype.Component;

@Component
public class StuServiceFallback implements IStuService {
    @Override
    public String show() {
        return "对不起，服务器异常，请稍后再试！";
    }
}
