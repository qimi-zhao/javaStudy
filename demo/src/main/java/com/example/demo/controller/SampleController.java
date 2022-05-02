package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
    
    @RequestMapping("/sample")
    public String sample(){
        return "sample";
    }

    @RequestMapping("/sample1")
    public String sample1(){
        return "sample1";
    }

    @RequestMapping("/sample2")
    public String sample2(){
        return "sample";
    }

    @RequestMapping("/sample3")
    public String sample3(){
        return "sample1";
    }
}
