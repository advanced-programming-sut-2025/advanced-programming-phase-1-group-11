package models.Items.Tool;

import enums.Tools.SeytheMaterial;
import models.Tool;

public class Scythe implements Tool {
    private final SeytheMaterial material;

    public Scythe(SeytheMaterial material) {
        this.material = material;
    }

    public SeytheMaterial getMaterial() {
        return material;
    }


    @Override
    public void use(int x, int y) {

    }
}
