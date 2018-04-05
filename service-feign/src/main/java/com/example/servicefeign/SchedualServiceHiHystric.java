package com.example.servicefeign;


import org.springframework.stereotype.Component;


@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name+ ",  熔断机制启动了";
    }



}