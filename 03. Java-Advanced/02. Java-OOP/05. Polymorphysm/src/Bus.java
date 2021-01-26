import java.text.DecimalFormat;

public class Bus extends Vehicle{
    private static final double FUEL_CONSUMPTION_COEFFICIENT = 1.4;
    private static DecimalFormat df = new DecimalFormat("###.##");

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void drive(double distance) {
        double fuelConsumed = distance * (super.getFuelConsumption() + FUEL_CONSUMPTION_COEFFICIENT);
        if (fuelConsumed > super.getFuelQuantity()) {
            System.out.printf("%s needs refueling\n", super.getClass().getSimpleName());
        } else {
            setFuelQuantity(super.getFuelQuantity() - fuelConsumed);
            System.out.printf("%s travelled %s km\n", super.getClass().getSimpleName(), df.format(Double.valueOf(distance)));
        }
    }

    public void driveEmpty(double distance) {
        double fuelConsumed = distance * super.getFuelConsumption();
        if (fuelConsumed > super.getFuelQuantity()) {
            System.out.printf("%s needs refueling\n", super.getClass().getSimpleName());
        } else {
            setFuelQuantity(super.getFuelQuantity() - fuelConsumed);
            System.out.printf("%s travelled %s km\n", super.getClass().getSimpleName(), df.format(Double.valueOf(distance)));
        }
    }

    @Override
    public void refuel(double liters) {
        double fuelRefill = super.getFuelQuantity() + liters;
        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
        } else if (fuelRefill > super.getTankCapacity()) {
            System.out.println("Cannot fit fuel in tank");
        } else {
            super.setFuelQuantity(fuelRefill);
        }
    }
}
