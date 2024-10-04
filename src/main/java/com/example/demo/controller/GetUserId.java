package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GetUserId {
    // private static final String userId = "82022999";

    @GetMapping("/user")
    // public String getUser() {
    public String getUserById(@RequestParam(value = "id", required = true) String id) {
        return "사번: " + id;
    }

    @GetMapping("/userid")
    public String getUserId() {
        // public String getUserById(@RequestParam(value = "id", required = true) String
        // id) {
        return "사번: 82022583";
    }
}
