package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factrory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Studentity;
import com.example.demo.service.Studentservice;

@RestController
@RequestMapping("/student")
public class Studentcontroller{
    private final Studentservice ser;
    @Autowired
    
}