package ua.bugaienko.eurekaclient2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergii Bugaienko
 */

@RestController
@RequestMapping("/new")
public class NewController {

    @GetMapping("/hello")
    public String test() {
        return "Hello World";
    }
}
