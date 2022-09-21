package com.example.springserverclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties/")
public class ControllerRest {


    @Value("${configA}")
    private String property;

    @GetMapping("/toto")
    public String getProperty(){
        return property;
    }

}
