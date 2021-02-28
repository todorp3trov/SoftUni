import java.util.*;
import java.util.stream.Collectors;

public class Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Double> students = new TreeMap<>();

        int numStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numStudents; i++) {
            String name = scanner.nextLine();
            List<Double> grades = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());

            double averageGrade = 0;

            for (double grade : grades) {
                averageGrade += grade;
            }

            students.put(name, averageGrade /= grades.size());
        }

        students.forEach((key, value) -> System.out.println(String.format("%s is graduated with " + value, key)));
    }
}
