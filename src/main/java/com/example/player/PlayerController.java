/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import com.example.player.*;
import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {
    PlayerService playerservice = new PlayerService();

    @DeleteMapping("/players/{playerId}")
    public void delPlayer(@PathVariable("playerId") int id) {
        playerservice.delPlayer(id);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int id, @RequestBody Player player) {
        return playerservice.updatePlayer(id, player);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerservice.addPlayer(player);
    }

    @GetMapping("/players/{playerId}")
    public Player getById(@PathVariable("playerId") int id) {
        return playerservice.getById(id);
    }

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playerservice.getPlayers();
    }

}
