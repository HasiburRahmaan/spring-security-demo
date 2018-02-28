package com.rashidul.springsecdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ResourceController {

    @GetMapping("")
    public String index(){

        return "index";
    }

    @GetMapping("/private")
    public String privatePage(){

        return "private";
    }

    @GetMapping("/login")
    public String loginPage(){

        return "login";
    }
}
