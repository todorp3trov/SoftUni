import java.util.Scanner;

public class Exam_Preparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBadGrades = Integer.parseInt(scanner.nextLine());

        double averageScore = 0f;
        int badGradesCount = 0;
        int problemsCount = 0;
        String lastProblem = "";

        boolean hasFailed = false;
        String input = scanner.nextLine();
        while (!input.equals("Enough")) {
            String problemText = input;
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                badGradesCount++;
            }
            if (badGradesCount == numBadGrades) {
                hasFailed = true;
                lastProblem = problemText;
                break;
            }

            problemsCount++;
            averageScore += grade;
            lastProblem = problemText;

            input = scanner.nextLine();
        }

        if (hasFailed) {
            System.out.printf("You need a break, %d poor grades.", badGradesCount);
        } else {
            System.out.printf("Average score: %.2f\n" +
                    "Number of problems: %d\n" +
                    "Last problem: %s", averageScore / problemsCount, problemsCount, lastProblem);
        }
    }
}
