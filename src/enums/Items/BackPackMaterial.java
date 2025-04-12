package enums.Items;

public enum BackPackMaterial {
    Default(12),
    Big(24),
    Infinity(100000);
    private final int Capacity;

    BackPackMaterial(int capacity) {
        this.Capacity = capacity;
    }
}
