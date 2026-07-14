package com.example.gamelibraryapi.model;

import jakarta.persistence.*;
import lombok.Data;


// PART OF THE DATA LAYER. BLUEPRINT. REPRESENTS THE DATA STRUCTURE OF THE APPLICATION. MIRRORS THE LAYOUT OF THE DATABASE TABLES
// HOLDS THE STATE OF DATA. WHAT THE DATA LOOKS LIKE. DOESN'T "DO" ANYTHING, BESIDES HOLD AND STRUCTURE DATA
@Data // Uses the Lombok dependency to create Getters and Setters for all
@Table(name = "Games")
@Entity
public class Game {
    //@Getter // Uses the Lombok dependency to create a Getter
    //@Setter // Uses the Lombok dependency to create a Setter

    @Id // Primary Key
    @Column (name = "GameID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Title") // Don't necessarily need the "name =" portion is column name is the same as var name
    private String title;

    @Column(name = "ReleaseYear")
    private String releaseYear;

    @Column(name = "IsFavorite")
    private Integer isFavorite;
}
