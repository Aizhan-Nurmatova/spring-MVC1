package com.peaksoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping("/")
    public String greeting(){
        return "hello";
    }

    @GetMapping("/goodbye")
    public String goodbye(){
        return "goodbye";
    }
}