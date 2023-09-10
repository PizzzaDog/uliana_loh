package com.woof.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {
    @GetMapping("/check")
    String check() {
        return "Hello mfckr";
    }
}
