package com.example.cb_v2.repository;

import com.example.cb_v2.entity.ToDoEntity;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepo extends CrudRepository<ToDoEntity,Long> {
}
