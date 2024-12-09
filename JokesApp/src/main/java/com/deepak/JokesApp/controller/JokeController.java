package com.deepak.JokesApp.controller;

import com.deepak.JokesApp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

    private final JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @GetMapping("/joke")
    public ResponseEntity<String> getJoke(){
        String joke = jokeService.getJoke();
        return new ResponseEntity<>(joke, HttpStatusCode.valueOf(200));
    }
}
