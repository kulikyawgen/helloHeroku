package com.kulik.demo.blabla;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    @GetMapping
    public String sayHello(){
        return "hello";
    }
}