package com.example.tp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TemplatesController {
    @GetMapping("/templates")
    String skip(HttpServletRequest request){

        return "/index";
    }
}
