package validationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        validateNameLength(firstName, "First");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validateNameLength(lastName, "Last");
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        } else {
            this.age = age;
        }
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        if (salary < 460.0) {
            throw new IllegalArgumentException("Salary can't be less than 460.0");
        } else {
            this.salary = salary;
        }
    }

    private void validateNameLength(String name, String messagePrefix) {
        if (name.length() < 3) {
            throw new IllegalArgumentException(messagePrefix + " name cannot be less than 3 symbols");
        }
    }

    public void increaseSalary(double percentage) {
        if (this.age < 30) {
            this.salary = this.salary + ((this.salary * percentage / 200));
        } else {
            this.salary = this.salary + ((this.salary * percentage / 100));
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva.",
                this.firstName,
                this.lastName,
                this.salary);
    }
}
