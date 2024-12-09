package com.deepak.JokesApp.controller;

import com.deepak.JokesApp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @RequestMapping("/joke")
    public String getJoke(Model model){
        String joke = jokeService.getJoke();
        model.addAttribute("joke", joke);
        return "index";
    }
}
