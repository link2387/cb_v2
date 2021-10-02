package com.example.cb_v2.controller;

import com.example.cb_v2.entity.ToDoEntity;
import com.example.cb_v2.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    @Autowired
    private ToDoService toDoService;

    @PostMapping
    public ResponseEntity createToDo(@RequestBody ToDoEntity todo,
                                     @RequestParam Long userId){
        try {
           return ResponseEntity.ok(toDoService.createTodo(todo, userId));
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @PutMapping
    public ResponseEntity completeToDo( @RequestParam Long id){
        try {
            return ResponseEntity.ok(toDoService.completeTodo(id));
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
