import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Average_Students_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> studentGrades = new TreeMap<>();

        for (int i = 0; i < students; i++) {
            String[] input = scanner.nextLine().split(" ");

            String studentName = input[0];
            double studentGrade = Double.parseDouble(input[1]);

            if (!studentGrades.containsKey(studentName)) {
                studentGrades.put(studentName, new ArrayList<>());

            }

            studentGrades.get(studentName).add(studentGrade);
        }

        for (String student : studentGrades.keySet()) {
            System.out.print(student + " -> ");
            double average = 0f;
            for (Double grade : studentGrades.get(student)) {
                System.out.printf("%.2f ", grade);
                average += grade;
            }
            average /= studentGrades.get(student).size();
            System.out.printf("(avg: %.2f)\n", average);
        }
    }
}
