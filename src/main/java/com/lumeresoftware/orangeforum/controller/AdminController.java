package com.lumeresoftware.orangeforum.controller;


import com.lumeresoftware.orangeforum.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String get(Model model, @RequestParam(value = "tab", required = false) String tab) {

        List<String> validTabs = new ArrayList<>(Arrays.asList("stats", "subCat", "users", "customization"));

        String tabToShow = "subCat";
        if (null != tab && validTabs.contains(tab)) {
            tabToShow = tab;
        }
        model.addAttribute("tab", tabToShow);

        return "admin";
    }

}