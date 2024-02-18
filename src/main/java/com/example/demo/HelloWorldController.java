package com.example.demo;
import java.util.*;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping("/echo")
    public String echo(@RequestBody String body){
        return body;
    }


}
