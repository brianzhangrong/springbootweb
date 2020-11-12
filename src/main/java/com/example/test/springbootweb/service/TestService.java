package com.example.test.springbootweb.service;

import com.example.test.springbootweb.config.TestTrace;
import com.example.test.springbootweb.constant.Version;
import com.example.test.springbootweb.dao.TestDao;
import com.example.test.springbootweb.log.domain.LogDTO;
import com.example.test.springbootweb.log.mapper.LogDTOMapper;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Resource;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    Logger log = LoggerFactory.getLogger("TestService");

    @Resource
    TestDao testDao;
    @Resource
    LogDTOMapper logDTOMapper;

    private static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(5, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .build();

    public String version(){
        log.info("service {}",Version.VERSION);

        Request getRequest =
                new Request.Builder().get().url("http://web2:8080/test").build();
        Call getCall = okHttpClient.newCall(getRequest);
        Response execute = null;
        try {
            execute = getCall.execute();

            if(execute.isSuccessful()){
                String ret =execute.body().string();
                LogDTO logDTO=new LogDTO();
                logDTO.setLog(ret);
                int i=logDTOMapper.insert(logDTO);
                if(i<=0){
                    log.error("insert error:{}",ret);
                }
                return "serviceV-"+ Version.VERSION+","+testDao.version()+"--->"+ret;
            }
        } catch (IOException e) {

        }
        return "web2 error";
    }
}
