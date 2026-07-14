package com.example.gamelibraryapi.service;

import com.example.gamelibraryapi.model.Game;
import com.example.gamelibraryapi.model.Platform;
import com.example.gamelibraryapi.repository.GameRepository;
import com.example.gamelibraryapi.repository.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//SERVICE IS THE BUSINESS LOGIC AREA. NEED A REGULAR SERVICE AND A SERVICE IMPLEMENTATION CLASS

// Logic that would be in the controller if the interface wasn't used. Must use "Impl" and
// "Implements" the service so springboot recognizes it
@Service
public class PlatformServiceImpl implements PlatformService {

    @Autowired
    private PlatformRepository platformRepository;

    @Override
    public List<Platform> getAllPlatforms() {
        return platformRepository.findAll();
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
