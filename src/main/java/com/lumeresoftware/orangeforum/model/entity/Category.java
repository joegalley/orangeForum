package com.lumeresoftware.orangeforum.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Category {
    @Id
    public String name;

    @OneToOne
    public Subforum subforum;
}
