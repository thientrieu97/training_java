package com.example.demologin.controller;

import com.example.demologin.model.Greeting;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/v1")
@Scope
public class CustomerGreetingController {

    private static final String greetingTemplate = "Hello, %s %s";
    // dung lam template nhung loi chao dua vao bien truyen vao

    private final AtomicLong counter = new AtomicLong(); // lu tru id cho cac lan ke tiep de tang dan

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "gender", defaultValue = "0") boolean gender,
                             @RequestParam(value = "customerName", defaultValue = "Customer") String customerName){

        return Greeting.builder()
                .id(counter.incrementAndGet()) //ince moi lan an request se tang len 1
                .content(String.format(greetingTemplate,gender ? "Mr." : "Ms.",customerName))  //? la if ngan gon
                .build();

    }
}
