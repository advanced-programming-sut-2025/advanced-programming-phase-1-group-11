package models.Items.Tool;

import enums.Items.FishingPoleMaterial;
import models.Tool;

public class FishingPole implements Tool {
    private final FishingPoleMaterial material;

    public FishingPole(FishingPoleMaterial material) {
        this.material = material;
    }
    public FishingPoleMaterial getMaterial() {
        return material;
    }


    @Override
    public void use(int x, int y) {

    }
}
