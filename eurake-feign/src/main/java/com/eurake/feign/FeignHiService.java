package com.eurake.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FeignHiService  {
     @Autowired
     FeignClientInterr feignClientInterr;
    public String sayHi(){
       return feignClientInterr.sayHi("sj");
    }
}
