package ru.alishev.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HowItWorksController {

    @GetMapping("/how-does-it-work")
    public String sayHello() {
        return "make_work";
    }
}
