package models.Items;

import enums.Items.AxeMaterial;
import models.Item;

public class Axe implements Item {
    private AxeMaterial material;

    public Axe(AxeMaterial material) {
        this.material = material;
    }

    public AxeMaterial getMaterial() {
        return material;
    }
}
