package models.Items.Tool;

import enums.Tools.TrashCanMaterial;
import models.Tool;

public class TrashCan implements Tool {
    private final TrashCanMaterial material;

    public TrashCan(TrashCanMaterial material) {
        this.material = material;
    }

    public TrashCanMaterial getMaterial() {
        return material;
    }


    @Override
    public void use(int x, int y) {

    }
}
