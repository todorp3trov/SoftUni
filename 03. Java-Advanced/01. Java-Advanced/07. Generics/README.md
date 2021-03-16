# Lab: Generics

This document defines the lab for [&quot;Java Advanced&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). You can check your solutions in [Judge](https://judge.softuni.bg/Contests/1526/Generics-Lab).

## 1. Jar of T

Create a class **Jar<>** that can store **anything**.

It should have two public methods:

- **void add(element)**
- **element remove()**

Adding should add on **top** of its contents. Remove should get the **topmost** element.
### Examples
```java
        Jar<Integer> jar = new Jar<>();
        jar.add(13);
        jar.add(42);
        jar.add(69);
        System.out.println(jar.remove());
```

### Hints

Use the syntax **Jar<>** to create a generic class

### Submit in Judge

Submit your solution in Judge **zip** your whole package with the **Jar** and **Main classes**:

If you didn&#39;t create **package** just choose your classes and **zip** them.

## 2. Generic Array Creator

Create a class **ArrayCreator** with a method and a single overload to it:

- **static T[] create(int length, T item)**
- **static T[] create(Class<T> class, int length, T item)**

The method should return an array with the given length and every element should be set to the given default item.

### Examples
```java
        String[] arr1 = ArrayCreator.create(5, "ASD");
        Integer[] arr2 = ArrayCreator.create(Integer.class, 15,42);
```

## 3. Generic Scale

Create a class **Scale<T>** that holds two elements - **left** and **right**. The scale should receive the elements through its single constructor:

- **Scale(T left, T right)**

The scale should have a single method:

- **T getHeavier()**

The **greater** of the two elements is heavier. The method should return **null** if elements are **equal**.

### Examples
```java
        Scale<String> stringScale = new Scale<>("a", "c");
        System.out.println(stringScale.getHeavier());

        Scale<Integer> integerScale = new Scale<>(13, 5);
        System.out.println(integerScale.getHeavier());
```

## 4. List Utilities

Create a class **ListUtils** that you will use through several other exercises:

The class should have two static methods:

- **T getMin(List<T> list)**
- **T getMax(List<T> list)**

The methods should throw **IllegalArgumentException** if an empty list is passed.

### Examples
```java
        List<String> list1 = List.of("f", "b", "c", "d", "a", "g");
        System.out.println(ListUtils.getMin(list1));

        List<Integer> list2 = List.of(1, 5, 87, 0, -55, 123);
        System.out.println(ListUtils.getMax(list2));
```

##
# Exercises: Generics

This document defines the exercises for [&quot;Java OOP Advanced&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). You can check your solutions in [Judge](https://judge.softuni.bg/Contests/1527)

## 1. Generic Box

Create a **generic class Box** that can store any type. **Override** the **toString()** method to print the type and the value of the stored data in the format **{class full name: value}.**

Use the class that you&#39;ve created and test it with the class **java.lang.String**. On the first line you will get **n** - the number of strings to read from the console. On the next **n** lines, you will get the actual strings. For each of them create a box and call its **toString()** method to print its data on the console.

### Examples

| Input | Output |
|-|-|
| 2<br>life in a box<br>box in a life | java.lang.String: life in a box<br>java.lang.String: box in a life |

## 2. Generic Box of Integer

Use the description of the previous problem but now, test your generic box with **Integers**.

### Examples

| Input | Output |
|-|-|
| 3<br>7<br>123<br>42 | java.lang.Integer: 7<br>java.lang.Integer: 123<br>java.lang.Integer: 42 |

## 3. Generic Swap Method Strings

Create a generic method that receives a list containing **any type of data** and swaps the elements at two given indexes.

As in the previous problems, read **n** number of boxes of type **String** and add them to the list. On the next line, however, you will receive a **swap** command consisting of **two indexes**. Use the method you&#39;ve created to swap the elements that correspond to the given indexes and **print each** element in the list.

### Examples

| Input | Output |
|-|-|
| 3<br>Pesho<br>Gosho<br>Swap me with Pesho<br>0 2 | java.lang.String: Swap me with Pesho<br>java.lang.String: Gosho<br>java.lang.String: Pesho |

## 4. Generic Swap Method Integers

Use the description of the previous problem but now, test your list of generic boxes with **Integers**.

### Examples

| Input | Output |
|-|-|
| 3<br>7<br>123<br>42<br>0 2 | java.lang.Integer: 42<br>java.lang.Integer: 123<br>java.lang.Integer: 7 |

## 5. Generic Count Method Strings

Create a **method** that receives as argument a **list of any type that can be compared** and an **element of the given type**. The method should **return the count of elements that are greater than the value of the given element**. **Modify your Box class** to support **comparing by value** of the data stored.

On the first line you will receive **n** - the number of elements to add to the list. On the next **n** lines, you will receive the actual elements. On the last line you will get the value of the element to which you need to compare every element in the list.

### Examples

| Input | Output |
|-|-|
| 3<br>aa<br>aaa<br>bb<br>aa | 2 |

## 6. Generic Count Method Doubles

Use the description of the previous problem but now, test your list of generic boxes with **Doubles**.

### Examples

| Input | Output |
|-|-|
| 3<br>7.13<br>123.22<br>42.78<br>7.55 | 2 |

## 7. Custom List

Create a generic data structure that can store **any type** that can be **compared.** Implement functions:

- **void add(T element)**
- **T remove(int index)**
- **boolean contains(T element)**
- **void swap(int index, int index)**
- **int countGreaterThan(T element)**
- **T getMax()**
- **T getMin()**

Create a command interpreter that reads commands and modifies the custom list that you have created. Implement the commands:

- **Add {element}** - Adds the given element to the end of the list
- **Remove {index}** - Removes the element at the given index
- **Contains {element}** - Prints if the list contains the given element **(true or false)**
- **Swap {index} {index}** - Swaps the elements at the given indexes
- **Greater {element}** - Counts the elements that are greater than the given element and prints their count
- **Max** - Prints the maximum element in the list
- **Min** - Prints the minimum element in the list
- **Print** - Prints all elements in the list, each on a separate line
- **END** - stops the reading of commands

**Note** : For the **Judge tests,** use **String** as **T.**

### Examples

| Input | Output |
|-|-|
| Add aa<br>Add bb<br>Add cc<br>Max<br>Min<br>Greater aa<br>Swap 0 2<br>Contains aa<br>Print<br>END | cc<br>aa<br>2<br>true<br>cc<br>bb<br>aa |

## 8. Custom List Sorter

Extend the previous problem by creating an additional **Sorter class**. It should have a single static **method sort()** which can sort objects of type **CustomList** containing any type that can be compared. **Extend the command list** to support one additional command Sort:

- **Sort** - Sort the elements in the list in ascending order.

### Examples

| Input | Output |
|-|-|
| Add cc<br>Add bb<br>Add aa<br>Sort<br>Print<br>END | aa<br>bb<br>cc |

## 9. \*Custom List Iterator

For the print command you have probably used a **for** loop. Extend your custom list class by making it to implement **Iterable.** This should allow you to iterate your list in a **foreach** statement.

### Examples

| Input | Output |
|-|-|
| Add aa<br>Add bb<br>Add cc<br>Max<br>Min<br>Greater aa<br>Swap 0 2<br>Print<br>END | cc<br>aa<br>2<br>cc<br>bb<br>aa |

## 10. \*Tuple

There is something, really annoying in the C# - language. It is called a &quot;**Tuple**&quot;. It is a class, which contains two objects. The first one is &quot; **item1**&quot; and the second one is &quot;**item2**&quot;. It is kind of like a **Map.Entry** except - it **simply has items,** which are **neither key nor value**. The annoyance is coming from the fact, that you have no idea what these objects are holding. The class name is telling you nothing, the methods which it has – too. So let&#39;s say we could try to implement it in Java, just for practicing generics.

The task:

Create a class &quot;**Tuple**&quot;, which is holding two objects. Like we said, the first one, will be &quot; **item1**&quot; and the second one - &quot;**item2**&quot;. The tricky part here is to make the class hold generics. This means, that when you create a new object of class - &quot;**Tuple**&quot;, there should be a way to explicitly, specify both the items type separately.

### Input

The input consists of three lines:

- The first one is holding a person name and an address. They are separated by space(s). Your task is to collect them in the tuple and print them on the console. Format of the input:

**{{first name} {last name}} {address}**

- The second line holds a **name** of a personand the **amount of beer** he can drink. Format:

**{name} {liters of beer}**

- The last line will hold an **Integer** and a **Double**. Format:

**{Integer} {Double}**

### Output

- Print the tuples&#39; items in format: { **item1** } -> { **item2** }

### Constraints

Use the good practices we have learned. Create the class and make it have getters and setters for its class variables. The input will be valid, no need to check it explicitly!

### Example

| Input | Output |
|-|-|
| Sofka Tripova Izgrev<br>Az 2<br>23 21.23212321 | Sofka Tripova -> Izgrev<br>Az -> 2<br>23 -> 21.23212321 |

## 11. \*Threeuple

Now you are aware of a Class which is probably a bad practice to use. Anyway, it is a nice example of using generics. Our next task is to create another Tuple. This time, our task is harder.

Create a Class **Threeuple**. Its name is telling us, that it will hold no longer, just a pair of objects. The task is simple, our **Threeuple** should **hold three objects**. Make it have getters and setters. You can even extend the previous class

### Input

The input consists of three lines:

- The first one is holding a name, an address and a town. Format of the input:

**{{first name} {last name}} {address} {town}**

- The second line is holding a name, beer liters, and a **Boolean variable** - drunk or not. Format:

**{name} {liters of beer} {drunk or not}**

- The last line will hold a name, a bank balance (double) and a bank name. Format:

**{name} {accoun} {balance} {bank name}**

### Output

- Print the Threeuples&#39; objects in format: { **firstElement** } -> { **secondElement** } -> { **thirdElement** }

### Examples

| Input | Output |
|-|-|
| Sofka Tripova Izgrev Burgas<br>MitkoShtaigata 18 drunk<br>SashoKompota 0.10 NkqfaBanka | Sofka Tripova -> Izgrev -> Burgas<br>MitkoShtaigata -> 18 -> true<br>SashoKompota -> 0.1 -> NkqfaBanka |
| Ivan Ivanov Tepeto Plovdiv<br>Mitko 18 not<br>Sasho 0.10 NGB | Ivan Ivanov -> Tepeto -> Plovdiv<br>Mitko -> 18 -> false<br>Sasho -> 0.1 -> NGB |
