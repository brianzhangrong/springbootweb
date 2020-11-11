package com.example.test.springbootweb.service;

import com.example.test.springbootweb.constant.Version;
import com.example.test.springbootweb.dao.TestDao;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Resource
    TestDao testDao;

    public String version(){
        return "serviceV-"+ Version.VERSION+","+testDao.version();
    }
}
