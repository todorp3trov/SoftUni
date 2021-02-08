import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double minWage = Double.parseDouble(scanner.nextLine());

        String scholarship = "";

        if (income < minWage && grade >= 4.5) {
            double socialScholarship = minWage * 0.35;
            double excellenceScholarship = grade * 25;
            if (grade >= 5.5 && excellenceScholarship > socialScholarship) {
                scholarship = String.format("You get a scholarship for excellent results %d BGN",
                        (int) Math.floor(excellenceScholarship));
            } else {
                scholarship = String.format("You get a Social scholarship %d BGN", (int) Math.floor(socialScholarship));
            }
        } else if (grade >= 5.5) {
            scholarship = String.format("You get a scholarship for excellent results %d BGN",
                    (int) Math.floor(grade * 25));
        } else {
            scholarship = "You cannot get a scholarship!";
        }

        System.out.println(scholarship);
    }
}
