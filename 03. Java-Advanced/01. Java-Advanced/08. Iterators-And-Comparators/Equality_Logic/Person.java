package Equality_Logic;

class Person implements Comparable<Person>{
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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return this.name.equals(other.getName()) && this.age == other.getAge();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 53 * hash + this.age;
        return hash;
    }

    @Override
    public int compareTo(Person o) {
        int compareResult = this.name.compareTo(o.getName());

        if (compareResult == 0) {
            compareResult = Integer.compare(this.age, o.getAge());
        }

        return compareResult;
    }
}
