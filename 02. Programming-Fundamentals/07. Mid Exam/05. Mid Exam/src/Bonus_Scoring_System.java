import java.util.Scanner;

public class Bonus_Scoring_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = scanner.nextInt();
        int numLectures = scanner.nextInt();
        int initialBonus = scanner.nextInt();

        int maxAttendances = 0;
        for (int i = 0; i < numStudents; i++) {
            int currentStudentAttendances = scanner.nextInt();
            if (currentStudentAttendances > maxAttendances) {
                maxAttendances = currentStudentAttendances;
            }
        }

        double totalBonus = ((double) maxAttendances / numLectures) * (5 + initialBonus);

        System.out.println("Max Bonus: " + (int) Math.round(totalBonus) + ".");
        System.out.println("The student has attended " + maxAttendances + " lectures.");
    }
}
