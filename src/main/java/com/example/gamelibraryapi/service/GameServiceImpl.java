package com.example.gamelibraryapi.service;

import com.example.gamelibraryapi.model.Game;
import com.example.gamelibraryapi.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


// Logic that would be in the controller if the interface wasn't used. Must use "Impl" and
// "Implements" the service so springboot recognizes it
@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }
//    @Override
//    public List<Game> postAllGames() {
//        return gameRepository.findAll();
//    }
//    @Override
//    public List<Game> putAllGames() {
//        return gameRepository.findAll();
//    }
//    @Override
//    public List<Game> deleteAllGames() {
//        return gameRepository.findAll();
//    }
}
