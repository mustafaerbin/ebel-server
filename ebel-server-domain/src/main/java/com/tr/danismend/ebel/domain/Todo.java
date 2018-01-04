package com.tr.danismend.ebel.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.tr.nebula.persistence.api.criteria.ann.SearchFrom;
import com.tr.nebula.persistence.jpa.domain.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Mustafa Erbin on 06/03/2017.
 */
@Entity
public class Todo extends BaseEntity {

    private String header;
    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, orphanRemoval = true)
    @JsonManagedReference
    @SearchFrom(entity = TodoItem.class)
    private List<TodoItem> items;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<TodoItem> getItems() {
        return items;
    }

    public void setItems(List<TodoItem> items) {
        this.items = items;
    }
}
