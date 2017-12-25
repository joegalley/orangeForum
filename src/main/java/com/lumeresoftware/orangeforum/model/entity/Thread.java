package com.lumeresoftware.orangeforum.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Table
@Data
public class Thread {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    public Subforum subforum;

    @OneToMany
    public List<Post> posts;

    @OneToOne
    public Category category;

    public Integer viewCount;

    public Integer replyCount;
}
