package com.platzi.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class holaMundoController {

    @GetMapping("/hello")
    public String greet (){

        return "never stop to learn .";
    }
}
