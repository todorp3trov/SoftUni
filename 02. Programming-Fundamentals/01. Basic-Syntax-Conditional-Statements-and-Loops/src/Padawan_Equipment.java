import java.util.Scanner;

public class Padawan_Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        int extraLightsabers = (int) Math.ceil(studentCount * 0.1);
        double totalLightsaberPrice = (studentCount + extraLightsabers) * lightsaberPrice;
        double totalRobePrice = studentCount * robePrice;
        int freeBelts = studentCount / 6;
        double totalBeltPrice = (studentCount - freeBelts) * beltPrice;

        double moneyNeeded = totalLightsaberPrice + totalRobePrice + totalBeltPrice;

        if (availableMoney >= moneyNeeded) {
            System.out.printf("The money is enough - it would cost %.2flv.\n", moneyNeeded);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.\n", moneyNeeded - availableMoney);
        }
    }
}
