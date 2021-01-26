import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] carInfo = scanner.nextLine().split(" ");
        Car car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));

        String[] truckInfo = scanner.nextLine().split(" ");
        Truck truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3]));

        String[] busInfo = scanner.nextLine().split(" ");
        Bus bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));


        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "Drive":
                    if (command[1].equals("Car")) {
                        car.drive(Double.parseDouble(command[2]));
                    } else if (command[1].equals("Truck")) {
                        truck.drive(Double.parseDouble(command[2]));
                    } else {
                        bus.drive(Double.parseDouble(command[2]));
                    }
                    break;
                case "Refuel":
                    if (command[1].equals("Car")) {
                        car.refuel(Double.parseDouble(command[2]));
                    } else if (command[1].equals("Truck")) {
                        truck.refuel(Double.parseDouble(command[2]));
                    } else {
                        bus.refuel(Double.parseDouble(command[2]));
                    }
                    break;
                case "DriveEmpty":
                    bus.driveEmpty(Double.parseDouble(command[2]));
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);

        Pattern pattern = Pattern.compile("\\s++@gmail.com");
        Matcher m = pattern.matcher(scanner.nextLine());
    }
}
