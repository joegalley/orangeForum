package com.lumeresoftware.orangeforum.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class Subforum {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String title;

    @OneToMany
    public List<Thread> threads;
}