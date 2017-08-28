package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {

    @Value("${project.sample.name:Default Name}")
    private String appName;

    @Value("${sample.message:Default Message}")
    private String message;

    @RequestMapping("/get-app-name")
    public String getAppName() {
        return appName;
    }

    @RequestMapping("/get-message")
    public String getMessage() {
        return message;
    }
}
