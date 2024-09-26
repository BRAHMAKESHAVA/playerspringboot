package com.example.player;

import com.example.player.*;
import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player getById(int id);

    Player addPlayer(Player player);

    Player updatePlayer(int id, Player player);

    void delPlayer(int id);
}
