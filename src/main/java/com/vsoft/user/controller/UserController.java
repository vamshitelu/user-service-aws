package com.vsoft.user.controller;

import com.vsoft.user.model.UserRegister;
import com.vsoft.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLDataException;

@RequestMapping("/api/")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public ResponseEntity<Object> registerUser(@RequestBody UserRegister user) {
        String resp = userService.registerUser(user);
        return ResponseEntity.ok().body(resp);
    }
}
