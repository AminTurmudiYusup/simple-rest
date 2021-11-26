package com.example.apibestpractice.controller;

import com.example.apibestpractice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getListUser(){
        List<User> listUser=new ArrayList<>();
        User user1=new User("123", "Amin","Babakan");
        User user2=new User("456", "Andi", "Lapang");
        listUser.add(user1);
        listUser.add(user2);
        return listUser;
    }
}
