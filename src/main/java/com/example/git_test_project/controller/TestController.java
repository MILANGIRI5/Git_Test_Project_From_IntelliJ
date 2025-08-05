package com.example.git_test_project.controller;

import com.example.git_test_project.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/v1/test")
    public ResponseEntity<String> getTestResult() {
        return new ResponseEntity<>(testService.getTestValue(), HttpStatus.OK);
    }

}
