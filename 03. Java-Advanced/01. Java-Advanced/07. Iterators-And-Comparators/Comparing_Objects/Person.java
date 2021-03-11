package Comparing_Objects;

class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        int compareResult = this.name.compareTo(anotherPerson.getName());

        if (compareResult == 0) {
            compareResult = Integer.compare(this.age, anotherPerson.getAge());
        }

        if (compareResult == 0) {
            compareResult = this.town.compareTo(anotherPerson.getTown());
        }

        return compareResult;
    }
}
