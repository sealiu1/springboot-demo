package com.gupao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class K8SController {


    @RequestMapping("/k8s")
    public String k8s(){
        return "hello K8s lly";
    }




    @RequestMapping("/test")
    public String test(){
        return "内存共计:" + (Runtime.getRuntime().totalMemory() / 1024 /1024) + "M";
    }
}
