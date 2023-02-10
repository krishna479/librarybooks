package com.example.Sql_Rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;

@RestController
@RequestMapping("/user")
public class UserController {
   @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody() User user){
       return userService.addUser(user);
    }

    @GetMapping("/get")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }
}
