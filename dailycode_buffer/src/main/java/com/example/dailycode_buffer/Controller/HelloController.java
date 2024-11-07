package com.example.dailycode_buffer.Controller;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "hello world";
    }


    @GetMapping("/error")
    public String hello1(){
        return "there is an error";
    }


}
