package enums;

public enum Seasons {
    Spring(1),
    Summer(2),
    Fall(3),
    Winter(4);

    private int value;

    Seasons(int value) {
        this.value = value;
    }
}
