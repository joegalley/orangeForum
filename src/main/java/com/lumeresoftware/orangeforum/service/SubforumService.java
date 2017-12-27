package com.lumeresoftware.orangeforum.service;

import com.lumeresoftware.orangeforum.dao.SubforumRepository;
import com.lumeresoftware.orangeforum.model.DetailedSubforum;
import com.lumeresoftware.orangeforum.model.entity.Subforum;
import com.lumeresoftware.orangeforum.model.entity.Thread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class SubforumService {

    @Autowired
    SubforumRepository subforumRepository;

    public Subforum createSubforum(Subforum subforum) {
        return subforumRepository.save(subforum);
    }

    public List<Subforum> getSubforums() {
        return subforumRepository.findAll();
    }

    public List<DetailedSubforum> getSubforumsWithDetails() {
        Stream<Subforum> subforums = this.getSubforums().stream();

        return subforums.map(subforum -> DetailedSubforum.builder()
                .id(subforum.getId())
                .category(subforum.getCategory())
                .title(subforum.getTitle())
                .threads(subforum.getThreads())
                .threadCount(this.getThreadCount(subforum))
                .totalViewCount(this.getTotalViewCount(subforum))
                .totalReplyCount(this.getTotalReplyCount(subforum))
                .build())
                .collect(Collectors.toList());
    }

    public Integer getThreadCount(Subforum subforum) {
        return subforumRepository.findOne(subforum.getId()).getThreads().size();
    }

    public Integer getTotalViewCount(Subforum subforum) {
        return subforumRepository.findOne(subforum.getId()).getThreads().stream()
                .map(Thread::getViewCount)
                .mapToInt(i -> i).sum();
    }

    public Integer getTotalReplyCount(Subforum subforum) {
        return subforumRepository.findOne(subforum.getId()).getThreads().stream()
                .map(Thread::getReplyCount)
                .mapToInt(i -> i).sum();
    }
}
