# Working with Abstraction: Lab

This document defines the lab for [&quot;Java Advanced&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). You can check your solutions in [Judge](https://judge.softuni.bg/Contests/1575/Working-with-Abstraction-Lab).

## 1. Rhombus of Stars

Create a program that reads a **positive integern** as input and prints on the console a **rhombus** with size **n** :

### Examples

| Input | Output | Input | Output | Input | Output | Input | Output |
|-|-|-|-|-|-|-|-|
| 1 | * | 2 |  * <br> * * <br> * | 3 |   * <br> * * <br> * * * <br> * * <br>  * | 4 |    * <br>  * * <br> * * * <br> * * * *<br> * * * <br>  * * <br>   * |

### Hint

Create a **printRow()** method to easily reuse code.

## 2. Point in Rectangle

Create a class **Point** and a class **Rectangle**. The **Point** should hold **coordinates X** and **Y** and the **Rectangle** should hold 2 **Points** – its **bottom left** and **top right** corners. In the **Rectangle** class, you should implement a **contains(Point point)** method that returns **true** or **false** , based on **whether** the **Point** given as **attribute** is **inside** or **outside** of the **Rectangle** object. Points **on the side** of a Square are considered **inside**.

### Input

- On the first line read the **coordinates** of the **bottom left** and **top right** corner of the **Rectangle** in the format: &quot;**{bottomLeftX} {bottomLeftY} {topRightX} {topRightY}**&quot;.
- On the second line, read an integer **N** and on the next **N** lines, read the **coordinates** of **points**.

### Output

- For each point, print out the result of the **Contains()** method.

### Examples

| Input | Output | Input | Output | Input | Output |
|-|-|-|-|-|-|
| 0 0 3 3<br>5<br>0 0<br>0 1<br>4 4<br>5 3<br>1 2 | true<br>true<br>false<br>false<br>true | 2 -3 12 3<br>4<br>8 -1<br>11 3<br>1 1<br>2 4 | true<br>true<br>false<br>false | 5 8 12 15<br>6<br>0 0<br>5 8<br>12 15<br>8 15<br>7 15<br>8 12 | false<br>true<br>true<br>true<br>true<br>true |

## 3. Student System

You are given a **working project** for a small **Student System** , but the code is very poorly organized. Break up the code **logically** into **smaller functional units** – **methods** and **classes** and don&#39;t break the functionality.

The program supports the following commands:

- &quot;**Create {studentName} {studentAge} {studentGrade}**&quot;– creates a new student and adds them to the repository.
- &quot;**Show {studentName}**&quot;– prints on the console information about a student in the format:
&quot;**{studentName} is {studentAge} years old. {commentary}**&quot;, where the **commentary** is based on the student&#39;s grade.
- &quot;**Exit**&quot; – closes the program.

**Do not** add any **extra validation** or **functionality** to the app!

### Examples

| Input | Output |
|-|-|
| Create Pesho 20 5.50<br>Create Mimi 18 4.50<br>Create Gosho 25 3<br>Show Pesho<br>Show Mimi<br>Exit | Pesho is 20 years old. Excellent student.<br>Mimi is 18 years old. Average student. |

## 4. Hotel Reservation

Create a class **PriceCalculator** that calculates the total price of a holiday, given the **price per day** , **number of days** , the **season** and a **discount type**. The **discount type** and **season** should be **enums**.

Use the class in your **main()** method to read input and **print** on the console the **price** of the **whole holiday**.

The price per day will be multiplied depending on the season by:

- **1** during **Autumn**
- **2** during **Spring**
- **3** during **Winter**
- **4** during **Summer**

The discount is applied to the total price and is one of the following:

- **20** % for VIP clients - **VIP**
- **10** % for clients, visiting for a second time - **SecondVisit**
- **0** % if there is no discount - **None**

### Input

On a **single line** you will receive all the **information** about the **reservation** in the format:
&quot;**{pricePerDay} {numberOfDays} {season} {discountType}**&quot;, where:

- The price per day will be a valid decimal in the range [0.01…1000.00]
- The number of days will be a valid integer in range [1…1000]
- The season will be one of: **Spring** , **Summer** , **Autumn** , **Winter**
- The discount will be one of: **VIP** , **SecondVisit** , **None**

### Output

On a **single line**, print the **total price** of the **holiday** , rounded to **2 digits** after the decimal separator.

### Examples

| Input | Output |
|-|-|
| 50.25 5 Summer VIP | 804.00 |
| 40 10 Autumn SecondVisit | 360.00 |
| 120.20 2 Winter None | 721.20 |

# Exercises: Working with Abstraction

This document defines the exercises for [&quot;Java Advanced&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). You can check your solutions in [Judge](https://judge.softuni.bg/Contests/1576/Working-with-Abstraction-Exercise).

## 1. Card Suit

Create an **enumeration type** that has as its constants the **four suits** of a deck of playing cards (CLUBS, DIAMONDS, HEARTS, SPADES). Iterate over the values of the enumeration type and print all **ordinal values** and **names**.

### Examples

| Input | Output |
|-|-|
| Card Suits | Card Suits:<br>Ordinal value: 0; Name value: CLUBS<br>Ordinal value: 1; Name value: DIAMONDS<br>Ordinal value: 2; Name value: HEARTS<br>Ordinal value: 3; Name value: SPADES |

## 2. Card Rank

Create an **enumeration type** that has as its constants the **fourteen ranks** of a deck of playing cards (ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING). Iterate over the values of the enumeration type and print all ordinal values and names.

### Examples

| Input | Output |
|-|-|
| Card Ranks | Card Ranks:<br>Ordinal value: 0; Name value: ACE<br>Ordinal value: 1; Name value: TWO<br>Ordinal value: 2; Name value: THREE<br>Ordinal value: 3; Name value: FOUR<br>Ordinal value: 4; Name value: FIVE<br>Ordinal value: 5; Name value: SIX<br>Ordinal value: 6; Name value: SEVEN<br>Ordinal value: 7; Name value: EIGHT<br>Ordinal value: 8; Name value: NINE<br>Ordinal value: 9; Name value: TEN<br>Ordinal value: 10; Name value: JACK<br>Ordinal value: 11; Name value: QUEEN<br>Ordinal value: 12; Name value: KING |

## 3. Cards with Power

Create a program that generates a **deck of cards (class Card)** which have a power. The power of a card is calculated by **adding** the power of its rank plus the power of its suit.

**Rank powers** are as follows: (ACE - 14, TWO - 2, THREE - 3, FOUR - 4, FIVE - 5, SIX - 6, SEVEN - 7, EIGHT - 8, NINE - 9, TEN - 10, JACK - 11, QUEEN - 12, KING - 13).

**Suit powers** are as follows: (CLUBS - 0, DIAMONDS - 13, HEARTS - 26, SPADES - 39).

You will get a command consisting of **two** lines. On the **first** line you will receive the Rank of the card and on the **second** line you will get the suit of the card.

Print the output in the **format** &quot;**Card name: ACE of SPADES; Card power: 53**&quot;.

### Note

Try using the enumeration types you have created in the previous problems but extending them with constructors and methods. Try using the **Enum.valueOf()****.**

### Examples

| Input | Output |
|-|-|
| TWO<br>CLUBS | Card name: TWO of CLUBS; Card power: 2 |
| ACE<br>SPADES | Card name: ACE of SPADES; Card power: 53 |

## 4. Traffic Lights

Implement a simple state machine in the form of a traffic light. Every traffic light has **three** possible signals - **red** , **green** and **yellow**. Each traffic light can be **updated** , which changes the color of its signal (e.g. if it is currently red, it changes to green, if it is green it changes to yellow). The order of signals is **red -> green -> yellow -> red** and so on.

On the first line you will be given multiple traffic light signals in the **format** &quot;RED GREEN YELLOW&quot;. They may be 3, **more** or **less** than 3. You need to make as many traffic lights as there are signals in the input.

On the second line, you will receive the **n** number of times you need to change each traffic light&#39;s signal.

Your output should consist of **n** number of lines, including **each** updated traffic light&#39;s signal. To better understand the problem, see the example below.

### Examples

| Input | Output |
|-|-|
| GREEN RED YELLOW<br>4 | YELLOW GREEN RED<br>RED YELLOW GREEN<br>GREEN RED YELLOW<br>YELLOW GREEN RED |
