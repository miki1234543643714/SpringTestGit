package com.example.spring2.web;

import com.example.spring2.web.dto.HelloResponsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")   // getmapping
    public String hello() {

        return "hello";
    }
    @GetMapping("/hello/dto")
    public HelloResponsDto helloDto(@RequestParam("name") String name ,@RequestParam("amount") int amount){
        return new HelloResponsDto(name, amount);
    }

}
