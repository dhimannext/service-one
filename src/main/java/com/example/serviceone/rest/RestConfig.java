package com.example.serviceone.rest;

import feign.Feign;
import feign.Logger;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.slf4j.Slf4jLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RestConfig {

    @Bean
    public RestFulService2 getRestFulService2() {
        Feign.Builder builder = Feign.builder().requestInterceptor(new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate template) {
//                template.header("Connection", "close");
            }
        });
        builder.logger(new Slf4jLogger("nameee")).logLevel(Logger.Level.FULL);
        return builder.target(RestFulService2.class,"http://localhost:8081");
    }
}
