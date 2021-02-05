package Final_Exam_02;

import java.util.Scanner;

public class World_Tour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] commands = input.split(":");

            switch (commands[0]) {
                case "Add Stop":
                    stops = addStop(stops, Integer.parseInt(commands[1]), commands[2]);
                    break;
                case "Remove Stop":
                    stops = removeStop(stops, Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case "Switch":
                    stops = switchStops(stops, commands[1], commands[2]);
                    break;
            }

            System.out.println(stops);
            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }

    private static String addStop(String stops, int index, String newStop) {
        if (index < 0 || index >= stops.length()) {
            return stops;
        }
        return new StringBuilder(stops).insert(index, newStop).toString();
    }

    private static String removeStop(String stops, int startIndex, int endIndex) {
        if ((startIndex < 0 || startIndex >= stops.length()) ||
                (endIndex < 0 || endIndex >= stops.length())) {
            return stops;
        }
        return new StringBuilder(stops).replace(startIndex, endIndex + 1, "").toString();
    }

    private static String switchStops(String stops, String oldString, String newString) {
        if (stops.contains(oldString)) {
            return stops.replaceAll(oldString, newString);
        }
        return stops;
    }
}
