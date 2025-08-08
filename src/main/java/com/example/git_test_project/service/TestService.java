package com.example.git_test_project.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String getTestValue() {
        String a = "test";
        int no = 10;
        return "Application is working as expected............test";
    }
}
