package com.lumeresoftware.orangeforum.controller;


import com.lumeresoftware.orangeforum.model.Subforum;
import com.lumeresoftware.orangeforum.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ForumController {

    @Autowired
    private ForumService forumService;

    @RequestMapping(value = {"", "/", "index"}, method = RequestMethod.GET)
    public String showForum(Model model, Pageable pageRequest) {
        List<Subforum> subforums = forumService.listSubforums(pageRequest).collect(Collectors.toList());

        model.addAttribute("subforums", subforums);

        return "index";
    }

    @RequestMapping(value = {"login"}, method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("name", "test");

        return "login";
    }
}