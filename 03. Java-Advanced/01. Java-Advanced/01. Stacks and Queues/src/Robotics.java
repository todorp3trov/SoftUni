import java.util.*;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> productQueue = new ArrayDeque<>();

        String[] input = scanner.nextLine().split(";");

        Map<String, Integer> robots = new LinkedHashMap<>();
        for (String s : input) {
            String[] data = s.split("-");
            String robotName = data[0];
            int workTime = Integer.parseInt(data[1]);
            robots.put(robotName, workTime);
        }

        int[] workingTime = new int[robots.size()];

        input = scanner.nextLine().split(":");
        int time = (Integer.parseInt(input[0]) * 3600) +
                (Integer.parseInt(input[1]) * 60) +
                Integer.parseInt(input[2]);

        String product = scanner.nextLine();
        while (!product.equals("End")) {
            productQueue.offer(product);
            product = scanner.nextLine();
        }

        while (!productQueue.isEmpty()) {
            String currentProduct = productQueue.poll();
            time++;
            boolean isAssigned = false;

            for (int i = 0; i < workingTime.length; i++) {
                if (workingTime[i] > 0) {
                    workingTime[i]--;
                }
            }

            for (int i = 0; i < robots.size(); i++) {
                if (workingTime[i] == 0) {
                    int count = 0;
                    for (Map.Entry<String, Integer> robot : robots.entrySet()) {
                        if (count == i) {
                            workingTime[i] = robot.getValue();
                            int hours = time / 3600 % 24;
                            int minutes = time % 3600 / 60;
                            int seconds = time % 60;
                            System.out.printf("%s - %s [%02d:%02d:%02d]\n", robot.getKey(), currentProduct, hours, minutes, seconds);
                            isAssigned = true;
                            break;
                        }
                        count++;
                    }
                    break;
                }
            }

            if (!isAssigned) {
                productQueue.offer(currentProduct);
            }

        }
    }
}
