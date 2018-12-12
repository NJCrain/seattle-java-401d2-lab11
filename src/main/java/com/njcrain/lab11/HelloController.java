package com.njcrain.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //Displays Hello, World on the page
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World";
    }
}
