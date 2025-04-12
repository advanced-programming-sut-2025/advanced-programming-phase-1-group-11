package models.Items;

import enums.Items.BackPackMaterial;
import models.Item;

public class BackPack implements Item {
    private final BackPackMaterial material;

    public BackPack(BackPackMaterial material) {
        this.material = material;
    }
}
