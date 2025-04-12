package models.Items;

import enums.Items.SeytheMaterial;
import models.Item;
import models.Tool;

public class Scythe extends Tool {
    private final SeytheMaterial material;

    public Scythe(SeytheMaterial material) {
        this.material = material;
    }

    public SeytheMaterial getMaterial() {
        return material;
    }
}
