package com.njcrain.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaptilizeController {
    @GetMapping("/capitalize/{word}")
    public String capitalize(@PathVariable String word) {
        return word.toUpperCase();
    }
}