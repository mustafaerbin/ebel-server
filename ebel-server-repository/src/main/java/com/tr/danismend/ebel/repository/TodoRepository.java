package com.tr.danismend.ebel.repository;

import com.tr.danismend.ebel.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Mustafa Erbin on 06/03/2017.
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
