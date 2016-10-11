package com.he.app.controller;

import com.he.app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heshaoyi on 10/11/16.
 */
@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Qualifier("cachedService")
    @Autowired
    private TestService testService;

    @RequestMapping("testInsert")
    public void testInsert() {
        testService.insertFirst();
    }
}
