package Generic_Swap_Method;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<String> boxOfStrings = new Box<>();

        for (int i = 0; i < n; i++) {
            boxOfStrings.add(scanner.nextLine());
        }

        boxOfStrings.swap(scanner.nextInt(), scanner.nextInt());

        System.out.println(boxOfStrings.toString());
    }
}
