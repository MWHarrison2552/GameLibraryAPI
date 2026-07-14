package com.example.gamelibraryapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "GamePlatform")
@Data // Uses the Lombok dependency to create a Getter and Setter
public class GamePlatform {
    //@Getter // Uses the Lombok dependency to create a Getter
    //@Setter // Uses the Lombok dependency to create a Setter

    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "GameID") // Don't necessarily need the "name =" portion is column name is the same as var name
    private Game game;

    @ManyToOne
    @JoinColumn(name = "PlatformID")
    private Platform platform;
}
