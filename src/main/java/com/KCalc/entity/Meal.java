package com.KCalc.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "Meal")
public class Meal implements Serializable {
    private static final long serialVersionUID = -9032770611804973466L;

    @Id
    @Column(name = "id")
    private String id;

//decideremo poi la correlazione tra meal e product

}
