package TrafficLight;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] initialSignals = scanner.nextLine().split(" ");
        int n = scanner.nextInt();
        scanner.close();

        TrafficLight trafficLight = new TrafficLight(n, initialSignals);
        trafficLight.timesUpdatedSignal();

    }
}
