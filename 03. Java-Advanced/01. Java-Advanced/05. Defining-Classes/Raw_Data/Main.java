package Raw_Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        int numCars = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCars; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            String model = data[0];
            Engine engine = new Engine(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            Cargo cargo = new Cargo(Integer.parseInt(data[3]), data[4]);
            Tire[] tires = new Tire[4];

            int count = 0;
            for (int j = 5; j <= 12; j += 2) {
                double tirePressure = Double.parseDouble(data[j]);
                int tireAge = Integer.parseInt(data[j + 1]);

                tires[count++] = new Tire(tirePressure, tireAge);
            }

            cars.add(new Car(model, engine, cargo, tires));
        }

        String cargoType = scanner.nextLine();

        if (cargoType.equals("fragile")) {
            for (Car car : cars) {
                if (car.getCargo().getType().equals(cargoType)) {
                    Tire[] tires = car.getTires();
                    for (int i = 0; i < 4; i++) {
                        if (tires[i].hasLowPressureTire()) {
                            System.out.println(car.getModel());
                            break;
                        }
                    }
                }
            }
        } else if (cargoType.equals("flamable")) {
            for (Car car : cars) {
                if (car.getCargo().getType().equals(cargoType) && (car.getEngine().getPower() > 250)) {
                    System.out.println(car.getModel());
                }
            }
        }

    }
}
