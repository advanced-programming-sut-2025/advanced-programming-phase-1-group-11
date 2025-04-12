package models.Items;

import models.Item;
import models.Tool;

public class MilkPail extends Tool {
    private final int price;
    private final int energyNeeded;

    public MilkPail(int price, int energyNeeded) {
        this.price = price;
        this.energyNeeded = energyNeeded;
    }

    public int getPrice() {
        return price;
    }

    public int getEnergyNeeded() {
        return energyNeeded;
    }
    public int getMaterial
}
