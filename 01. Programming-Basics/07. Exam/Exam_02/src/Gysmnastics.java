import java.util.Scanner;

public class Gysmnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String tool = scanner.nextLine();

        double toughness = 0f;
        double execution = 0f;

        switch (country) {
            case "Russia":
                if (tool.equals("ribbon")) {
                    toughness = 9.100;
                    execution = 9.400;
                } else if (tool.equals("hoop")) {
                    toughness = 9.300;
                    execution = 9.800;
                } else if (tool.equals("rope")) {
                    toughness = 9.600;
                    execution = 9.000;
                }
                break;
            case "Bulgaria":
                if (tool.equals("ribbon")) {
                    toughness = 9.600;
                    execution = 9.400;
                } else if (tool.equals("hoop")) {
                    toughness = 9.550;
                    execution = 9.750;
                } else if (tool.equals("rope")) {
                    toughness = 9.500;
                    execution = 9.400;
                }
                break;
            case "Italy":
                if (tool.equals("ribbon")) {
                    toughness = 9.200;
                    execution = 9.500;
                } else if (tool.equals("hoop")) {
                    toughness = 9.450;
                    execution = 9.350;
                } else if (tool.equals("rope")) {
                    toughness = 9.700;
                    execution = 9.150;
                }
                break;
        }

        double totalGrade = execution + toughness;
        double percentFromTopGrade = ((20 - totalGrade) / 20) * 100;
        System.out.printf("The team of %s get %.3f on %s.\n%.2f%%", country, totalGrade, tool, percentFromTopGrade);
    }
}
