package models.Items.Tool;

import models.Tool;

public class MilkPail implements Tool {
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


    @Override
    public void use(int x, int y) {

    }
}
