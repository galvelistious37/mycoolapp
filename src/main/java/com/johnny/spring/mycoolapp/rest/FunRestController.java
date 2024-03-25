package com.johnny.spring.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // Expose a "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        String msg = """
                <h1>Hello World!</h1> 
                <p>Here are some property values pulled in from application.properites: 
                    coach.name = %s
                    team.name = %s
                </p>""".formatted(coachName, teamName);
        return msg;
    }

}
