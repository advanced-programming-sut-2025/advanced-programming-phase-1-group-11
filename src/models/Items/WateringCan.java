package models.Items;

import enums.Items.WateringCanMaterial;
import models.Item;
import models.Tool;

public class WateringCan extends Tool {
    private final WateringCanMaterial material;

    public WateringCan(WateringCanMaterial material) {
        this.material = material;
    }

    public WateringCanMaterial getMaterial() {
        return material;
    }
}
