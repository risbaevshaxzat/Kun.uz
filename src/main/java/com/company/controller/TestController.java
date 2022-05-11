package com.company.controller;

import com.company.enums.LangEnum;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/init")
    public String test() {
        return "App working";
    }

    @GetMapping("/initadmin")
    public String initAdmin() {
        return "App working";
    }

}
