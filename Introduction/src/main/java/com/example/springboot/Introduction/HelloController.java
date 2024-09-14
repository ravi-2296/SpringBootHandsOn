package com.example.springboot.Introduction;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse hello(){
        return new HelloResponse("Hello World");
    }

    // Dynamic varaible used
    @GetMapping("/hello/{name}")
    public HelloResponse hello(@PathVariable String name){
        return new HelloResponse("Hello "+ name+ " !! ");
    }

    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse("Hello "+ name + "!");
    }
}
