package com.thikthak.app.main;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "view/main/main";
    }
}
