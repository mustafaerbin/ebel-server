package com.tr.danismend.ebel.repository;

import com.tr.danismend.ebel.domain.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Mustafa Erbin on 06/03/2017.
 */
@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
    List<TodoItem> findByParent_id(Long parentOid);
}
