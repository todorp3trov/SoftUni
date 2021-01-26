package TrafficLight;

public enum Signal {
    GREEN(0),
    YELLOW(1),
    RED(2);

    private int ordinal;

    Signal(int ordinal) {
        this.ordinal = ordinal;
    }

    public int getOrdinal() {
        return ordinal;
    }
}
