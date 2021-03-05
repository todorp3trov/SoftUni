package Cat_Lady;

class Cat {
    private String name;
    private double characteristic;

    public Cat(String name, double characteristic) {
        this.name = name;
        this.characteristic = characteristic;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.getClass().getSimpleName(), name, characteristic);
    }
}
