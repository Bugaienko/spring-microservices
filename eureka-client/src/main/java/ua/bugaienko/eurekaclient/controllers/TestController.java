package ua.bugaienko.eurekaclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergii Bugaienko
 */

@RestController
@RequestMapping("/main")
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;


    @Value("${tmpVar}")
    private int tmpVar;

    @GetMapping("/test")
    public String test() {
        return instanceId + " -> test request ->" + tmpVar;
    }
}
