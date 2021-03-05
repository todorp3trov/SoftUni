package Car_Salesman;

class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.weight = -1;
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = -1;
        this.color = "n/a";
    }

    @Override
    public String toString() {
        String weightStringValue = String.valueOf(weight);
        if (weight == -1) {
            weightStringValue = "n/a";
        }
        return String.format("%s:\n" +
                        "%s:\n" +
                        "Power: %d\n" +
                        "Displacement: %s\n" +
                        "Efficiency: %s\n" +
                        "Weight: %s\n" +
                        "Color: %s",
                model, engine.getModel(), engine.getPower(), engine.getDisplacement(),
                engine.getEfficiency(), weightStringValue, color);
    }
}
