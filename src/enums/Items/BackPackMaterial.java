package enums.Items;

public enum BackPackMaterial {
    Default(12),
    Big(24),
    Infinity(1000000);
    private final int Capacity;

    BackPackMaterial(int capacity) {
        this.Capacity = capacity;
    }
}
