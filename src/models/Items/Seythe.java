package models.Items;

import enums.Items.SeytheMaterial;
import models.Item;

public class Seythe implements Item {
    private final SeytheMaterial material;

    public Seythe(SeytheMaterial material) {
        this.material = material;
    }

    public SeytheMaterial getMaterial() {
        return material;
    }
}
