package com.eruake.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelleService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hierror")
    public String  hi(){
        return restTemplate.getForObject("http://sayhello/hi?name=sj",String.class);
    }
    public String hierror(){
        return "this is error";
    }
}
