package com.example.test.springbootweb.service;

import com.example.test.springbootweb.dao.TestDao;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Resource
    TestDao testDao;

    public String version(){
        return "service-V"+"1"+","+testDao.version();
    }
}
