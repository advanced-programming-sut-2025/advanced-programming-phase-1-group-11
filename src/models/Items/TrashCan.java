package models.Items;

import enums.Items.TrashCanMaterial;
import models.Item;
import models.Tool;

public class TrashCan extends Tool {
    private final TrashCanMaterial material;

    public TrashCan(TrashCanMaterial material) {
        this.material = material;
    }

    public TrashCanMaterial getMaterial() {
        return material;
    }
}
