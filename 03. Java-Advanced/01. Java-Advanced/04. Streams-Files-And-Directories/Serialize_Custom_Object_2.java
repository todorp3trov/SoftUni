import java.io.*;

public class Serialize_Custom_Object_2 {

    static class Course implements Serializable{
        String name;
        int numStudents;

        public Course() {
        }

        public Course(String name, int numStudents) {
            this.name = name;
            this.numStudents = numStudents;
        }

        @Override
        public String toString() {
            return String.format("Course: %s\n" +
                    "Attending students: %d", name, numStudents);
        }
    }

    public static void main(String[] args) {
        Course someCourse = new Course("someName", 42);

        Course newCourse = new Course();

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("course.txt"));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream("course.txt"))) {

            out.writeObject(someCourse);

            newCourse = (Course) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println(newCourse.toString());
    }
}
