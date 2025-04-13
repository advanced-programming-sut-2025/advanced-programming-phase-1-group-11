package enums;

public enum Season {
    Spring(1),
    Summer(2),
    Fall(3),
    Winter(4);

    private int value;

    Season(int value) {
        this.value = value;
    }
}
