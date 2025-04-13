package models;

import enums.Season;
import enums.Weather;

import java.util.ArrayList;

public class Game {
    private final ArrayList<Player> players = new ArrayList<Player>();
    private Player currentPlayer;
    private final Date date = new Date(1, Season.Spring, 1, true, 9, 0);
    private final Map map = new Map(generateWeatherByDate(date));

    public Game(ArrayList<Player> players) {
        this.players.addAll(players);
    }

    public void SetCurrentPlayer(Player player) {
        currentPlayer = player;
    }

    public Player GetCurrentPlayer() {
        return currentPlayer;
    }

    public void AddPlayer(Player player) {
        players.add(player);
    }

    public ArrayList<Player> GetPlayers() {
        return players;
    }

    public Date GetDate() {
        return date;
    }

    public Weather generateWeatherByDate(Date date) {
        return null;
    }
}
