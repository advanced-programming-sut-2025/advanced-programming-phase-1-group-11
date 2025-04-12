package models.Items;

import enums.Items.TrashCanMaterial;
import models.Item;

public class TrashCan implements Item {
    private final TrashCanMaterial material;

    public TrashCan(TrashCanMaterial material) {
        this.material = material;
    }

    public TrashCanMaterial getMaterial() {
        return material;
    }
}
