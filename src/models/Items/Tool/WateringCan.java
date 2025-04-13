package models.Items.Tool;

import enums.Items.WateringCanMaterial;
import models.Tool;

public class WateringCan implements Tool {
    private final WateringCanMaterial material;

    public WateringCan(WateringCanMaterial material) {
        this.material = material;
    }

    public WateringCanMaterial getMaterial() {
        return material;
    }


    @Override
    public void use(int x, int y) {

    }
}
