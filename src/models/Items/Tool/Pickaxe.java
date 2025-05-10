package models.Items.Tool;

import enums.Tools.PickaxeMaterial;
import models.Tool;


public class Pickaxe implements Tool {
    private final PickaxeMaterial material;

    public Pickaxe(PickaxeMaterial material) {
        this.material = material;
    }

    public PickaxeMaterial getMaterial() {
        return material;
    }


    @Override
    public void use(int x, int y) {

    }
}
