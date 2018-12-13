package com.njcrain.lab11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    //Displays Hello, World on the page
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
