package com.example.demo.controller;

import com.example.demo.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fang on 2017/11/1.
 */
@Controller
@CrossOrigin("*")
@RequestMapping("/fang")
public class DemoController {

    @Autowired
    private DemoDao demoDao;

    @RequestMapping("/count/{question}/{code}")
    @ResponseBody
    public Integer getCount(@PathVariable("question") String question ,
                            @PathVariable("code") Integer code) {
        System.out.println(question);
        System.out.println(code);
        Integer count = demoDao.getCount(question , code);
        return count;
    }

    @RequestMapping("/insert/{question}/{code}")
    @ResponseBody
    public Integer insert(@PathVariable("question")String question,
                          @PathVariable("code")Integer code) {
        return demoDao.insertQuestion(question,code);
    }
}
