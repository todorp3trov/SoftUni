import java.util.Scanner;

public class SoftUni_Reception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeOne = scanner.nextInt();
        int employeeTwo = scanner.nextInt();
        int employeeThree = scanner.nextInt();

        int peopleServicedPerHour = employeeOne + employeeTwo + employeeThree;

        int numPeople = scanner.nextInt();

        int totalHours = 0;
        while (numPeople > 0) {
            totalHours++;
            if (totalHours % 4 != 0) {
                numPeople -= peopleServicedPerHour;
            }
        }

        System.out.printf("Time needed: %dh.\n", totalHours);
    }
}
