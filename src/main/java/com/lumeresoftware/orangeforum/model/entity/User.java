package com.lumeresoftware.orangeforum.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String username;

    public String password;

    public String aboutLine;

    public String avatarId;

    public String signature;

    public int postCount;

    @OneToMany
    public List<Post> posts;
}