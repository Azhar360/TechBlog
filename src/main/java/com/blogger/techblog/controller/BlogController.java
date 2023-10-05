package com.blogger.techblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @GetMapping("/get")
    public String getString(){
        return "Hello World this is azhar";
    }
}
