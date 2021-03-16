package Stack_Iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CustomStack stack = new CustomStack();

        while (true) {
            String[] command = reader.readLine().replaceAll(", ", " ").split("\\s+");

            switch (command[0]) {
                case "Push":
                    for (int i = 1; i < command.length; i++) {
                        stack.push(Integer.parseInt(command[i]));
                    }
                    break;
                case "Pop":
                    stack.pop();
                    break;
                case "END":
                    printElementsTwice(stack);
                    return;
            }
        }
    }

    private static void printElementsTwice(CustomStack stack) {
        for (Integer i : stack) {
            System.out.println(i);
        }
        for (Integer i : stack) {
            System.out.println(i);
        }
    }
}
