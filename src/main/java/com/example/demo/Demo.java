package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping("/ping")
    public String ping(){
        System.out.println("true = " + true);
        System.out.println("false= " + false);
        return "<h1>Abhishek Sangani</h1>";
    }
}
