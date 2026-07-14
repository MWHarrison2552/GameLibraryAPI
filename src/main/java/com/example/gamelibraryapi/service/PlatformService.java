package com.example.gamelibraryapi.service;

import com.example.gamelibraryapi.model.Game;
import com.example.gamelibraryapi.model.Platform;

import java.util.List;


//SERVICE IS THE BUSINESS LOGIC AREA. NEED A REGULAR SERVICE AND A SERVICE IMPLEMENTATION CLASS

public interface PlatformService {
    List<Platform> getAllPlatforms();
}
