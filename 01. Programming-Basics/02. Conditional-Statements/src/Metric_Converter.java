import java.util.Scanner;

public class Metric_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String numUnit = scanner.nextLine();
        String convertNumToUnit = scanner.nextLine();

        if (numUnit.equals("m")) {
            if (convertNumToUnit.equals("mm")) {
                num *= 1000;
            } else if (convertNumToUnit.equals("cm")) {
                num *= 100;
            }
        } else if (numUnit.equals("mm")) {
            if (convertNumToUnit.equals("m")) {
                num /= 1000;
            } else if (convertNumToUnit.equals("cm")) {
                num /= 10;
            }
        } else if (numUnit.equals("cm")) {
            if (convertNumToUnit.equals("m")) {
                num /= 100;
            } else if (convertNumToUnit.equals("mm")) {
                num *= 10;
            }
        }

        System.out.printf("%.3f", num);
    }
}
