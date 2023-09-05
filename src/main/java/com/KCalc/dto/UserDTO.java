package com.KCalc.dto;

import com.KCalc.entity.Meal;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;
@Data
@AllArgsConstructor
public class UserDTO {
    private String id;
    private String name;
    private String surname;
    Set<Meal> meals;
    private String email;
    private String password;
}
