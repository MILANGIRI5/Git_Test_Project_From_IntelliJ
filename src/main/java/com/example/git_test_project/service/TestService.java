package com.example.git_test_project.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String getTestValue() {
        int a = 10;
        return "Application is working as expected............test";
    }
}
