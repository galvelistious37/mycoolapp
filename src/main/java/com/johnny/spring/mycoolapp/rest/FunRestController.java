package com.johnny.spring.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Injecting custom properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @Value("${player.name}")
    private String playerName;

    // Expose a "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "<h1>Hello World!</h1>";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailWorkout(){
        return "Run a hard 5k!";
    }

    // Expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day.";
    }

    // Expose endpoint "teaminfo" to display custom properties
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        String msg = """
                <p>Here are some property values pulled in from application.properites: 
                    coach.name = %s
                    team.name = %s
                    player.name = %s
                </p>""".formatted(coachName, teamName, playerName);
        return msg;
    }
}
