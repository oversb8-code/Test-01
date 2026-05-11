package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {
    @GetMapping("/first")
    public String first() { return "first";  }

    @GetMapping("/second")
    public String second() { return "second"; }

}
