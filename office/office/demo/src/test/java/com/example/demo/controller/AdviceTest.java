package com.example.demo.controller;

import com.example.demo.service.AdviceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fang on 2017/11/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdviceTest {

    @Autowired
    private AdviceService adviceService;

    @Test
    public void create(){
        adviceService.createAdvice("hhhh");
    }
}
