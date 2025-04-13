package models;

import enums.PlantsType;
import enums.Season;

import java.util.ArrayList;

public class Plant extends Cell{

    private boolean isVegetable;
    private int plantLevel;
    private int daysToNextLevel;
    private ArrayList<Integer> stages;
    private int baseSellPrice;
    private PlantsType name;
    private Seed source;
    private boolean oneTime;
    private int regrowthTime;
    private boolean isEdible;
    private int baseEnergy;
    private int baseHealth;
    private ArrayList<Season> seasons;
    private boolean canBecomeGiant;

    public Plant(
            boolean isTree,
            int plantLevel,
            int daysToNextLevel,
            ArrayList<Integer> stages,
            int baseSellPrice,
            PlantsType name,
            Seed source,
            boolean oneTime,
            int regrowthTime,
            boolean isEdible,
            int baseEnergy,
            int baseHealth,
            ArrayList<Season> seasons,
            boolean canBecomeGiant) {
        this.isVegetable = isTree;
        this.plantLevel = plantLevel;
        this.daysToNextLevel = daysToNextLevel;
        this.stages = stages;
        this.baseSellPrice = baseSellPrice;
        this.name = name;
        this.source = source;
        this.oneTime = oneTime;
        this.regrowthTime = regrowthTime;
        this.isEdible = isEdible;
        this.baseEnergy = baseEnergy;
        this.baseHealth = baseHealth;
        this.seasons = seasons;
        this.canBecomeGiant = canBecomeGiant;

    }

/*    public static Plant makePlant() {

    }*/
}
