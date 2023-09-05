package com.KCalc.dto.mapper;

import com.KCalc.dto.UserDTO;
import com.KCalc.entity.User;

public class UserMapper {

    public UserDTO toDtoUpdate(User u){
        return new UserDTO(u.getId(),u.getName(),u.getSurname(),null,u.getEmail(),u.getPassword());
    }

    public UserDTO toDtoInsert(User u){
        return new UserDTO(null,u.getName(),u.getSurname(),null,u.getEmail(),u.getPassword());
    }

    public User toEntity(UserDTO u){
        return new User(u.getId(), u.getName(),u.getSurname(),u.getMeals(),u.getEmail(),u.getPassword());
    }



}
