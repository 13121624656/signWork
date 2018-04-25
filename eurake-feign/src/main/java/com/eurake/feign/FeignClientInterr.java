package com.eurake.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "sayhello",fallback = Hystrix.class)
public interface FeignClientInterr {
    @GetMapping("/hi")
    public String sayHi(@RequestParam(value = "name")String name);
}
