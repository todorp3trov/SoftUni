package Google;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemon;
    private List<Parent> parents;
    private List<Child> children;
    private Car car;

    public Person(String name) {
        this.name = name;
        this.company = null;
        this.pokemon = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.car = null;
    }

    public void setCompany(String name, String department, double salary) {
        this.company = new Company(name, department, salary);
    }

    public void setCar(String model, int speed) {
        this.car = new Car(model, speed);
    }

    public void addPokemon(String name, String type) {
        this.pokemon.add(new Pokemon(name, type));
    }

    public void addParent(String name, String birthday) {
        this.parents.add(new Parent(name, birthday));
    }

    public void addChild(String name, String birthday) {
        this.children.add(new Child(name, birthday));
    }

    private String listPokemon() {
        if (this.pokemon.size() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (Pokemon pokemon : this.pokemon) {
            sb.append(pokemon.toString());
        }
        return sb.toString();
    }

    private String listParents() {
        if (this.parents.size() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (Parent parent : this.parents) {
            sb.append(parent.toString());
        }
        return sb.toString();
    }

    private String listChildren() {
        if (this.children.size() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (Child child : this.children) {
            sb.append(child.toString());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("%s\n" +
                "Company: \n%s" +
                "Car: \n%s" +
                "Pokemon: \n%s" +
                "Parents: \n%s" +
                "Children: \n%s",
                name,
                company == null ? "" : company.toString(),
                car == null ? "" : car.toString(),
                listPokemon(),
                listParents(),
                listChildren());
    }

    private static class Company {
        private String name;
        private String department;
        private double salary;

        public Company(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return String.format("%s %s %.2f\n", name, department, salary);
        }
    }

    private static class Pokemon {
        private String name;
        private String type;

        public Pokemon(String name, String type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("%s %s\n", name, type);
        }
    }

    private static class Parent {
        private String name;
        private String birthday;

        public Parent(String name, String birthday) {
            this.name = name;
            this.birthday = birthday;
        }

        @Override
        public String toString() {
            return String.format("%s %s\n", name, birthday);
        }
    }

    private static class Child {
        private String name;
        private String birthday;

        public Child(String name, String birthday) {
            this.name = name;
            this.birthday = birthday;
        }

        @Override
        public String toString() {
            return String.format("%s %s\n", name, birthday);
        }
    }

    private static class Car {
        private String model;
        private int speed;

        public Car(String model, int speed) {
            this.model = model;
            this.speed = speed;
        }

        @Override
        public String toString() {
            return String.format("%s %d\n", model, speed);
        }
    }
}
