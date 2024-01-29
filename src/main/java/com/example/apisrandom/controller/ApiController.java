package com.example.apisrandom.controller;

import com.example.apisrandom.entity.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public Api getDataApi(){
        String url= "https://jsonplaceholder.typicode.com/todos/1";
        Api api = restTemplate.getForObject(url, Api.class);
        log.info("result: " + api);
        return api;
    }

    @GetMapping("/all")
    public List<Api> getAllDataApi() {
        String url = "https://jsonplaceholder.typicode.com/todos";
        List<Api> apiList = Arrays.asList(restTemplate.getForObject(url, Api[].class));
        log.info("result: " + apiList);
        return apiList;
    }

}
