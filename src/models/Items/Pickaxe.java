package models.Items;

import enums.Items.PickaxeMaterial;
import models.Item;
import models.Tool;


public class Pickaxe extends Tool {
    private final PickaxeMaterial material;

    public Pickaxe(PickaxeMaterial material) {
        this.material = material;
    }

    public PickaxeMaterial getMaterial() {
        return material;
    }
}
