package Hotel_Reservation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] data = reader.readLine().split(" ");

        PriceCalculator priceCalculator =
                new PriceCalculator(Double.parseDouble(data[0]), Integer.parseInt(data[1]),
                                    Season.valueOf(data[2].toUpperCase()),
                                    Discount.valueOf(data[3].toUpperCase()));

        System.out.printf("%.2f\n", priceCalculator.calculate());
    }
}
