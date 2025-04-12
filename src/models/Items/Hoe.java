package models.Items;

import enums.Items.HoeMaterial;
import models.Item;

public class Hoe implements Item {
    private final HoeMaterial material;

    public Hoe(HoeMaterial material) {
        this.material = material;
    }

    public HoeMaterial getMaterial() {
        return material;
    }
}
