package com.gupao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class K8SController {


    @RequestMapping("/k8s")
    public String k8s(){
        return "hello K8s lly ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }




    @RequestMapping("/test")
    public String test(){
        StringBuffer sb = new StringBuffer();
        sb.append("内存共计:" + (Runtime.getRuntime().totalMemory() / 1024 /1024) + "M");
        sb.append("n内存剩余:" + (Runtime.getRuntime().freeMemory() / 1024 / 1024) + "M");
        sb.append("内存最大: " + (Runtime.getRuntime().maxMemory() /1024 /1024) + "M");
        return sb.toString();
    }
}
