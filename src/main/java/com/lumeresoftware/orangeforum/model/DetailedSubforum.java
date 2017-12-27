package com.lumeresoftware.orangeforum.model;

import com.lumeresoftware.orangeforum.model.entity.Category;
import com.lumeresoftware.orangeforum.model.entity.Thread;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DetailedSubforum {

    private Integer id;

    public String title;

    public List<Thread> threads;

    public Integer threadCount;

    public Category category;

    public Integer totalViewCount;

    public Integer totalReplyCount;
}
