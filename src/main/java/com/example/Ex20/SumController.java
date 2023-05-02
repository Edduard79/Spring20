package com.example.Ex20;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SumController {

    @Autowired
    private Environment environment;


    @GetMapping("/sum")
    public String getSum(){

        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);

        return "First Number: " + a + "\nSecond Number: " + b + "\nSum: " + (a+b);
    }
}
