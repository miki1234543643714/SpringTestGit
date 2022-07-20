package com.example.spring2.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")   // getmapping
    public String hello() {
        return "hello";
    }
}
