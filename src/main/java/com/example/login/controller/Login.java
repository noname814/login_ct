package com.example.login.controller;

import org.springframework.stereotype.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.*;
import java.io.*;

import com.example.login.model.User;

@Controller
public class Login {

    @GetMapping("/")
    public String loginpage() {
        return "login.html";
    }

    @PostMapping("/login")
    public void loginvalidator(User user, HttpServletResponse res) throws IOException{
        
        if ("admin".equals(user.getUsername()) && "123".equals(user.getPassword())){
            
            res.sendRedirect("/success.html");
        }
        else{
            res.sendRedirect("/fail.html");
        }
    }
    
    
}
