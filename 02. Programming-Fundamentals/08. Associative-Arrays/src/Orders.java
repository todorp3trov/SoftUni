import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ItemDetails> products = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] data = input.split(" ");

            String productName = data[0];
            double productPrice = Double.parseDouble(data[1]);
            int productQuantity = Integer.parseInt(data[2]);

            if (!products.containsKey(productName)) {
                products.put(productName, new ItemDetails(productPrice, productQuantity));
            } else {
                products.get(productName).updateItemDetails(productPrice, productQuantity);
            }


            input = scanner.nextLine();
        }

        products.forEach((k,v) -> System.out.printf("%s -> %.2f\n", k, v.calcValue()));
    }

    private static class ItemDetails {
        double productPrice;
        int productQuantity;

        public ItemDetails(double productPrice, int productQuantity) {
            this.productPrice = productPrice;
            this.productQuantity = productQuantity;
        }

        public double getProductPrice() {
            return productPrice;
        }

        public int getProductQuantity() {
            return productQuantity;
        }

        public void updateItemDetails(double newPrice, int quantity) {
            productPrice = newPrice;
            productQuantity += quantity;
        }

        public double calcValue() {
            return productPrice * productQuantity;
        }
    }
}
