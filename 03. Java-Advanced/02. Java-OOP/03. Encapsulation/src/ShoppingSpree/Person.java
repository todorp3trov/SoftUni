package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<Product>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (product.getCost() > money) {
            System.out.printf("%s can't afford %s\n", name, product.getName());
        } else {
            System.out.printf("%s bought %s\n", name, product.getName());
            money -= product.getCost();
            products.add(product);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (products.isEmpty()) {
            return sb.append("Nothing bought").toString();
        } else {
            sb.
                    append(String.format("%s - ", name)).
                    append(products.stream().
                            map(Product::getName).
                            collect(Collectors.joining(", ")));
            return sb.toString();
        }
    }
}
