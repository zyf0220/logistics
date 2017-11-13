package com.example.demo.controller;

import com.example.demo.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fang on 2017/11/12.
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/advice")
public class AdviceController {
    @Autowired
    private AdviceService adviceService;

    @RequestMapping("/add/{advice}")
    public Object addAdvice(@PathVariable("advice")String advice) {
        return adviceService.createAdvice(advice);
    }




}
