package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping("/ping")
    public String ping(){
        return "<h1>Abhishek Dilipbhai Sangani</h1>";
    }
}
