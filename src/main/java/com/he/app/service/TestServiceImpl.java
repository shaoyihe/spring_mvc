package com.he.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by heshaoyi on 10/11/16.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private TestServiceImpl2 testServiceImpl2;

    @Transactional()
    public void insertFirst() {
        jdbcTemplate.execute("insert into test.tbl values(5,20)");
        testServiceImpl2.insertSecond();
    }
}
