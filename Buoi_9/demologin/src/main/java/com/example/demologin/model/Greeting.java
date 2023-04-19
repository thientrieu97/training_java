package com.example.demologin.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder  // dung ham buider de gan du lieu vao cho greeting
public class Greeting {
    private long id;
    private String content;
}
