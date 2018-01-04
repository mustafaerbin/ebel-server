package com.tr.danismend.ebel.web.controller.dao;

import com.tr.nebula.persistence.api.criteria.Result;
import com.tr.nebula.persistence.api.query.search.SearchModel;
import com.tr.nebula.security.core.annotation.Auth;
import com.tr.danismend.ebel.dao.TodoDao;
import com.tr.danismend.ebel.domain.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Mustafa Erbin on 06/03/2017.
 */
@RestController
@RequestMapping(value = "dao-todos")
@Transactional
public class DTodoController {

    @Autowired
    private TodoDao todoDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<Todo> findAll(SearchModel model) {
        return todoDao.findAllStrict(model).getList();
    }

    @Auth
    @RequestMapping(value = "secure", method = RequestMethod.GET)
    public List<Todo> findAllSecure(SearchModel model) {
        return todoDao.findAllStrict(model).getList();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Todo create(@RequestBody Todo todo) {
        return todoDao.create(todo);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public Todo delete(@PathVariable("oid") Long id) {
        return todoDao.delete(id);
    }

    @RequestMapping(value = "select", method = RequestMethod.GET)
    public Result<Map<String, Object>> findAllSelect(SearchModel model) {
        String[] fields = {"oid","header"};
        model.setFields(fields);
        return todoDao.findAll(model);
    }

    @RequestMapping(value = "properties", method = RequestMethod.GET)
    public List properties() {
        return todoDao.getProperties();
    }
}
