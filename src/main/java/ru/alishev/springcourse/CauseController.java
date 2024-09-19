package ru.alishev.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CauseController {

    @GetMapping("/why-does-it-not-work")
    public String sayHello() {
        return "the_cause";
    }
}
