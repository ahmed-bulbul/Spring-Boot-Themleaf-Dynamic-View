package com.thikthak.app.modules.crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crud")
public class CrudController {

    @RequestMapping("/index")
    public String index() {
        return "crud/index";
    }
}

