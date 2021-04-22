package com.cloud.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackmethodController {

    @GetMapping("/userfallback")
    public String userFallback(){
        return "user service is taking longer than excepted"
                +"Please try again later";
    }
    @GetMapping("/departmentfallback")
    public String departmentFallback(){
        return "department service is taking longer than excepted"
                +"Please try again later";
    }
}
