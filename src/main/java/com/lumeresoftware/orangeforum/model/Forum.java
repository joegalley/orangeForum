package com.lumeresoftware.orangeforum.model;

import javax.persistence.OneToMany;
import java.util.List;

public class Forum {

    @OneToMany
    public List<User> users;

    @OneToMany
    public List<Subforum> subforums;
}
