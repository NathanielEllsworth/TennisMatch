package com.ironyard.controller;

import com.ironyard.data.Player;
import com.ironyard.repositories.PlayerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nathanielellsworth on 10/24/16.
 */
@RestController
public class PlayerController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private PlayerRepository playerRepo;

    @Autowired
    public void setPlayerRepo(PlayerRepository playerRepo){this.playerRepo = playerRepo;}

    @RequestMapping(value = "/player", method = RequestMethod.POST, produces = "application/json")
    public Player save(@RequestBody Player aPlayer){
        playerRepo.save(aPlayer);
        return playerRepo.findOne(aPlayer.getId());
    }

    @RequestMapping(value = "/players", method = RequestMethod.GET)
    public Iterable<Player> list(){
        Iterable<Player> found = playerRepo.findAll();
        return found;
    }

    @RequestMapping(value = "/player/update", method = RequestMethod.GET)
    public Player update(@RequestBody Player aPlayer){
        playerRepo.save(aPlayer);
        return playerRepo.findOne(aPlayer.getId());
    }

    @RequestMapping(value = "/player/delete/{id}", method = RequestMethod.DELETE)
    public Player delete(@PathVariable long id){
        Player deleted = playerRepo.findOne(id);
        playerRepo.delete(id);
        return deleted;
    }

    @RequestMapping(value = "/player/{id}", method = RequestMethod.GET)
    public Player show(@PathVariable Long id){
        return playerRepo.findOne(id);
    }
}
