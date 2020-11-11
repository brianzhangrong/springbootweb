package com.example.test.springbootweb.controller;



import com.example.test.springbootweb.config.TestTrace;
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

    public final static String VERSION="6";
    @GetMapping("/test")
    @TestTrace
    public String test(){

        log.info("this is test version v{}",VERSION);
        return "v"+VERSION;
    }
}
