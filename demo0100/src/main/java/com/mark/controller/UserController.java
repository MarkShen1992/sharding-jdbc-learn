package com.mark.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * validate test
 */
@RestController
public class UserController {
    
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}