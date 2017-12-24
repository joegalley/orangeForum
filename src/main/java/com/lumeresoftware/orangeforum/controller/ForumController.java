package com.lumeresoftware.orangeforum.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ForumController {

    @RequestMapping(value = {"", "/", "index"}, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("name", "test");

        return "index";
    }

    @RequestMapping(value = {"login"}, method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("name", "test");

        return "login";
    }
}