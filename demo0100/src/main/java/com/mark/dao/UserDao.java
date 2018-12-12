package com.mark.dao;

import com.mark.entity.UserEntity;

import java.util.List;

public interface UserDao {
    List<UserEntity> getAll();
    
    UserEntity getOne(Long id);
    
    void insert(UserEntity user);
    
    void update(UserEntity user);
    
    void delete(Long id);
}
