package pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] data = reader.readLine().split(" ");
            Pizza pizza = new Pizza(data[1], Integer.parseInt(data[2]));
            data = reader.readLine().split(" ");
            Dough dough = new Dough(data[1], data[2], Double.parseDouble(data[3]));
            pizza.setDough(dough);
            data = reader.readLine().split(" ");
            while (!data[0].equals("END")) {
                pizza.addTopping(new Topping(data[1], Double.parseDouble(data[2])));
                data = reader.readLine().split(" ");
            }
            System.out.printf("%s - %.2f\n", pizza.getName(), pizza.getOverallCalories());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
