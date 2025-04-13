package models.Items;

import models.Item;
import models.Tool;

public class Shear implements Tool {
    private final int price;
    private final int energyNeeded;

    public Shear(int price, int energyNeeded) {
        this.price = price;
        this.energyNeeded = energyNeeded;
    }

    public int getPrice() {
        return price;
    }

    public int getEnergyNeeded() {
        return energyNeeded;
    }
}
