package com.example.gamelibraryapi.controller;
import com.example.gamelibraryapi.model.Game;
import com.example.gamelibraryapi.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/games") // Sets base URL
public class GameController {
    private final GameService gameService; // Inject the interface, not the Implementation!

    @Autowired
    public GameController(GameService service){
        this.gameService  = service;
    }

    // GET, Grabs the indicated resource(s)
    @GetMapping
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }
//
//    // POST, Create new resource regardless of if one exists. Can create multiple resources eaech time it's called
//    // Sends data to the collection: /api/games
//    @PostMapping
//    public List<Game> postAllGames() {
//        return gameService.postAllGames();
//    }
//
//    // PUT, Create resource if it doesn't exist. Update resource if it does and matches URL. Identical outcome each call
//    // Sends data directly to resource: /api/games/123
//    @PutMapping
//    public List<Game> putAllGames() {
//        return gameService.putAllGames();
//    }
//
//    // DELETE, removes a resource
//    @DeleteMapping
//    public List<Game> deleteAllGames() {
//        return gameService.deleteAllGames();
//    }
}
