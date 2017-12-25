package com.lumeresoftware.orangeforum.model;

import com.lumeresoftware.orangeforum.model.entity.Category;
import com.lumeresoftware.orangeforum.model.entity.Thread;
import com.lumeresoftware.orangeforum.util.TemplateResponseHelper;
import com.lumeresoftware.orangeforum.util.TemplateUtil;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DetailedSubforum implements TemplateResponseHelper {

    private int id;

    public String title;

    public List<Thread> threads;

    public Category category;

    public Integer totalViewCount;

    public Integer totalReplyCount;

    @Override
    public DetailedSubforum getNullCheckedObject(DetailedSubforum detailedSubforum) {

        this.setId(TemplateUtil.valOrEmptyStr(this.getId()));
        this.setTitle(TemplateUtil.valOrEmptyStr(this.title));


        return this;
    }
}
