package com.example.demo.model;

import javax.persistence.*;

/**
 * Created by fang on 2017/11/12.
 */

@Entity
@Table(name = "zyf_advice")
public class Advice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String advice;


    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
