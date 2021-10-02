package com.example.cb_v2.service;

import com.example.cb_v2.entity.ToDoEntity;
import com.example.cb_v2.entity.UserEntity;
import com.example.cb_v2.model.Todo;
import com.example.cb_v2.repository.ToDoRepo;
import com.example.cb_v2.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepo toDoRepo;
    @Autowired
    private UserRepo userRepo;


    public Todo createTodo (ToDoEntity todo, Long userId){
        UserEntity user = userRepo.findById(userId).get();
        todo.setUser(user);
        return Todo.toModel(toDoRepo.save(todo));

    }

    public Todo completeTodo(Long id){
        ToDoEntity todo = toDoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return Todo.toModel(toDoRepo.save(todo));
    }
}
