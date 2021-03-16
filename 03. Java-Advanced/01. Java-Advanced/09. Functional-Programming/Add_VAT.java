import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Add_VAT {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        UnaryOperator<Double> addVat = value -> value * 1.2;

        System.out.println("Prices with VAT: ");

        Arrays.stream(reader.readLine().split(", "))
                .mapToDouble(e -> addVat.apply(Double.parseDouble(e)))
                .forEach(e -> System.out.printf("%.2f\n", e));
    }
}
