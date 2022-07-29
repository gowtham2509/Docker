package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Docker!";
    }
}

//    git init
//    git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/gowtham2509/Docker.git
//        git push -u origin main