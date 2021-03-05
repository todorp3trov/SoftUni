package Speed_Racing;

class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPerKm;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPerKm;
        this.distanceTraveled = 0;
    }

    public void drive(int distance) {
        double fuelCost = distance * fuelCostPerKm;
        if (fuelAmount - fuelCost < 0) {
            System.out.println("Insufficient fuel for the drive");
        } else {
            fuelAmount -= fuelCost;
            distanceTraveled += distance;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, distanceTraveled);
    }
}
