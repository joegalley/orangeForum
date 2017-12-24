package com.lumeresoftware.orangeforum.controller;


import com.lumeresoftware.orangeforum.model.DetailedSubforum;
import com.lumeresoftware.orangeforum.service.SubforumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private SubforumService subforumService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String showForum(Model model, Pageable pageRequest) {
        List<DetailedSubforum> detailedSubforums = subforumService.getSubforumsWithDetails();

        model.addAttribute("detailedSubforums", detailedSubforums);

        return "admin";
    }
}