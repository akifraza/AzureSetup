package com.whitesharkcode.azuresetup.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1/setup")
public class AzureSetupController {

    @GetMapping
    public String getsetup() {
        return  "This is Working....";
    }
    @GetMapping ("/new")
    public String getNew() {
        return "NewSetup-1";
    }
}
