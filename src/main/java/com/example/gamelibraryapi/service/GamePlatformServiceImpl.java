package com.example.gamelibraryapi.service;

import com.example.gamelibraryapi.model.GamePlatform;
import com.example.gamelibraryapi.model.Platform;
import com.example.gamelibraryapi.repository.GamePlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


// Logic that would be in the controller if the interface wasn't used. Must use "Impl" and
// "Implements" the service so springboot recognizes it
@Service
public class GamePlatformServiceImpl implements GamePlatformService {

    @Autowired
    private GamePlatformRepository gamePlatformRepository;

    @Override
    public List<GamePlatform> getAllGamePlatforms() {
        return gamePlatformRepository.findAll();
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
