package animals;

import animals.Cat.Cat;
import animals.Cat.Kitten.Kitten;
import animals.Cat.Tomcat.Tomcat;
import animals.Dog.Dog;
import animals.Frog.Frog;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public void setGender(String gender) {
        if (gender.equals("Male") || gender.equals("Female")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public abstract String produceSound();

    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n%s",
                this.getClass().getSimpleName(),
                this.getName(),
                this.getAge(),
                this.getGender(),
                produceSound());
    }

    public static Animal createAnimal(String type, String name, int age, String gender) {
        switch (type) {
            case "Cat":
                return new Cat(name, age, gender);
            case "Kitten":
                return new Kitten(name, age);
            case "Tomcat":
                return new Tomcat(name, age);
            case "Dog":
                return new Dog(name, age, gender);
            case "Frog":
                return new Frog(name, age, gender);
            default:
                throw new IllegalArgumentException("Invalid input!");
        }
    }
}
