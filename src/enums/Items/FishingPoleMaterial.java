package enums.Items;

public enum FishingPoleMaterial {
    Training(8, 25),
    Bamboo(8, 500),
    Fiberglass(6, 1800),
    Iridium(4, 7500);

    private final int energyNeeded;
    private final int price;
    private FishingPoleMaterial(int energyNeeded, int price) {
        this.energyNeeded = energyNeeded;
        this.price = price;

    }
}
