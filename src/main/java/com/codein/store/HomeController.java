package com.codein.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.View;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String Index() {
        System.out.println("app name : "+ appName);
        return "index.html";
    }
}
