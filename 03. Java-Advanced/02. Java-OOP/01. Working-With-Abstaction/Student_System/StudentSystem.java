package Student_System;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return new HashMap<>(this.repo);
    }

    public void create(String name, int age, double grade) {
        this.repo.putIfAbsent(name, new Student(name, age, grade));
    }

    public void show(String name) {
        if (this.repo.containsKey(name)) {
            Student student = this.repo.get(name);
            String view = String.format("%s is %s years old.", student.getName(), student.getAge());

            if (student.getGrade() >= 5.00) {
                view += " Excellent student.";
            } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                view += " Average student.";
            } else {
                view += " Very nice person.";
            }

            System.out.println(view);
        }
    }
}
