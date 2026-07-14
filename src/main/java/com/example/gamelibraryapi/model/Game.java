package com.example.gamelibraryapi.model;

import jakarta.persistence.*;
import lombok.Data;


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
