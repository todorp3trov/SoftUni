import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUni_Course_Planning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        List<String> exercises = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] command = input.split(":");
            switch (command[0]) {
                case "Add":
                    add(command[1], schedule);
                    break;
                case "Insert":
                    insert(command[1], Integer.parseInt(command[2]), schedule);
                    break;
                case "Remove":
                    remove(command[1], schedule);
                    break;
                case "Swap":
                    swap(command[1], command[2], schedule);
                    break;
                case "Exercise":
                    addExercise(command[1], exercises, schedule);
                    break;
            }
            input = scanner.nextLine();
        }
        int count = 1;
        for (int i = 0; i < schedule.size(); i++) {
            System.out.println(count + "." + schedule.get(i));
            if (exercises.contains(schedule.get(i))) {
                System.out.println(++count + "." + schedule.get(i) + "-Exercise");
            }
            count++;
        }
    }

    private static boolean checkIfLessonExists(String lessonTitle, List<String> schedule) {
        return schedule.contains(lessonTitle);
    }

    private static void add(String lessonTitle, List<String> schedule) {
        if (!checkIfLessonExists(lessonTitle, schedule)) {
            schedule.add(lessonTitle);
        }
    }

    private static void insert(String lessonTitle, int index, List<String> schedule) {
        if (index < 0 || index >= schedule.size()) {
            return;
        } else if (!checkIfLessonExists(lessonTitle, schedule)) {
            schedule.add(index, lessonTitle);
        }
    }

    private static void remove(String lessonTitle, List<String> schedule) {
        if (checkIfLessonExists(lessonTitle, schedule)) {
            schedule.remove(lessonTitle);
        }
    }

    private static void swap(String lessonOne, String lessonTwo, List<String> schedule) {
        if (checkIfLessonExists(lessonOne, schedule)
                && checkIfLessonExists(lessonTwo, schedule)) {
            int lessonOneIndex = schedule.indexOf(lessonOne);
            int lessonTwoIndex = schedule.indexOf(lessonTwo);
            schedule.set(lessonOneIndex, lessonTwo);
            schedule.set(lessonTwoIndex, lessonOne);
        }
    }

    private static void addExercise(String lessonTitle, List<String> exercises, List<String> schedule) {
        if (!checkIfLessonExists(lessonTitle, schedule)) {
            schedule.add(lessonTitle);
            exercises.add(lessonTitle);
        } else if (checkIfLessonExists(lessonTitle, schedule)
                && !exercises.contains(lessonTitle)){
            exercises.add(lessonTitle);
        }
    }
}
