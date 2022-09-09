package com.example.core12.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("eee")
    public String run(){
        return "run success!";
    }

}
