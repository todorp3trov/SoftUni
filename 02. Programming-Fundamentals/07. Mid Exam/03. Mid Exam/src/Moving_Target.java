import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Moving_Target {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commands = input.split(" ");
            switch (commands[0]) {
                case "Shoot":
                    shootTarget(targets, Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case "Add":
                    addTarget(targets, Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case "Strike":
                    strikeTarget(targets, Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.print(targets.get(0));
        for (int i = 1; i < targets.size(); i++) {
            System.out.print("|" + targets.get(i));
        }
    }

    private static void shootTarget(List<Integer> targets, int index, int power) {
        if (index >= 0 && index < targets.size()) {
            targets.set(index, targets.get(index) - power);
            if (targets.get(index) <= 0) {
                targets.remove(index);
            }
        }
    }

    private static void addTarget(List<Integer> targets, int index, int value) {
        if (index >= 0 && index < targets.size()) {
            targets.add(index, value);
        } else {
            System.out.println("Invalid placement!");
        }
    }

    private static void strikeTarget(List<Integer> targets, int index, int radius) {
        int strikeStart = index - radius;
        int strikeEnd = index + radius;
        if (index >= 0 && index < targets.size()) {
            if (strikeStart >= 0 && strikeEnd < targets.size()) {
                for (int i = strikeEnd; i >= strikeStart; i--) {
                    targets.remove(i);
                }
                return;
            }
        }
        System.out.println("Strike missed!");
    }
}
