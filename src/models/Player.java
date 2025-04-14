package models;

import enums.FoodType;
import enums.CraftableItemType;
import enums.Items.BackPackMaterial;
import enums.Skills;
import models.Items.BackPack;

import java.util.ArrayList;
import java.util.HashMap;

public class Player extends User {
    private int gold;
    private int energy;
    private int maxEnergy;
    private boolean death = false;
    private Tool equippedTool = null;
    public final BackPack backpack = new BackPack(BackPackMaterial.Default);
    private final HashMap<Skills, Integer> skills = new HashMap<Skills, Integer>();
    private int x;
    private int y;

    private ArrayList<CraftableItemType> learntCraftableItemTypes = new ArrayList<>();
    private ArrayList<FoodType> learntFoodTypes = new ArrayList<>();

    public Player(String username, String hashedPassword, String nickname, Email email, boolean gender) {
        super(username, hashedPassword, nickname, email, gender);
        this.gold = 0;
        this.energy = 200;
        this.maxEnergy = 200;
        skills.put(Skills.Farming, 0);
        skills.put(Skills.Mining, 0);//MAX LEVEL TODO  PICKAXE
        skills.put(Skills.Foraging, 0);//MAX LEVEL TODO  AXE
        skills.put(Skills.Fishing, 0);
    }

    public void increaseSkill(Skills skillType, int xp) {
        skills.put(skillType, skills.get(skillType) + xp);
    }

    public void changeGold(int gold) {
        this.gold += gold;
    }

    public void changeEnergy(int energy) {
        this.energy += energy;
    }

    public int getGold() {
        return gold;
    }

    public int getEnergy() {
        return energy;
    }

    public int getSkillLevel(Skills skillType) {
        return skills.get(skillType);//TODO
    }

    public void changeDeath(boolean death) {
        this.death = death;
    }

    public boolean isDead() {
        return death;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public Tool getEquippedTool() {
        return equippedTool;
    }

    public void setEquippedTool(Tool equippedTool) {
        this.equippedTool = equippedTool;
    }


    public void learnCraftingItem(CraftableItemType craftableItemType) {
        learntCraftableItemTypes.add(craftableItemType);
    }

    public boolean isCraftingItemLearnt(CraftableItemType craftableItemType) {
        return learntCraftableItemTypes.contains(craftableItemType);
    }

    public void craft(CraftableItemType craftableItemType) {
        //TODO
    }


    public void learnCookingItem(FoodType foodType) {
        learntFoodTypes.add(foodType);
    }

    public boolean isCookingItemLearnt(FoodType foodType) {
        return learntFoodTypes.contains(foodType);
    }

    public void cook (FoodType foodType) {
        // TODO
    }

    public void eat (Food food) {
        // TODO
    }

    public void walk () {

    }

}

