package com.example.serviceone.controller;

import com.example.serviceone.rest.RestFulService2;
import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class Controller {

    @Autowired private RestFulService2 restFulService2;

    @GetMapping("/hello")
    public String hello(){
        return "hello "+restFulService2.getServName();
    }
}
