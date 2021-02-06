import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Need_For_Speed_III {

    private static class Car {
        String type;
        int mileage;
        int fuel;

        public Car(String type, int mileage, int fuel) {
            this.type = type;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        @Override
        public String toString() {
            return String.format("%s -> Mileage: %d kms, Fuel in the tank: %d lt.", type, mileage, fuel);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Car> cars = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String carType = input[0];
            int mileage = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);

            cars.put(carType, new Car(carType, mileage, fuel));
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] commands = input.split(" : ");

            switch (commands[0]) {
                case "Drive":
                    drive(cars, commands[1], Integer.parseInt(commands[2]), Integer.parseInt(commands[3]));
                    break;
                case "Refuel":
                    refuel(cars, commands[1], Integer.parseInt(commands[2]));
                    break;
                case "Revert":
                    revert(cars, commands[1], Integer.parseInt(commands[2]));
                    break;
            }

            input = scanner.nextLine();
        }

        cars.entrySet().stream()
                .sorted(Comparator.comparing(f -> f.getValue().getType()))
                .sorted((f,s) -> s.getValue().getMileage() - f.getValue().getMileage())
                .forEach(e -> System.out.println(e.getValue().toString()));
    }

    private static void drive(Map<String, Car> cars, String carType, int distance, int fuel) {
        Car car = cars.get(carType);
        int carMileage = car.getMileage();
        int carFuel = car.getFuel();

        if (carFuel - fuel < 0) {
            System.out.println("Not enough fuel to make that ride");
        } else {
            carMileage += distance;
            carFuel -= fuel;

            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", carType, distance, fuel);

            if (carMileage >= 100000) {
                System.out.printf("Time to sell the %s!\n", carType);
                cars.remove(carType);
            } else {
                car.setMileage(carMileage);
                car.setFuel(carFuel);
                cars.put(carType, car);
            }
        }
    }

    private static void refuel(Map<String, Car> cars, String carType, int fuel) {
        Car car = cars.get(carType);
        int carFuel = car.getFuel();
        int fuelRefueled = fuel;

        if (carFuel + fuel > 75) {
            fuelRefueled = 75 - carFuel;
            car.setFuel(75);
        } else {
            car.setFuel(carFuel + fuel);
        }

        cars.put(carType, car);
        System.out.printf("%s refueled with %d liters\n", carType, fuelRefueled);
    }

    private static void revert(Map<String, Car> cars, String carType, int kilometers) {
        Car car = cars.get(carType);
        int carMileage = car.getMileage() - kilometers;

        System.out.printf("%s mileage decreased by %d kilometers\n", carType, kilometers);
        if (carMileage < 10000) {
            car.setMileage(10000);
        } else {
            car.setMileage(carMileage);
        }
        cars.put(carType, car);
    }
}
