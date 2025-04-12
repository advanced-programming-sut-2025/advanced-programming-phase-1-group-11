package models.Items;

import enums.Items.HoeMaterial;
import models.Item;
import models.Tool;

public class Hoe extends Tool {
    private final HoeMaterial material;

    public Hoe(HoeMaterial material) {
        this.material = material;
    }

    public HoeMaterial getMaterial() {
        return material;
    }
}
