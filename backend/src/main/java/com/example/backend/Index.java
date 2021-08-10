package com.example.backend;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class Index {
    @RequestMapping("/test")
    public String index(@RequestBody Map<String, String> params, HttpServletRequest request) {
        return "hello";
    }
}
