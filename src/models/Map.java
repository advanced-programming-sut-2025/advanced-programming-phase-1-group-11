package models;

import enums.Weather;

import java.util.ArrayList;

public class Map {
    private Weather weather;
    private Cell[][] cells;
    public Map(Weather weather) {
        this.weather = weather;
        //TODO generate map
    }

}
