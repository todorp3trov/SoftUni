# Lab: Inheritance

This document defines the lab for [&quot;Java OOP&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). You can check your solutions in in [Judge](https://judge.softuni.bg/Contests/1574/Inheritance-Lab).

# Part I: Inheritance

## 1. Single Inheritance

Create two classes named **Animal** and **Dog**.
**Animal** with a single public method **eat()** that prints: **&quot;eating…&quot;**
**Dog** with a single public method **bark()** that prints: **&quot;barking…&quot;**
**Dog** should inherit from **Animal**.

```java
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); //eating...
        dog.bark(); //barking...
    }
}
```
### Hints

Use the **extends** keyword to build a hierarchy

## 2. Multiple Inheritance

Create three classes named **Animal** , **Dog** and **Puppy**.
**Animal** with a single public method **eat()** that prints: **&quot;eating…&quot;**
**Dog** with a single public method **bark()** that prints: **&quot;barking…&quot;**
**Puppy** with a single public method **weep()** that prints: **&quot;weeping…&quot;**
**Dog** should inherit from **Animal**. **Puppy** should inherit from **Dog**.

```java
public class Main {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat(); //eating...
        puppy.bark(); //barking...
        puppy.weep(); //weeping...
    }
}
```

## 3. Hierarchical Inheritance

Create three classes named **Animal** , **Dog** and **Cat**.
**Animal** with a single public method **eat()** that prints: **&quot;eating…&quot;**
**Dog** with a single public method **bark()** that prints: **&quot;barking…&quot;**
**Cat** with a single public method **meow()** that prints: **&quot;meowing…&quot;**
**Dog** and **Cat** should inherit from **Animal**.

```java
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); //eating...
        dog.bark(); //barking...

        Cat cat = new Cat();
        cat.eat(); //eating...
        cat.meow(); //meowing...
    }
}
```

# Part II: Reusing Classes

## 4. Random Array List

Create a **RandomArrayList** class that has all the functionality of an **ArrayList**.
Add additional function that **returns** and **removes** a random element from the list.

- Public method: **getRandomElement(): Object**

## 5. Stack of Strings

Create a class **Stack** which can store only strings and has the following functionality:

- Private field: **data: ArrayList{String}**
- Public method: **push(String item): void**
- Public method: **pop(): String**
- Public method: **peek(): String**
- Public method: **isEmpty(): boolean**

```java
public class Main {
    public static void main(String[] args) {
        StackOfStrings stackOfStrings = new StackOfStrings();
        stackOfStrings.push("one");
        stackOfStrings.push("two");
        stackOfStrings.push("three");

        System.out.println(stackOfStrings.isEmpty());
        System.out.println(stackOfStrings.peek());

        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.pop());
    }
}
```

### Hints

Use composition/delegation in order to have a field in which to store the stack&#39;s data

# Exercises: Inheritance

This document defines the exercises for [&quot;Java OOP&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). You can check your solutions in [Judge](https://judge.softuni.bg/Contests/1580/Inheritance-Exercises).

## 1. Person

NOTE: You need a public class **Main**. Create a package **person**.

You are asked to model an application for storing data about people. You should be able to have a **Person** and a **Child**. The child derives from the person. Every person has a **name** , and an **age**. Your task is to model the application.

The **Person** class also have **getters** for the fields.

Create a **Child** class that inherits **Person** and has the same public constructor definition. However, do not copy the code from the **Person** class - **reuse the**  **Person**  **class&#39;s constructor**.

### Sample Main
```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        Child child = new Child(name, age);

        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
```

### Input / Output

| Input | Output |
|-|-|
| Peter<br>13 | Peter<br>13 |
| George<br>10 | George<br>10 |

## 2. Zoo

**NOTE** : You need a public class **Main**.

Create a package **zoo**. It needs to contain the following classes:

![alt text](https://github.com/Tjikko563/SoftUni/blob/main/03.%20Java-Advanced/02.%20Java-OOP/02.%20Inheritance/images/Untitled1.png)

Follow the diagram and create all of the classes. **Each** of them, except the **Animal** class, should **inherit** from **another class**. The Animal class should have field **name** – **String** and **Getter** for **name**.

Every class should have:
- A public constructor, which accepts one parameter: **name**

Zip your package and upload it in Judge.

## 3.Players and Monsters

NOTE: You need a public class **Main**. Create a package **hero**.

Your task is to create the following game hierarchy:

![alt text](https://github.com/Tjikko563/SoftUni/blob/main/03.%20Java-Advanced/02.%20Java-OOP/02.%20Inheritance/images/Untitled2.png)

Create a class Hero. It should contain the following members:

- A public constructor, which accepts:
  - **username – String**
  - **level – int**
- The following fields:
  - **username - String**
  - **level – int**
- Getters for username and level
- **toString()** method

Hint: Override **toString()** of the base class in the following way:

```java
@Override
public String toString() {
    return String.format("Type: %s Username: %s Level: %s",
            this.getClass().getName(),
            this.getUsername(),
            this.getLevel());
}
```

## 4. Need for Speed

NOTE: You need a public class **Main**. Create the following **hierarchy** with the following **classes** : 
![alt text](https://github.com/Tjikko563/SoftUni/blob/main/03.%20Java-Advanced/02.%20Java-OOP/02.%20Inheritance/images/Untitled3.png)

Create a base class **Vehicle**. It should contain the following members:

- **DEFAULT\_FUEL\_CONSUMPTION – final static double (constant)**
- **fuelConsumption – double**
- **fuel – double**
- **horsePower – int**
- **Getters and Setters for the fields**
- A public constructor which accepts ( **fuel** , **horsePower** ) and **set** the **default fuel consumption** on the field **fuelConsumption**
- **void drive(double kilometers)**
  - The **drive** method should have a functionality to reduce the **fuel** based on the travelled kilometers and fuel consumption. Keep in mind that you can drive the vehicle only if you have enough fuel to finish the driving.

The default fuel consumption for **Vehicle** is **1.25**.Some of the classes have different default fuel consumption:

- **SportCar – DEFAULT\_FUEL\_CONSUMPTION**  **= 10**
- **RaceMotorcycle – DEFAULT\_FUEL\_CONSUMPTION**  **= 8**
- **Car – DEFAULT\_FUEL\_CONSUMPTION**  **= 3**

Zip your package and upload it in Judge.

### Hint

In the child classes&#39; constructors use **super.setFuelConsumption()** to set **fuelConsumption**

## 5. Restaurant

NOTE: You need a public class **Main**. Create a **restaurant** package with the following classes and hierarchy:

There are **Food** and **Beverages** in the restaurant and they are all products.

The **Product** class must have the following members:

- A public constructor with the following parameters: **String**  **name, Big Decimal price**
- **name – String**
- **price – BigDecimal**
- **Getters for the fields**

**Beverage** and **Food** classes are products. The **Beverage** class must have the following members:

- A public constructor with the following parameters **:**  **String name, BigDecimal price, double milliliters**
- **name – String**
- **price – BigDecimal**
- **milliliters – double**
- **Getter for milliliters**

The **Food** class must have the following members:

- A constructor with the following parameters **:**  **String name, BigDecimal price, double grams**
- **name – String**
- **price – double**
- **grams – double**
- **Getter for grams**

**HotBeverage** and **ColdBeverage** are **beverages** and they accept the following parameters upon initialization: **String name, BigDecimal price, double milliliters**

**Coffee** and **Tea** are hot beverages. The **Coffee** class must have the following additional members:

- **double COFFEE\_MILLILITERS = 50**
- **BigDecimal COFFEE\_PRICE = 3.50**
- **caffeine – double**
- **Getter for caffeine**

**MainDish** , **Dessert** and **Starter** are food. They all accept the following parameters upon initialization: **String name, BigDecimal price, double grams**. **Dessert** must accept one more parameter in its constructor: **double calories**.

- **calories – double**
- **Getter for calories**

Make **Salmon** , **Soup** and **Cake** inherit the proper classes.

A **Cake** must have the following members upon initialization:

- **double CAKE\_GRAMS = 250**
- **double CAKE\_CALORIES = 1000**
- **BigDecimal CAKE\_PRICE = 5**

A **Salmon** must have the following members upon initialization:

- **double SALMON\_GRAMS = 22**

Zip your package and upload it in Judge.

## 6. Animals

NOTE: You need a public class **Main**.

Create a hierarchy(package) of **animals**. Your program should have three different animals – **Dog** , **Frog** and **Cat**. Deeper in the hierarchy you should have two additional classes – **Kitten** and **Tomcat**. **Kittens are &quot;Female&quot; and Tomcats are &quot;Male&quot;.** All types of animals should be able to produce some kind of sound - **String produceSound ()**. For example, the dog should be able to bark. Your task is to model the hierarchy and test its functionality. Create an animal of each kind and make them all produce sound and create getters for all fields.

You will be given some lines of input. Each two lines will represent an animal. On the first line will be the type of animal and on the second – the name, the age and the gender. When the command &quot;**Beast!**&quot; is given, stop the input and print all the animals in the format shown below.

### Output

- Print the information for each animal on three lines. On the first line, print: **&quot;{animalType}&quot;**
- On the second line print: **&quot;{name} {age} {gender}&quot;**
- On the third line print the sounds it produces: **&quot;{produceSound()}&quot;**

### Constraints

- Each **Animal** should have a **name** , an **age** and a **gender**
- **All** input values should **not be blank** (e.g. name, age and so on…)
- If you receive an input for the **gender** of a **Tomcat** or a **Kitten** , ignore it but **create** the animal
- If the input is invalid for one of the properties, throw an exception with message: **&quot;Invalid input!&quot;**
- Each animal should have the functionality to **produceSound()**
- Here is the type of sound each animal should produce:
  - **Dog: &quot;Woof!&quot;**
  - **Cat: &quot;Meow meow&quot;**
  - **Frog: &quot;Ribbit&quot;**
  - **Kittens: &quot;Meow&quot;**
  - **Tomcat: &quot;MEOW&quot;**

### Examples

| Input | Output |
|-|-|
| Cat<br>Tom 12 Male<br>Dog<br>Rex 132 Male<br>Beast! | Cat <br>Tom 12 Male<br>Meow meow<br>Dog <br>Rex 132 Male<br>Woof! |
| Frog<br>Kermit 12 Male<br>Beast! | Frog <br>Kermit 12 Male<br>Ribbit |
| Frog<br>Froakie -2 Male<br>Frog<br>Froakie 2 Male<br>Beast! | Invalid input!<br>Frog<br>Froakie 2 Male<br>Ribbit |

### Hint

To find the name of the class you can use **this.getClass().getSimpleName()** in **toString()** method inside **Animal** class.
