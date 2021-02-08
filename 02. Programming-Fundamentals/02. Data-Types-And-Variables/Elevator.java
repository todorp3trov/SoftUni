import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = scanner.nextInt();
        int capacity = scanner.nextInt();

        if (capacity > numPeople) {
            System.out.println("1");
        } else {
            if (numPeople % capacity == 0) {
                System.out.println(numPeople / capacity);
            } else {
                System.out.println((numPeople / capacity) + 1);
            }
        }
    }
}
