import java.util.Scanner;

public class Hotel_Room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0f;
        double apartmentPrice = 0f;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50.0;
                apartmentPrice = 65.0;
                if (nights > 7 && nights <= 14) {
                    studioPrice = studioPrice - (studioPrice * 0.05);
                } else if (nights > 14) {
                    studioPrice = studioPrice - (studioPrice * 0.3);
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.2;
                apartmentPrice = 68.7;
                if (nights > 14) {
                    studioPrice = studioPrice - (studioPrice * 0.2);
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);
                }
                break;
            case "July":
            case "August":
                studioPrice = 76.0;
                apartmentPrice = 77.0;
                if (nights > 14) {
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", apartmentPrice * nights, studioPrice * nights);
    }
}
