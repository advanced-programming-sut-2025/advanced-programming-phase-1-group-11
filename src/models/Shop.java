package models;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
    private String name;
    private NPC owner;
    private Date startingTime;
    private Date endingTime;

    private boolean isOpened;

    private final HashMap<Item, Integer> allProducts= new HashMap<>();



}
