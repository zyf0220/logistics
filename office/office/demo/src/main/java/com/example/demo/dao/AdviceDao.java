package com.example.demo.dao;

import com.example.demo.model.Advice;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fang on 2017/11/12.
 */
public interface AdviceDao extends CrudRepository<Advice,Integer> {
}
