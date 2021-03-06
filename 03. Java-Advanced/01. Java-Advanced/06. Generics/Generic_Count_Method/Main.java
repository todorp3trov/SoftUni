package Generic_Count_Method;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<Double> boxOfStrings = new Box<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            boxOfStrings.add(Double.parseDouble(scanner.nextLine()));
        }

        System.out.println(boxOfStrings.countGreater(Double.parseDouble(scanner.nextLine())));
    }
}
