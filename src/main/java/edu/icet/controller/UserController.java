package edu.icet.controller;

import edu.icet.dto.User;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.Objects;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    @Autowired
    private final UserService service;

    @PostMapping("/add-user")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user){
        service.addUser(user);
        System.out.println(user);
    }
    @GetMapping("/checkeEmail/{email}")
    public boolean checkeEmail(@PathVariable String email){
        boolean b = service.checkeEmail(email);
        System.out.println(b);
        return b;
    }
    @GetMapping("/checkePassword/{password}/{email}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public boolean checkePassword(@PathVariable String email,@PathVariable String password){
        String correctPassword = service.checkePassword(email);
        System.out.println(correctPassword+" "+password);
        if(Objects.equals(correctPassword, password)){
            return true;
        }else {
            return false;
        }
    }
}
