package org.trahim.spring.ajax2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class DemoController {

    @GetMapping
    public String index() {
        return "demo/demo1";
    }
}
