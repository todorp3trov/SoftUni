package Car_Salesman;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Engine> engines = new HashMap<>();
        List<Car> cars = new LinkedList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            Engine engine;

            if (data.length == 4) {
                engine = new Engine(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), data[3]);
            } else if (data.length == 3) {
                try {
                    engine = new Engine(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                } catch (Exception e) {
                    engine = new Engine(data[0], Integer.parseInt(data[1]), data[2]);
                }
            } else {
                engine = new Engine(data[0], Integer.parseInt(data[1]));
            }

            engines.putIfAbsent(data[0], engine);
        }

        int m = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < m; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            Car car;

            if (data.length == 4) {
                car = new Car(data[0], engines.get(data[1]), Integer.parseInt(data[2]), data[3]);
            } else if (data.length == 3) {
                try {
                    car = new Car(data[0], engines.get(data[1]), Integer.parseInt(data[2]));
                } catch (Exception e) {
                    car = new Car(data[0], engines.get(data[1]), data[2]);
                }
            } else {
                car = new Car(data[0], engines.get(data[1]));
            }

            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
