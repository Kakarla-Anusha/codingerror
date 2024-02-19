/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.player.PlayerService;

@RestController
public class PlayerController {
    PlayerService playerservice = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getplayers() {
        return playerservice.getplayers();

    }

}
