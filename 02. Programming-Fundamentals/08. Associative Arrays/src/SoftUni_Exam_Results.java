import java.util.*;

public class SoftUni_Exam_Results {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> participants = new LinkedHashMap<>();
        Map<String, Integer> languages = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            String[] data = input.split("-");
            String username = data[0];
            String language = data[1];
            if (language.equals("banned")) {
                if (participants.containsKey(username)) {
                    participants.remove(username);
                }
            } else {
                int points = Integer.parseInt(data[2]);

                if (!participants.containsKey(username)) {
                    participants.put(username, points);
                } else {
                    if (points > participants.get(username)) {
                        participants.put(username, points);
                    }
                }

                if (!languages.containsKey(language)) {
                    languages.put(language, 1);
                } else {
                    int value = languages.get(language);
                    languages.put(language, ++value);
                }
            }

            input = scanner.nextLine();
        }

        System.out.println("Results:");
        participants.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted((f,s) -> s.getValue() - f.getValue())
                .forEach(p -> System.out.println(p.getKey() + " | " + p.getValue()));

        System.out.println("Submissions:");
        languages.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted((f,s) -> s.getValue() - f.getValue())
                .forEach(l -> System.out.println(l.getKey() + " - " + l.getValue()));
    }
}
