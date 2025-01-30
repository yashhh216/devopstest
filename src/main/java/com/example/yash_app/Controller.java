package com.example.yash_app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {

    @GetMapping()
    public String welcome() {
        return "Welcome To world of devops";
    }
}
