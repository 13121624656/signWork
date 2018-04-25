package com.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.sampled.Port;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SayhelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SayhelloApplication.class, args);
    }
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String sayHello(@RequestParam String name){
        return "this.name"+name +"port:"+port;
    }
}
