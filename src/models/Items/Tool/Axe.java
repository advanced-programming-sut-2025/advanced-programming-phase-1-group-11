package models.Items.Tool;

import enums.Tools.AxeMaterial;
import models.Tool;

public class Axe implements Tool {
    private AxeMaterial material;

    public Axe(AxeMaterial material) {
        this.material = material;
    }

    public AxeMaterial getMaterial() {
        return material;
    }


    @Override
    public void use() {

    }
}
