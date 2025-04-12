package models.Items;

import enums.Items.WateringCanMaterial;
import models.Item;

public class WateringCan implements Item {
    private final WateringCanMaterial material;

    public WateringCan(WateringCanMaterial material) {
        this.material = material;
    }

    public WateringCanMaterial getMaterial() {
        return material;
    }
}
