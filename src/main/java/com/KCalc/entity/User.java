package com.KCalc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = -9032770611804973466L;

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    //La tabella rappresenta i pasti che l'utente ha fatto
    @ManyToMany
    Set<Meal> meals;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;


}
