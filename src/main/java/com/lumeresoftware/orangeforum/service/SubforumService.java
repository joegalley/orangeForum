package com.lumeresoftware.orangeforum.service;

import com.lumeresoftware.orangeforum.dao.SubforumRepository;
import com.lumeresoftware.orangeforum.model.Subforum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubforumService {

    @Autowired
    SubforumRepository subforumRepository;

    public Subforum createSubforum(Subforum subforum) {
        return subforumRepository.save(subforum);
    }
}
