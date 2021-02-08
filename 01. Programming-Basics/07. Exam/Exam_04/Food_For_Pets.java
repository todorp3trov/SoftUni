import java.util.Scanner;

public class Food_For_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double foodQuantity = Double.parseDouble(scanner.nextLine());
        double totalFoodEaten = 0;
        double totalBiscuitsEaten = 0;
        int totalConsumedFoodByDog = 0;
        int totalConsumedFoodByCat = 0;

        for (int i = 1; i <= days; i++) {

            int consumedFoodByDog = Integer.parseInt(scanner.nextLine());
            totalConsumedFoodByDog += consumedFoodByDog;
            int consumedFoodByCat = Integer.parseInt(scanner.nextLine());
            totalConsumedFoodByCat += consumedFoodByCat;

            totalFoodEaten += consumedFoodByDog + consumedFoodByCat;

            if (i % 3 == 0) {
                totalBiscuitsEaten += (consumedFoodByCat + consumedFoodByDog) * 0.1;
            }
        }

        System.out.printf("Total eaten biscuits: %dgr.\n", Math.round(totalBiscuitsEaten));
        System.out.printf("%.2f%% of the food has been eaten.\n", ((totalFoodEaten * 100) / foodQuantity));
        System.out.printf("%.2f%% eaten from the dog.\n", ((totalConsumedFoodByDog * 100) / totalFoodEaten));
        System.out.printf("%.2f%% eaten from the cat.", ((totalConsumedFoodByCat * 100) / totalFoodEaten));
    }
}
