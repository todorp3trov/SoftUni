package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] splitter = scanner.nextLine().split(" ");
        Pizza pizza = new Pizza(splitter[1], Integer.parseInt(splitter[2]));

        splitter = scanner.nextLine().split(" ");
        Dough dough = new Dough(splitter[1], splitter[2], Double.parseDouble(splitter[3]));
        pizza.setDough(dough);

        splitter = scanner.nextLine().split(" ");
        while (!splitter[0].equals("END")) {
            Topping topping = new Topping(splitter[1], Double.parseDouble(splitter[2]));
            pizza.addTopping(topping);
            splitter = scanner.nextLine().split(" ");
        }

        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
