package com.njcrain.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

    //Takes in a string from the request query, reverses the order of the words, and then returns that to render on the page
    @GetMapping("/reverse")
    public String reverse(@RequestParam("sentence") String sentence) {
        String[] sentenceArray = sentence.split(" ");
        String reverse = "";

        for (int i = sentenceArray.length -1; i >= 0; i--) {
            if (i == 0) {
                reverse += sentenceArray[i];
            } else {
                reverse += sentenceArray[i] + " ";
            }

        }
        return reverse;
    }
}
