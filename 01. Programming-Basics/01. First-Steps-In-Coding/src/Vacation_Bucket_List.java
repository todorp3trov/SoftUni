import java.util.Scanner;

public class Vacation_Bucket_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int pagerReadPerHour = Integer.parseInt(scanner.nextLine());
        int availableDays = Integer.parseInt(scanner.nextLine());

        int hoursNeededToReadBook = (pagesInBook / pagerReadPerHour) / availableDays;
        System.out.println(hoursNeededToReadBook);
    }
}
