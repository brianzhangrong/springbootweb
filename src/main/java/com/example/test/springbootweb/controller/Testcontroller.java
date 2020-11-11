package com.example.test.springbootweb.controller;



import com.example.test.springbootweb.config.TestTrace;
import com.example.test.springbootweb.constant.Version;
import com.example.test.springbootweb.service.TestService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@XSlf4j

public class Testcontroller {
    Logger  log = LoggerFactory.getLogger("Testcontroller");
    @Resource
    TestService testService;

    @GetMapping("/health")
    public String health(){
        return "ok";
    }
    @GetMapping("/test")
    public String test(){

        log.info("this is test version v{}", Version.VERSION);
        return "v"+Version.VERSION+","+testService.version();
    }

    @GetMapping("/error")
    public String exception(){
          int sum=0;
         for(int i=0;i<10;i++){
             sum+= 1/(5-i);
         }
         return  sum+"";
    }
}
