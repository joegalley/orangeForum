package com.lumeresoftware.orangeforum.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String content;

    @OneToOne
    public User author;

    @ManyToOne
    public Thread thread;

    public LocalDateTime postedAt;
}