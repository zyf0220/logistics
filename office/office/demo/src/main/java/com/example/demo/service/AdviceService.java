package com.example.demo.service;

import com.example.demo.model.Advice;
import com.example.demo.repository.AdviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fang on 2017/11/12.
 */
@Service
public class AdviceService {
    @Autowired
    private AdviceRepository adviceRepository;

    public Object createAdvice(String advice) {
        Advice advice1 = new Advice();
        advice1.setAdvice(advice);
        return adviceRepository.save(advice1);
    }

}
