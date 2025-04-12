package enums.Items;

public enum HoeMaterial {
    Default(5),
    Copper(4),
    Iron(3),
    Gold(2),
    Iridium(1);

    private final int energyNeeded;
    HoeMaterial(int energyNeeded) {
        this.energyNeeded = energyNeeded;
    }
}
