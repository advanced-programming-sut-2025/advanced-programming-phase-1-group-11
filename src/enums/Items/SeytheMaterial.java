package enums.Items;

public enum SeytheMaterial {
    Default(2);
    private final int energyNeeded;
    private SeytheMaterial(int energyNeeded) {
        this.energyNeeded = energyNeeded;
    }
}
