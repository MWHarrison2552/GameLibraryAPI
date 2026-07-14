package com.example.gamelibraryapi.controller;
import com.example.gamelibraryapi.model.Platform;
import com.example.gamelibraryapi.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


//MAPS THE PATH AND HANDLES INCOMING API REQUESTS

@RestController
@RequestMapping("/api/platforms") // Sets base URL
public class PlatformController {
    private final PlatformService platformService; // Inject the interface, not the Implementation!

    @Autowired
    public PlatformController(PlatformService service){
        this.platformService  = service;
    }

    // GET, Grabs the indicated resource(s)
    @GetMapping
    public List<Platform> getAllPlatforms() {
        return platformService.getAllPlatforms();
    }
}
