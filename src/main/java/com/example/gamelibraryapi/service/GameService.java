package com.example.gamelibraryapi.service;
import com.example.gamelibraryapi.model.Game;

import java.util.List;


//SERVICE IS THE BUSINESS LOGIC AREA. NEED A REGULAR SERVICE AND A SERVICE IMPLEMENTATION CLASS

public interface GameService { // Interface that the controller uses to move the logic into a service
    List<Game> getAllGames();
//    List<Game> postAllGames();
//    List<Game> putAllGames();
//    List<Game> deleteAllGames();
}
