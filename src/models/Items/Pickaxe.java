package models.Items;

import enums.Items.PickaxeMaterial;
import models.Item;


public class Pickaxe implements Item {
    private final PickaxeMaterial material;

    public Pickaxe(PickaxeMaterial material) {
        this.material = material;
    }

    public PickaxeMaterial getMaterial() {
        return material;
    }
}
