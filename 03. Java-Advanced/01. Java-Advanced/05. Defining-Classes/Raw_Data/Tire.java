package Raw_Data;

class Tire {
    private double pressure;
    private int age;
    private boolean hasLowPressureTire;

    public Tire(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;
        this.hasLowPressureTire = pressure < 1;
    }

    public boolean hasLowPressureTire() {
        return hasLowPressureTire;
    }
}
