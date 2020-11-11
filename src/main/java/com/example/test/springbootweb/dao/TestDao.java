package com.example.test.springbootweb.dao;

import com.example.test.springbootweb.constant.Version;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

    public String version(){
        return "testDao-v"+ Version.VERSION;
    }
}
