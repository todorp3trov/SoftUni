import java.util.Scanner;

public class Care_Of_Puppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodQantity = Integer.parseInt(scanner.nextLine());
        foodQantity = foodQantity * 1000;
        int foodEaten = 0;

        String input = scanner.nextLine();

        while (!input.equals("Adopted")) {

            if (input.equals("Adopted")) {
                break;
            } else {
                foodEaten += Integer.parseInt(input);
                input = scanner.nextLine();
            }
        }

        if (foodEaten <= foodQantity) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodQantity - foodEaten);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(foodEaten - foodQantity));
        }
    }
}
