package com.example.cb_v2.repository;

import com.example.cb_v2.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long>{

    UserEntity findByUsername(String username);
}
//