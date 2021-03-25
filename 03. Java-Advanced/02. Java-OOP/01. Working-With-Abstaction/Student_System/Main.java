package Student_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();
        while (true)
        {
            String[] input = scanner.nextLine().split(" ");
            switch (input[0]) {
                case "Create":
                    studentSystem.create(input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
                    break;
                case "Show":
                    studentSystem.show(input[1]);
                    break;
                case "Exit":
                    return;
            }
        }
    }
}
