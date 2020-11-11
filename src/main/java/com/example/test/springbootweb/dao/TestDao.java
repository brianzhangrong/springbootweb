package com.example.test.springbootweb.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

    public String version(){
        return "testDao-v"+"1";
    }
}
