package com.java2days.mastering;

import com.java2days.mastering.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    /**
     * Is autowiring the autoconfigured helloService bean provided in the dependency mastering-autoconfigure
     */
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String greetings(){
        // greetings method will say hello to the hello.name property in the application.properties
        return helloService.greetings();
    }

    @GetMapping("/hello/{name}")
    public String greetingsWithParam(@PathVariable String name){
        // greetings method will say hello to the param
        return helloService.greetings(name);
    }
}
