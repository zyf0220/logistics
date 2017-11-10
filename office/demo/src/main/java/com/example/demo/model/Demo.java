package com.example.demo.model;

/**
 * Created by fang on 2017/11/1.
 */
public class Demo {
    private String question;
    private Integer code;

    public Demo(String question, Integer code) {
        this.question = question;
        this.code = code;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "question='" + question + '\'' +
                ", code=" + code +
                '}';
    }
}
