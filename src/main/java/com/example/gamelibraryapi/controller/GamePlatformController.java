package com.example.gamelibraryapi.controller;


import com.example.gamelibraryapi.model.GamePlatform;
import com.example.gamelibraryapi.service.GamePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gameplatform") // Sets base URL
public class GamePlatformController {
    private final GamePlatformService gamePlatformService; // Inject the interface, not the Implementation!

    @Autowired
    public GamePlatformController(GamePlatformService service){
        this.gamePlatformService = service;
    }

    // GET, Grabs the indicated resource(s)
    @GetMapping
    public List<GamePlatform> getAllGamePlatforms() {
        return gamePlatformService.getAllGamePlatforms();
    }
}
