package com.example.test.springbootweb.service;

import com.example.test.springbootweb.config.TestTrace;
import com.example.test.springbootweb.constant.Version;
import com.example.test.springbootweb.dao.TestDao;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    Logger log = LoggerFactory.getLogger("TestService");

    @Resource
    TestDao testDao;

    public String version(){
        log.info("service {}",Version.VERSION);
        return "serviceV-"+ Version.VERSION+","+testDao.version();
    }
}
