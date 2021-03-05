package Constructors;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCars = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCars; i++) {
            String[] data = scanner.nextLine().split(" ");
            Car car;
            if (data.length == 1) {
                car = new Car(data[0]);
            } else {
                car = new Car(data[0], data[1], Integer.parseInt(data[2]));
            }
            System.out.println(car.carInfo());
        }
    }
}
