package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {

    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Kunal") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
    @GetMapping("/calculator")
    public String calculator() {
        return "calculator";
    }

}
