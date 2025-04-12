package models.Items;

import enums.Items.FishingPoleMaterial;
import models.Item;
import models.Tool;

public class FishingPole extends Tool {
    private final FishingPoleMaterial material;

    public FishingPole(FishingPoleMaterial material) {
        this.material = material;
    }
    public FishingPoleMaterial getMaterial() {
        return material;
    }
}
