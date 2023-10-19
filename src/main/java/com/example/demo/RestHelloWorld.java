package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@RestController
public class RestHelloWorld {
        @Value("${quoteOfTheDay}")
        private String quoteOfTheDay;

        @GetMapping("/")
        public String sayHello() {
                return "Welcome from MY Java App!<br><br><br>*****Quote of the Day*****<br><br>" + quoteOfTheDay;
        }
}
