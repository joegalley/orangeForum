package com.lumeresoftware.orangeforum.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String content;

    private User author;

    private int test() {
        return this.author.getId();
    }
}