package com.lumeresoftware.orangeforum.controller;

import com.lumeresoftware.orangeforum.controller.request.SubforumRequest;
import com.lumeresoftware.orangeforum.model.Subforum;
import com.lumeresoftware.orangeforum.service.SubforumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("subforum")
public class SubforumController {

    @Autowired
    private SubforumService subforumService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Subforum createSubform(
            @RequestBody SubforumRequest subforumRequest) {

        Subforum subforum = new Subforum();
        subforum.setTitle(subforumRequest.getTitle());

        return subforumService.createSubforum(subforum);
    }
}


