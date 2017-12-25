package com.lumeresoftware.orangeforum.model;

import com.lumeresoftware.orangeforum.model.entity.Subforum;
import com.lumeresoftware.orangeforum.model.entity.User;

import javax.persistence.OneToMany;
import java.util.List;

public class Forum {

    @OneToMany
    public List<User> users;

    @OneToMany
    public List<Subforum> subforums;
}
