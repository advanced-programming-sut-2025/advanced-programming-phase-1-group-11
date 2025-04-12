package enums.Items;

public enum TrashCanMaterial {
    Default(0),
    Copper(0.15),
    Iron(0.3),
    Gold(0.45),
    Iridium(0.6);

    private final double ResiclePersentage;
    private TrashCanMaterial(double ResiclePersentage) {
        this.ResiclePersentage = ResiclePersentage;
    }
}
