package enums.Items;

public enum WateringCanMaterial {
    Default(5, 40),
    Copper(4, 55),
    Iron(3, 70),
    Gold(2, 85),
    Iridium(1, 100);

    private final int energyNeeded;
    private final int Capacity;
    WateringCanMaterial(int energyNeeded, int Capacity) {
        this.energyNeeded = energyNeeded;
        this.Capacity = energyNeeded;
    }
}
