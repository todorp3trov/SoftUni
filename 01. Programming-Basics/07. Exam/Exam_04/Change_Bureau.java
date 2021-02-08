import java.util.Scanner;

public class Change_Bureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] currency = new double[3];

        for (int i = 0; i < currency.length; i++) {
            currency[i] = Double.parseDouble(scanner.nextLine());
        }

        double changedMoneyBitcoinToLeva = currency[0] * 1168;
        double changedMoneyUanToLeva = (currency[1] * 0.15) * 1.76;
        double changedMoneyToEuro = (changedMoneyBitcoinToLeva + changedMoneyUanToLeva) / 1.95;

        System.out.printf("%.2f", changedMoneyToEuro - (changedMoneyToEuro * (currency[2] / 100)));
    }
}
