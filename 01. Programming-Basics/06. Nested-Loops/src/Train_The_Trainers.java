import java.util.Scanner;

public class Train_The_Trainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double averageGrade = 0f;
        int gradeCount = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            String presentationName = input;
            double presentationAverageGrade = 0f;
            for (int j = 0; j < n; j++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                presentationAverageGrade += currentGrade;
                averageGrade += currentGrade;
                gradeCount++;
            }

            presentationAverageGrade /= n;
            System.out.printf("%s - %.2f.\n", presentationName, presentationAverageGrade);
            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.\n", averageGrade / gradeCount);
    }
}
