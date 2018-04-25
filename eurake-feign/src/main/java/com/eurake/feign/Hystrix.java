package com.eurake.feign;

import org.springframework.stereotype.Component;

@Component
public class Hystrix implements FeignClientInterr {
    @Override
    public String sayHi(String name) {
        return "this.sayhi error";
    }
}
