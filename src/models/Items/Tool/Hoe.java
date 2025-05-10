package models.Items.Tool;

import enums.Tools.HoeMaterial;
import models.Tool;

public class Hoe implements Tool {
    private final HoeMaterial material;

    public Hoe(HoeMaterial material) {
        this.material = material;
    }

    public HoeMaterial getMaterial() {
        return material;
    }


    @Override
    public void use(int x, int y) {

    }
}
