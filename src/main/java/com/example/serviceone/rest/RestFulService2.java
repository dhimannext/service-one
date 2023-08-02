package com.example.serviceone.rest;

import feign.RequestLine;
import org.springframework.stereotype.Component;

public interface RestFulService2 {

    @RequestLine("GET v2/hello")
    String getServName();
}
