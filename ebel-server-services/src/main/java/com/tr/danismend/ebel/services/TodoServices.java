package com.tr.danismend.ebel.services;

import com.tr.nebula.persistence.jpa.services.JpaService;
import com.tr.danismend.ebel.domain.Todo;
import com.tr.danismend.ebel.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mustafa Erbin on 06/03/2017.
 */
@Service
public class TodoServices extends JpaService<Todo, Long> {

    @Autowired
    public TodoServices(TodoRepository repository) {
        super(repository);
    }
}
