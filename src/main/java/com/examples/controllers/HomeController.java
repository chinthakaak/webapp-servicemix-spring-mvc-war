package com.examples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ka40215 on 2/20/16.
 */
@Controller
public class HomeController {
    @RequestMapping({"/", "/home"})
    public String showHomePage() {
        return "home";
    }
}
