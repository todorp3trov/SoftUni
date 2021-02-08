import java.util.Scanner;

public class Easter_Bake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreadNumber = Integer.parseInt(scanner.nextLine());
        int sugarPerPack = 950;
        int flourPerPack = 750;

        double totalSugarUsed = 0;
        double totalFlourUsed = 0;
        int maxSugarUsed = Integer.MIN_VALUE;
        int maxFlourUsed = Integer.MIN_VALUE;
        for (int i = 0; i < easterBreadNumber; i++) {
            int sugarUsedPerBread = Integer.parseInt(scanner.nextLine());
            int flourUsedPerBread = Integer.parseInt(scanner.nextLine());

            if (sugarUsedPerBread > maxSugarUsed) {
                maxSugarUsed = sugarUsedPerBread;
            }
            if (flourUsedPerBread > maxFlourUsed) {
                maxFlourUsed = flourUsedPerBread;
            }

            totalSugarUsed += sugarUsedPerBread;
            totalFlourUsed += flourUsedPerBread;
        }

        System.out.println("Sugar: " + (int) Math.ceil(totalSugarUsed / sugarPerPack));
        System.out.println("Flour: " + (int) Math.ceil(totalFlourUsed / flourPerPack));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",
                maxFlourUsed, maxSugarUsed);
    }
}
