package com.tr.danismend.ebel.web.controller.repository;

import com.tr.danismend.ebel.domain.TodoItem;
import com.tr.danismend.ebel.services.TodoItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Mustafa Erbin on 06/03/2017.
 */
@RestController
@RequestMapping(value = "repository-todo-items")
public class RTodoItemController {

    @Autowired
    private TodoItemServices todoItemServices;

    @RequestMapping(method = RequestMethod.POST)
    public TodoItem create(@RequestBody TodoItem todoItem) {
        return todoItemServices.create(todoItem);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public TodoItem delete(@PathVariable("oid") Long id) {
        return todoItemServices.delete(id);
    }
}
