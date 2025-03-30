package com.nata.teste_github_actions;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping
    public String getMethodName() {
        return "Hello World!";
    }
    

}
