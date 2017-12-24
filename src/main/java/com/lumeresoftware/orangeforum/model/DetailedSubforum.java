package com.lumeresoftware.orangeforum.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DetailedSubforum {

    private int id;

    public String title;

    public List<Thread> threads;

    public Category category;

    public Integer totalViewCount;

    public Integer totalReplyCount;
}
