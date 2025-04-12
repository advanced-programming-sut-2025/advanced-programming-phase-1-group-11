package models.Items;

import enums.Items.FishingPoleMaterial;
import models.Item;

public class FishingPole implements Item {
    private final FishingPoleMaterial material;

    public FishingPole(FishingPoleMaterial material) {
        this.material = material;
    }
    public FishingPoleMaterial getMaterial() {
        return material;
    }
}
