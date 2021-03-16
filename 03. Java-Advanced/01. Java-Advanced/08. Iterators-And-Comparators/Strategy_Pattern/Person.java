package Strategy_Pattern;

import java.util.Comparator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.age);
    }

    static class NameComparator implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            int compareResult = o1.getName().length() - o2.getName().length();

            if (compareResult == 0) {
                compareResult = o1.getName().toLowerCase().charAt(0) - o2.getName().toLowerCase().charAt(0);
            }

            return compareResult;
        }
    }

    static class AgeComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
