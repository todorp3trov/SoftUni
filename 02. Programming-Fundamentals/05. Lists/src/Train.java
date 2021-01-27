import java.util.ArrayList;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] splitter = input.split(" ");
        ArrayList<Integer> train = new ArrayList<>();
        for (String s : splitter) {
            train.add(Integer.parseInt(s));
        }

        int maxCapacityPerWagon = Integer.parseInt(scanner.nextLine());
        input = scanner.nextLine();
        while (!input.equals("end")) {
            try {
                String[] command = input.split(" ");
                int addWagonPassengers = Integer.parseInt(command[1]);
                if (addWagonPassengers <= maxCapacityPerWagon) {
                    train.add(addWagonPassengers);
                }
            } catch (Exception e) {
                int passengersToAdd = Integer.parseInt(input);
                for (int i = 0; i < train.size(); i++) {
                    if (train.get(i) + passengersToAdd <= maxCapacityPerWagon) {
                        train.set(i, train.get(i) + passengersToAdd);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }

        for (Integer i : train) {
            System.out.print(i + " ");
        }
    }
}
