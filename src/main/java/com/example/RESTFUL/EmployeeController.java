package com.example.RESTFUL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @GetMapping
    String sayHello(){
        return "hello and welcome";
    }

    @GetMapping("/add")
    String add(){
        return "the sum is";
    }

    @GetMapping("/weather/{cityName}")
    String getWeather(@PathVariable String cityName){
        return cityName+ "the  weather is good";
    }
}