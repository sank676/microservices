package com.UST.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
    @GetMapping("/userServiceFallBackMethod")
    public String userServiceFallBackMethod(){
        return "OUR SERVICE IS TAKING TIME TO LOAD PLEASE WAIT";

    }
    @GetMapping("/departmentServiceFallBackMethod")
    public String departmentServiceFallBackMethod(){
        return "OUR SERVICE IS TAKING TIME TO LOAD PLEASE WAIT";
    }
}
