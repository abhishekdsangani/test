package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping("")
    public String ping(){
        return "<h1>Abhishek Sangani</h1>";
    }
}
