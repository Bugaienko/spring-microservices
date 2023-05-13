package ua.bugaienko.eurekaclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergii Bugaienko
 */

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
