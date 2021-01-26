package animals.Cat.Tomcat;

import animals.Cat.Cat;

public class Tomcat extends Cat{
    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
