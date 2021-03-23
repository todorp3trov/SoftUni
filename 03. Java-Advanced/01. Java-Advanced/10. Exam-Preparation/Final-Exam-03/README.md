# 1. Bombs

_Ezio still is learning to make bombs. With their help, he will save civilization. We should help Ezio to make his perfect bombs._

You will be given **a two sequence of integers, representing bomb effects** and **bomb casings**.

You need to start from the **first bomb effect** and try to mix it with the **last bomb casing**. If the **sum** of their values is **equal** to **any of the materials in the table below** – **create the bomb corresponding** to the **value** and **remove** the **both** bomb materials. Otherwise, just **decrease** the value of the **bomb casing by 5**. You need to **stop** combining when you have **no more bomb effects** or **bomb casings,** or you successfully filled the bomb pouch.

**Bombs:**
- **Datura Bombs: 40**
- **Cherry Bombs: 60**
- **Smoke Decoy Bombs: 120**

To fill the bomb pouch, Ezio needs **three of each** of the **bomb types**.

### Input

- On the **first line** , you will receive the integers representing the **bomb effects** , **separated** by **&quot;, &quot;**.
- On the **second line** , you will receive the integers representing the **bomb casing** , **separated** by &quot; **,**&quot;.

### Output

- On the **first** line of output – print one of these rows according whether Ezio succeeded fulfill the bomb pouch:
  - &quot;**Bene! You have successfully filled the bomb pouch!**&quot;
  - &quot;**You don&#39;t have enough materials to fill the bomb pouch.**&quot;
- On the **second** line - print all bomb effects left:
  - If there are no bomb effects: &quot;**Bomb Effects: empty**&quot;
  - If there are effects: &quot;**Bomb Effects: {bombEffect1}, {bombEffect2}, (…)**&quot;
- On the **third** line - print all bomb casings left:
  - If there are no bomb casings: &quot;**Bomb Casings: empty**&quot;
  - If there are casings: &quot;**Bomb Casings: {bombCasing1}, {bombCasing2}, (…)&quot;**
- Then **,** you need to print **all** created bombs and the **count you have of them** , ordered **alphabetically** :
  - **&quot;Cherry Bombs: {count}&quot;**
  - **&quot;Datura Bombs: {count}&quot;**
  - **&quot;Smoke Decoy Bombs: {count}&quot;**

### Constraints

- All of the given numbers will be valid integers in the range **[0, 120]**.
- Don&#39;t have situation with negative material.

### Examples

| Input | Output |
|-|-|
| 5, 25, 50, 115<br>5, 15, 25, 35 | You don't have enough materials to fill the bomb pouch.<br>Bomb Effects: empty<br>Bomb Casings: empty<br>Cherry Bombs: 1<br>Datura Bombs: 2<br>Smoke Decoy Bombs: 1 |
| Comment | 1) 5 + 35 = 40 -> Datura Bomb. Remove both.<br>2) 25 + 25 = 50 -> can't create bomb. Bomb casing <br>should be decreased with 5 -> 20<br>3) 25 + 20 = 45 -> can't create bomb. Bomb casing <br>should be decreased with 5 -> 15<br>4) 25 + 15 = 40 -> Datura Bomb. Remove both<br>… |
| Input | Output |
| 30, 40, 5, 55, 50, 100, 110, 35, 40, 35, 100, 80<br>20, 25, 20, 5, 20, 20, 70, 5, 35, 0, 10 | Bene! You have successfully filled the bomb pouch!<br>Bomb Effects: 100, 80<br>Bomb Casings: 20<br>Cherry Bombs: 3<br>Datura Bombs: 4<br>Smoke Decoy Bombs: 3 |
| Comment | …<br>After creating a bomb with bomb effect 35 and <br>bomb casing 25, have created 3 Cherry bombs, <br>4 Datura bombs, and 3 Smoke Decoy bombs. <br>From all of the bomb types have 3 bombs and <br>the program ends. |
| Input | Output |
| 10, 20<br>40, 35 | You don't have enough materials to fill the bomb pouch.<br>Bomb Effects: empty<br>Bomb Casings: empty<br>Cherry Bombs: 1<br>Datura Bombs: 1<br>Smoke Decoy Bombs: 0 |

# 2. Snake

_Everyone remembers the old snake games. Now is time to create our own snake game._

You will be given an integer **n** for the **size** of the territory with **square** shape. On the next **n** lines, you will receive the **rows** of the territory. The snake will be placed on a **random position** , marked with the letter &#39;**S**&#39;. There will also be food on random positions, marked with **&#39;\*&#39;**. The territory may have **lair**. The lair will have two burrows **marked** with the **letter** - &#39;**B**&#39;. **All of the empty positions** will be marked with **&#39;-&#39;**.

Each turn, you will be given **command** for the **snake&#39;s movement**. When the snake moves it leaves a trail marked with **&#39;.&#39;**

Move commands will be: &quot;**up**&quot;, &quot;**down**&quot;, &quot;**left**&quot;, &quot;**right**&quot;.

If the snake **moves** to a **food** , it will eat the food, which will increase food quantity with one.

If it goes inside to a **burrow** , it **goes out** on the **position** of the **other burrow** and then **both** burrows **disappear**. If the snake **goes out** of its territory, the game is over. The snake needs **at least 10 food quantity** to be fed.

If **the snake goes outside of its territory or has eaten enough food**, the game should **end**.

### Input

- On the first line, you are given the integer **n** – the size of the **square** matrix.
- The **next n lines** holds the values for every **row**.
- On each of the next lines you will get a move command.

### Output

- On the first line:
  - If the snake goes out of its territory, print: &quot;**Game over!**&quot;
  - If the snake eat enough food, print: &quot;**You won! You fed the snake.**&quot;
- On the second line print all food eaten: &quot;**Food eaten: {food quantity}**&quot;
- In the end print the matrix.

### Constraints

- The size of the **square** matrix will be between **[2…10].**
- There will **always** be **0** or **2** burrows, marked with - &#39;**B**&#39;.
- The snake position will be marked with &#39;**S**&#39;.
- The snake will **always** either go out of its territory or eat enough food.
- There will be no case in which the snake will go through itself.

### Examples

| Input | Output |
|-|-|
| 6<br>-----S<br>----B-<br>------<br>------<br>--B---<br>--*---<br>left<br>down<br>down<br>down<br>left | Game over!<br>Food eaten: 1<br>----..<br>----.-<br>------<br>------<br>--.---<br>--.--- |
| Comment | 1) left     2) down     3) down     5) down<br>   ----S.      ----..      ----..      ----..<br>   ----B-      ----.-      ----.-      ----.-<br>   ------      ------      ------      ------<br>   ------      ------      ------      ------<br>   --B---      --S---      --.---      --.---<br>   --*---      --*---      --S---      --.---<br>3) eat the food: '*' (5, 2)<br>5) the snake goes out from its territory and the program ends |
| Input | Output |
| 7<br>--***S-<br>--*----<br>--***--<br>---**--<br>---*---<br>---*---<br>---*---<br>left<br>left<br>left<br>down<br>down<br>right<br>right<br>down<br>left<br>down | You won! You fed the snake.<br>Food eaten: 10<br>--....-<br>--.----<br>--...--<br>---..--<br>---S---<br>---*---<br>---*--- |

# 3. Parking

_Parking games are also among the popular games. Let&#39;s create one._

## Preparation

Download the skeleton provided in Judge. **Do not** change the **packages**!

**Pay attention to name the package parking, all the classes, their fields and methods the same way they are presented in the following document. It is also important to keep the project structure as described.**

## Problem description

Your task is to create a repository, which stores items by creating the classes described below.

**Car**

First, write a Java class **Car** with the following fields:

- **manufacturer: String**
- **model: String**
- **year: int**

The class **constructor** should receive **manufacturer, model** and **year**.You need to create the appropriate **getters and setters**. Override the **toString()** method in the following format:

**&quot;{manufacturer} {model} ({year})&quot;**

**Parking**

**Next** , write a Java class **Parking** that has **data** ( **Collection** , which stores the entity **Car**). All entities inside the repository have the **same fields**. Also, the Parking class should have those fields:

- **type: String**
- **capacity: int**

The class **constructor** should receive **type** and **capacity** , also it should initialize the **data** with a new instance of the collection **.** Implement the following features:

- Field **data** – **Collection** that holds added cars
- Method **add(Car car)** – **adds** an **entity** to the data **if there is** an **empty cell** for the car.
- Method **remove(String manufacturer, String model)** – removes the car by **given manufacturer and model,** if such **exists** , and **returns boolean**.
- Method **getLatestCar()** – returns the **latest** car (by year) or **null** if have no cars.
- Method **getCar(String manufacturer, String model)** – returns the car with the **given manufacturer** and **model** or **null** if there is no such car.
- Getter **getCount()** – **returns** the **number** of cars.
- **getStatistics()** – **returns** a **String** in the following **format** :
  - **&quot;The cars are parked in {parking type}:
 {Car1}
 {Car2}
 (…)**&quot;

## Constraints

- The **combinations** of **manufacturers** and **models** will be **always unique**.
- The **year** of the cars will always be **positive**.
- There won&#39;t be cars with the same years.

## Examples

This is an example how the **Parking** class is **intended to be used**.

```java
// Initialize the repository
Parking parking = new Parking("Underground parking garage", 5);

// Initialize entity
Car volvo = new Car("Volvo", "XC70", 2010);

// Print Car
System.out.println(volvo); // Volvo XC70 (2010)

// Add Car
parking.add(volvo);

// Remove Car
System.out.println(parking.remove("Volvo", "XC90")); // false
System.out.println(parking.remove("Volvo", "XC70")); // true

Car peugeot = new Car("Peugeot", "307", 2011);
Car audi = new Car("Audi", "S4", 2005);

parking.add(peugeot);
parking.add(audi);

// Get Latest Car
Car latestCar = parking.getLatestCar();
System.out.println(latestCar); // Peugeot 307 (2011)

// Get Car
Car audiS4 = parking.getCar("Audi", "S4");
System.out.println(audiS4); // Audi S4 (2005)

// Count
System.out.println(parking.getCount()); // 2

// Get Statistics
System.out.println(parking.getStatistics());
// The cars are parked in Underground parking garage:
// Peugeot 307 (2011)
// Audi S4 (2005)
```
