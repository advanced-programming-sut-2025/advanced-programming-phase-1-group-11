package models;

import enums.PlantsName;
import enums.Season;

public class Plant {
    private PlantsName name;
    private Seed Source;
    private int totalHarvestTime;
    private boolean oneTime;
    private int regrowthTime;
    private boolean isEdible;
    private int baseEnergy;
    private int baseHealth;
    private Season season;
    private boolean canBecomeGiant;
}
