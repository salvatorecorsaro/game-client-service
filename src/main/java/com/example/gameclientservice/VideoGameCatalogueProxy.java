package com.example.gameclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@FeignClient("GAME-CATALOGUE-SERVICE")
public interface VideoGameCatalogueProxy {

    @GetMapping("/videogames/random")
    VideoGame getRandom();

    @GetMapping("/videogames")
    List<VideoGame> getAllVideoGames();

    @PostMapping("/videogames")
    VideoGame createNewVideoGame(@RequestBody VideoGame newVideoGame);
}
