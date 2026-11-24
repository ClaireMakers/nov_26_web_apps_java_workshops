package com.makers.makersbnb_coach_support_code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlanetsController {
    // tell Spring Boot this method handles the 'GET "/"' request
    @GetMapping("/")
    public ModelAndView planetsList() {
        return new ModelAndView("/PlanetsList");
    }

    @GetMapping("/mars")
    public ModelAndView marsInfo() {
        //All the logic that will run when you send a request will live in
        //the body of the controller method
        ModelAndView marsInfo = new ModelAndView("/MarsInfo");
        String description = "The planet Mars is half the size of the Earth.";

        marsInfo.addObject("marsDescription", description);
        return marsInfo;
    }
}
