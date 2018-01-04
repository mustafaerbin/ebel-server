package com.tr.danismend.ebel.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.tr.nebula.persistence.jpa.domain.BaseEntity;

import javax.persistence.*;

/**
 * Created by Mustafa Erbin on 06/03/2017.
 */
@Entity
@Table(name = "TODO_ITEMS")
public class TodoItem extends BaseEntity {

    private String text;
    private String description;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JsonBackReference
    private Todo parent;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Todo getParent() {
        return parent;
    }

    public void setParent(Todo parent) {
        this.parent = parent;
    }
}
