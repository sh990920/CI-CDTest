package com.example.cicdTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "test";
    }
    @GetMapping("/test")
    public String test() {
        return "test2";
    }
}
