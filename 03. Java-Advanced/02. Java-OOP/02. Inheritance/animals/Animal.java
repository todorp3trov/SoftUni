package animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String produceSound() {
        return "Default sound";
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append(String.format("%s %d %s",
                        getName(),
                        getAge(),
                        getGender()))
                .append(System.lineSeparator())
                .append(produceSound());
        return result.toString();
    }
}
