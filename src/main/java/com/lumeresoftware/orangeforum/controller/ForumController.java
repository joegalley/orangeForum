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
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class ForumController {

    @Autowired
    private SubforumService subforumService;

    @RequestMapping(value = {"login"}, method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("name", "test");

        return "login";
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String showForum(Model model, Pageable pageRequest) {
        List<DetailedSubforum> subforums = subforumService.getSubforumsWithDetails();

        Map<String, List<DetailedSubforum>> subforumsByCategory = subforums.stream()
                .collect(Collectors.groupingBy(s -> s.getCategory().getName()));

        model.addAttribute("subforums", subforumsByCategory);

        return "index";
    }
}