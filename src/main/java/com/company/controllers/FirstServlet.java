package com.company.controllers;

import com.company.Calculate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstServlet {

    @GetMapping("/hello")
    public String hello() {
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbye () {
        return "first/goodbye";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam("a") int a,
                            @RequestParam("b") int b,
                            @RequestParam("action") String action,
                            Model model) {
        model.addAttribute("result", Calculate.calculate(a,b,action));
        return "first/calculate";
    }
}
