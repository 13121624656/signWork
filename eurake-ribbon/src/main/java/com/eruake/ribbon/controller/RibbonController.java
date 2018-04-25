package com.eruake.ribbon.controller;

import com.eruake.ribbon.HelleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    HelleService helleService;
    @RequestMapping(value = "/ribbon")
    public String ribbon(){
       return helleService.hi();
    }
   /* @Autowired
    LoadBalancerClient loadBalancerClient;
    @RequestMapping(value = "/ribbonsayhi")
    public String sayhi(){
        ServiceInstance serviceInstance=loadBalancerClient.choose("sayhello");
       return serviceInstance.getHost()+":"+serviceInstance.getPort();
    }*/
}
