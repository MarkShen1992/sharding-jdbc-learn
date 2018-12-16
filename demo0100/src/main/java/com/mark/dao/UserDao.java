package com.mark.dao;

import com.mark.entity.UserEntity;

import java.util.List;

public interface UserDao {
    /**
     * 获取所有用户
     * @return
     */
    List<UserEntity> getAll();
    
    /**
     * 根据用户id获取用户
     * @param id
     * @return
     */
    UserEntity getOne(Long id);
    
    /**
     * 向数据库中的插入一个用户
     * @param user
     */
    void insert(UserEntity user);
    
    /**
     * 更新数据库中用户数据
     * @param user
     */
    void update(UserEntity user);
    
    /**
     * 根据id删除用户数据
     * @param id
     */
    void delete(Long id);
}
