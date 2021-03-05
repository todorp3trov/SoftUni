package Speed_Racing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Car> cars = new LinkedHashMap<>();

        int numCars = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCars; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            if (!cars.containsKey(data[0])) {
                cars.put(data[0], new Car(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2])));
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] command = input.split("\\s+");

            if (command[0].equals("Drive")) {
                cars.get(command[1]).drive(Integer.parseInt(command[2]));
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Car> car : cars.entrySet()) {
            System.out.println(car.getValue().toString());
        }
    }
}
