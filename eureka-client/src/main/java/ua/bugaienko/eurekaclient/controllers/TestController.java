package ua.bugaienko.eurekaclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergii Bugaienko
 */

@RestController
@RequestMapping("/main")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test request";
    }
}
