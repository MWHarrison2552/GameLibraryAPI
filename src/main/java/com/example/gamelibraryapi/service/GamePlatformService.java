package com.example.gamelibraryapi.service;

import com.example.gamelibraryapi.model.GamePlatform;

import java.util.List;


//SERVICE IS THE BUSINESS LOGIC AREA. NEED A REGULAR SERVICE AND A SERVICE IMPLEMENTATION CLASS

public interface GamePlatformService {
    List<GamePlatform> getAllGamePlatforms();
//    List<GamePlatform> postAllGamePlatforms();
//    List<GamePlatform> putAllGamePlatforms();
//    List<GamePlatform> deleteAllGamePlatforms();
}
