import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Vehicle_Catalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split(" ");

            String vehicleType = data[0];
            String model = data[1];
            String color = data[2];
            int horsePower = Integer.parseInt(data[3]);

            Vehicle vehicle = new Vehicle(vehicleType, model, color, horsePower);
            vehicles.add(vehicle);

            input = scanner.nextLine();
        }

        while (!input.equals("Close the Catalogue")) {
            String model = input;

            vehicles.stream()
                    .filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            input = scanner.nextLine();
        }

        List<Vehicle> cars = vehicles.stream()
                .filter(vehicle -> vehicle.getVehicleType().equals("car"))
                .collect(Collectors.toList());
        List<Vehicle> trucks = vehicles.stream()
                .filter(vehicle -> vehicle.getVehicleType().equals("truck"))
                .collect(Collectors.toList());

        System.out.printf("Cars have average horsepower of: %.2f.\n", averageHorsepower(cars));
        System.out.printf("Trucks have average horsepower of: %.2f.\n", averageHorsepower(trucks));
    }

    private static double averageHorsepower(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0.0;
        }

        return vehicles.stream().mapToDouble(Vehicle::getHorsepower).sum()/vehicles.size();
    }

    private static class Vehicle {
        String vehicleType;
        String model;
        String color;
        int horsepower;

        public Vehicle(String vehicleType, String model, String color, int horsepower) {
            this.vehicleType = vehicleType;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getVehicleType() {
            return vehicleType;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return "Type: " + vehicleType.substring(0, 1).toUpperCase() + vehicleType.substring(1) + "\n" +
                    "Model: " + model + "\n" +
                    "Color: " + color + "\n" +
                    "Horsepower: " + horsepower;
        }
    }
}
