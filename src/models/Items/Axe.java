package models.Items;

import enums.Items.AxeMaterial;
import models.Item;
import models.Tool;

public class Axe extends Tool {
    private AxeMaterial material;

    public Axe(AxeMaterial material) {
        this.material = material;
    }

    public AxeMaterial getMaterial() {
        return material;
    }

}
