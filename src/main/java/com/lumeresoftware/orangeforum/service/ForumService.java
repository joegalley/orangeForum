package com.lumeresoftware.orangeforum.service;

import com.lumeresoftware.orangeforum.dao.SubforumRepository;
import com.lumeresoftware.orangeforum.model.Subforum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class ForumService {

    @Autowired
    private SubforumRepository subforumRepository;

    public Stream<Subforum> listSubforums(Pageable pageable) {
        return StreamSupport.stream(subforumRepository.findAll().spliterator(), false);
    }
}
