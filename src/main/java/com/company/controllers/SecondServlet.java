package com.company.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondServlet {

    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
