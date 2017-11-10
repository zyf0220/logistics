package com.example.demo.controller;

import com.example.demo.dao.DemoDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by fang on 2017/11/1.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoControllerTest {

    @Autowired
    private DemoController demoController;

    @Autowired
    private DemoDao demoDao;
    @Test
    public void getCount() throws Exception {

        System.out.println(demoController.getCount("10号楼公寓.卫生状况" , 1));
    }

}