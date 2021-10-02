package com.example.cb_v2.controller;

import com.example.cb_v2.entity.UserEntity;
import com.example.cb_v2.exception.UserAlreadyExistException;
import com.example.cb_v2.exception.UserNotFoundException;
import com.example.cb_v2.model.User;
import com.example.cb_v2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user){
        try {
            userService.registration(user);
            return ResponseEntity.ok("Пользователь успешно сохранен");
        }catch (UserAlreadyExistException e ){
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e ){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @GetMapping
    public ResponseEntity getOneUser(@RequestParam Long id){
        try {
            return ResponseEntity.ok(userService.getOne(id));
        }catch (UserNotFoundException e ){
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e ){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/test")
    public String getOneUserTest(User user){
            return "user-create";
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id){
        try {
            return ResponseEntity.ok(userService.delete(id));
        }catch (Exception e ){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
