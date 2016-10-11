package com.he.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by heshaoyi on 10/11/16.
 */
@Service
public class TestServiceImpl2 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insertSecond() {
        jdbcTemplate.execute("insert into test.tbl values(50,200)");
    }
}
