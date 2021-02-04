import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shoot_For_The_Win {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int shotTargets = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int targetIndex = Integer.parseInt(input);

            if ((targetIndex >= 0 && targetIndex < targets.size())
                    && targets.get(targetIndex) != -1) {
                for (int i = 0; i < targets.size(); i++) {
                    if (i != targetIndex && targets.get(i) != -1) {
                        if (targets.get(i) > targets.get(targetIndex)) {
                            targets.set(i, targets.get(i) - targets.get(targetIndex));
                        } else {
                            targets.set(i, targets.get(i) + targets.get(targetIndex));
                        }
                    }
                }
                targets.set(targetIndex, -1);
                shotTargets++;
            }
            input = scanner.nextLine();
        }

        System.out.print("Shot targets: " + shotTargets + " -> ");
        for (int i : targets) {
            System.out.print(i + " ");
        }
    }
}
