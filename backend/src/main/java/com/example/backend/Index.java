package com.example.backend;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class Index {

    static class RequestBodyDto {
        private String name;
        private Integer age;
        private String secretIdentity;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getSecretIdentity() {
            return secretIdentity;
        }

        public void setSecretIdentity(String secretIdentity) {
            this.secretIdentity = secretIdentity;
        }
    }

    @RequestMapping("/test")
    public String index(@RequestBody RequestBodyDto bodyDto, HttpServletRequest request) {
//        System.out.println("hello");
//        System.out.println(bodyDto);
        return "hello";
    }
}
