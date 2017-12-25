package com.lumeresoftware.orangeforum.controller;

import com.lumeresoftware.orangeforum.controller.exception.UnknownCategoryException;
import com.lumeresoftware.orangeforum.controller.request.SubforumRequest;
import com.lumeresoftware.orangeforum.model.entity.Category;
import com.lumeresoftware.orangeforum.model.entity.Subforum;
import com.lumeresoftware.orangeforum.service.CategoryService;
import com.lumeresoftware.orangeforum.service.SubforumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("subforum")
public class SubforumController {

    @Autowired
    private SubforumService subforumService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Subforum createSubform(
            @RequestBody SubforumRequest subforumRequest) {

        Optional<Category> categoryOptional = categoryService.findOne(subforumRequest.getCategory());
        Category category = categoryOptional.orElseThrow(() ->
                new UnknownCategoryException(subforumRequest.getCategory()));

        Subforum subforum = new Subforum();
        subforum.setTitle(subforumRequest.getTitle());
        subforum.setCategory(category);

        return subforumService.createSubforum(subforum);
    }
}


