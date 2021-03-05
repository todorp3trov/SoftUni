# Lab: Defining Classes

This document defines the lab for [&quot;Java Advanced&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). You can check your solutions in [Judge](https://judge.softuni.bg/Contests/1517/Defining-Classes-Lab).

# Part I: Defining Classes

## 1. Car Info

Create a class named **Car**.

The class should have **private** fields for:

- Brand: **String**
- Model: **String**
- Horsepower: **int**

#### Getters and Setters

**Create getters** and **setters** for each class field.

### Create Car Info Method

This method should return the info about any car object in the following format:

**&quot;The car is: {brand} {model} – {horsePower} HP.&quot;**

### Test the Program

Read a cars objects, add them to collection of your choice and the print each one on the console using the carInfo() method. The input consists of single integer **N** the number of lines representing car objects. One each line you will read car info in the following format **{brand} {model} {horsePower}** separated by single space.

#### Examples

| Input | Output |
|-|-|
| 3<br>Chevrolet Impala 390<br>Luskava Jigula 500<br>Golqma Kola 49 | The car is: Chevrolet Impala - 390 HP.<br>The car is: Luskava Jigula - 500 HP.<br>The car is: Golqma Kola - 49 HP. |
| 5<br>This Car 1<br>Was Made 2<br>Only For 3<br>Test Purposes 4<br>No Way 5 | The car is: This Car - 1 HP.<br>The car is: Was Made - 2 HP.<br>The car is: Only For - 3 HP.<br>The car is: Test Purposes - 4 HP.<br>The car is: No Way - 5 HP. |

# Part II: Constructors

## 2. Car Constructors

Make proper constructors for the Car class so you can create car objects with different type of input information.

If you miss information about field of **type String** set the value to **&quot;unknown&quot;** ,and for **integer** field set **-1.**

- First **declare constructor** which takes only the car brand as parameter:
- Also create **constructor** which **sets** all the **fields** :

Read information about car the same way as the previous task, however this time use **constructors** to create the objects, not creating object with the **default** constructor. You should be able to handle **different types** of input, the format will be the same as the previous task, but this time some of the data may be missing. For an example you can get only the car **brand** – which means you have to set the car model to **&quot;unknown&quot;** and the Horsepower value to **-1**. There will be lines with **complete** car data, declare constructor which sets all the fields.

You have to add the car objects to a **collection** of your choice and print the data as in the previous task. The input will **always** have one or three elements on each line.

### Examples

| Input | Output |
|-|-|
| 2<br>Chevrolet<br>Golqma Kola 49 | The car is: Chevrolet unknown - -1 HP.<br>The car is: Golqma Kola - 49 HP. |
| 4<br>Was<br>Only For 3<br>Test Purposes 4<br>No Way 5 | The car is: Was unknown - -1 HP.<br>The car is: Only For - 3 HP.<br>The car is: Test Purposes - 4 HP.<br>The car is: No Way - 5 HP. |

## 3. Bank Account

Create class **BankAccount**.

The class should have **private fields** for:

- Id: **int** (Starts from **1** and **increments** for every **new account**)
- Balance: **double**
- Interest rate: **double** (Shared for all accounts. **Default value: 0.02** )

The class should also have **public** methods for:

- **setInterestRate(double interest): void (static)**
- **getInterest(int Years): double**
- **deposit(double amount): void**

Create a test client supporting the following commands:

- **Create**
- **Deposit {Id} {Amount}**
- **SetInterest {Interest}**
- **GetInterest {ID} {Years}**
- **End**

### Examples

| Input | Output |
|-|-|
| Create<br>Deposit 1 20<br>GetInterest 1 10<br>End | Account ID1 created<br>Deposited 20 to ID1<br>4.00 |
| Create<br>Create<br>Deposit 1 20<br>Deposit 3 20<br>Deposit 2 10<br>SetInterest 1.5<br>GetInterest 1 1<br>GetInterest 2 1<br>GetInterest 3 1<br>End | Account ID1 created<br>Account ID2 created<br>Deposited 20 to ID1<br>Account does not exist<br>Deposited 10 to ID2<br>30.00<br>15.00<br>Account does not exist |

### Hints

- Create the class as usual and create a **constant** for the default interest rate
- Create the static and non-static fields, **all private**
- Set the id of an account upon creation while **incrementing** the global account count
- Create a setter for the global interest rate. Making the method **static** will let you access it through the class name
- Implement **deposit()** and **getInterest()**

# Exercises: Defining Classes

This document defines the exercises for [&quot;Java Advanced&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). You can check your solutions in [Judge](https://judge.softuni.bg/Contests/1518/Defining-Classes-Exercises).

**Note:** For this exercises you are allowed to have multiple classes in the same file.

## 1. Opinion Poll

Create Person class with two fields **String name** and **int age**, write a program that reads from the console **N** lines of personal information and then prints all people whose **age** is **more than 30** years, **sorted in alphabetical order**.

**Note:** you can use **stream()** to filter people.

### Examples

| Input | Output |
|-|-|
| 3<br>Pesho 12<br>Stamat 31<br>Ivan 48 | Ivan - 48<br>Stamat – 31 |
| 5<br>Nikolai 33<br>Yordan 88<br>Tosho 22<br>Lyubo 44<br>Stanislav 11 | Lyubo - 44<br>Nikolai - 33<br>Yordan – 88 |

## 2. Company Roster

Define a class **Employee** that holds the following information: **name, salary, position, department, email** and **age**. The **name, salary** , **position** and **department** are **mandatory** while the rest are **optional**.

Your task is to write a program which takes **N** lines of information about employees from the console and calculates the department with the highest average salary and prints for each employee in that department his **name, salary, email and age** - **sorted by salary in descending order**. If an employee **doesn&#39;t have** an **email** – in place of that field you should print **&quot;n/a&quot;** instead, if he doesn&#39;t have an **age** – print **&quot;-1&quot;** instead. The **salary** should be printed to **two decimal places** after the seperator.

**Hint**: you can define a **Department** class that holds list of employees.

### Examples

| Input | Output |
|-|-|
| 4<br>Pesho 120.00 Dev Development pesho@abv.bg 28<br>Toncho 333.33 Manager Marketing 33<br>Ivan 840.20 ProjectLeader Development ivan@ivan.com<br>Gosho 0.20 Freeloader Nowhere 18 | Highest Average Salary: Development<br>Ivan 840.20 ivan@ivan.com -1<br>Pesho 120.00 pesho@abv.bg 28 |
| 6<br>Stanimir 496.37 Temp Coding stancho@yahoo.com<br>Yovcho 610.13 Manager Sales<br>Toshko 609.99 Manager Sales toshko@abv.bg 44	<br>Venci 0.02 Director BeerDrinking beer@beer.br 23<br>Andrei 700.00 Director Coding<br>Popeye 13.3333 Sailor SpinachGroup popeye@pop.ey | Highest Average Salary: Sales<br>Yovcho 610.13 n/a -1<br>Toshko 609.99 toshko@abv.bg 44 |

## 3. \* Speed Racing

Your task is to implement a program that keeps track of cars and their fuel and supports methods for moving the cars. Define a class **Car** that keeps track of a car information **Model, fuel amount, fuel cost for 1 kilometer** and **distance traveled**. A Car Model is **unique** - there will never be 2 cars with the same model.

On the first line of the input you will receive a number **N** - the number of cars you need to track, on **each** of the next **N** lines you will receive information for a car in the following format &quot;{**Model} {FuelAmount} {FuelCostFor1km}**&quot;, all **cars start at 0 kilometers traveled**.

After the **N** lines until the command &quot;**End**&quot; is received, you will receive commands in the following format &quot;**Drive {CarModel} {amountOfKm}**&quot;, implement a method in the **Car** class to calculate whether a car **can** move that distance or **not**. If it yes, the car **fuel amount** should be **reduced** by the amount of used fuel and its **distance traveled** should be increased by the amount of kilometers traveled, otherwise the car should not move (Its fuel amount and distance traveled should stay the same) and you should print on the console &quot;**Insufficient fuel for the drive**&quot;. After the &quot;**End**&quot; command is received, print each car in order of appearing in input and its current fuel amount and distance traveled in the format &quot;**{Model} {fuelAmount} {distanceTraveled}**&quot;, where the fuel amount should be printed to **two decimal places** after the separator.

### Examples

| Input | Output |
|-|-|
| 2<br>AudiA4 23 0.3<br>BMW-M2 45 0.42<br>Drive BMW-M2 56<br>Drive AudiA4 5<br>Drive AudiA4 13<br>End | AudiA4 17.60 18<br>BMW-M2 21.48 56 |
| 3<br>AudiA4 18 0.34<br>BMW-M2 33 0.41<br>Ferrari-488Spider 50 0.47<br>Drive Ferrari-488Spider 97<br>Drive Ferrari-488Spider 35<br>Drive AudiA4 85<br>Drive AudiA4 50<br>End | Insufficient fuel for the drive<br>Insufficient fuel for the drive<br>AudiA4 1.00 50<br>BMW-M2 33.00 0<br>Ferrari-488Spider 4.41 97 |

## 4. Raw Data

You are the owner of a courier company and you want to make a system for tracking your cars and their cargo. Define a class **Car** that holds information about **model, engine, cargo** and a **collection of exactly 4 tires**. The engine, cargo and tire **should be separate classes** , create a constructor that receives all information about the Car and creates and initializes its inner components (engine, cargo and tires).

On the first line of the input you will receive a number **N** - the number of cars you have, on each of the next **N** lines you will receive information about a car in the format &quot;**{Model} {EngineSpeed} {EnginePower} {CargoWeight} {CargoType} {Tire1Pressure} {Tire1Age} {Tire2Pressure} {Tire2Age} {Tire3Pressure} {Tire3Age} {Tire4Pressure} {Tire4Age}&quot;** where the speed, power, weight and tire age are **integers** , tire pressure is a **double.**

After the **N** lines you will receive a single line with one of 2 commands &quot;**fragile**&quot; or &quot;**flamable**&quot; , if the command is &quot;**fragile**&quot; print all cars whose **Cargo Type is &quot;fragile&quot;** with a **tire** whose **pressure is < 1**, if the command is &quot;**flamable**&quot; print all cars whose **Cargo Type is &quot;flamable&quot;** and have **Engine Power > 250**. The cars should be printed in order of appearing in the input.

### Examples

| Input | Output |
|-|-|
| 2<br>ChevroletAstro 200 180 1000 fragile 1.3 1 1.5 2 1.4 2 1.7 4<br>Citroen2CV 190 165 1200 fragile 0.9 3 0.85 2 0.95 2 1.1 1<br>fragile | Citroen2CV |
| 4<br>ChevroletExpress 215 255 1200 flamable 2.5 1 2.4 2 2.7 1 2.8 1<br>ChevroletAstro 210 230 1000 flamable 2 1 1.9 2 1.7 3 2.1 1<br>DaciaDokker 230 275 1400 flamable 2.2 1 2.3 1 2.4 1 2 1<br>Citroen2CV 190 165 1200 fragile 0.8 3 0.85 2 0.7 5 0.95 2<br>flamable | ChevroletExpress<br>DaciaDokker |

## 5. Car Salesman

Define two classes **Car** and **Engine.** A **Car** has a **model, engine, weight** and **color**. An Engine has **model** , **power, displacement** and **efficiency**. A Car&#39;s **weight** and **color** and its Engine&#39;s **displacements** and **efficiency** are **optional**.

On the first line, you will read a number **N** which will specify how many lines of engines you will receive, on each of the next **N** lines you will receive information about an **Engine** in the following format &quot;{**Model} {Power} {Displacement} {Efficiency}**&quot;. After the lines with engines, on the next line you will receive a number **M** – specifying the number of Cars that will follow, on each of the next **M** lines the information about a **Car** will follow in the following format &quot;{**Model} {Engine} {Weight} {Color}**&quot;, where the engine in the format will be the **model of an existing Engine**. When creating the object for a **Car**, you should keep a **reference to the real engine** in it, instead of just the engines model, **note** that the optional properties **might be missing** from the formats.

Your task is to print each car (in the **order** you **received** them) and its information in the format defined bellow. If any of the optional fields has not been given print &quot; **n/a**&quot; in its place instead of:

- **{CarModel}:**
- **{EngineModel}:**
- **Power: {EnginePower}**
- **Displacement: {EngineDisplacement}**
- **Efficiency: {EngineEfficiency}**
- **Weight: {CarWeight}**
- **Color: {CarColor}**

### Optional

Override the classes **ToString()** methods to have a reusable way of displaying the objects.

### Examples

| Input | Output |
|-|-|
| 2<br>V8-101 220 50<br>V4-33 140 28 B<br>3<br>FordFocus V4-33 1300 Silver<br>FordMustang V8-101<br>VolkswagenGolf V4-33 Orange | FordFocus:<br>V4-33:<br>Power: 140<br>Displacement: 28<br>Efficiency: B<br>Weight: 1300<br>Color: Silver<br>FordMustang:<br>V8-101:<br>Power: 220<br>Displacement: 50<br>Efficiency: n/a<br>Weight: n/a<br>Color: n/a<br>VolkswagenGolf:<br>V4-33:<br>Power: 140<br>Displacement: 28<br>Efficiency: B<br>Weight: n/a<br>Color: Orange |
| 4<br>DSL-10 280 B<br>V7-55 200 35<br>DSL-13 305 55 A+<br>V7-54 190 30 D<br>4<br>FordMondeo DSL-13 Purple<br>VolkswagenPolo V7-54 1200 Yellow<br>VolkswagenPassat DSL-10 1375 Blue<br>FordFusion DSL-13 | FordMondeo:<br>DSL-13:<br>Power: 305<br>Displacement: 55<br>Efficiency: A+<br>Weight: n/a<br>Color: Purple<br>VolkswagenPolo:<br>V7-54:<br>Power: 190<br>Displacement: 30<br>Efficiency: D<br>Weight: 1200<br>Color: Yellow<br>VolkswagenPassat:<br>DSL-10:<br>Power: 280<br>Displacement: n/a<br>Efficiency: B<br>Weight: 1375<br>Color: Blue<br>FordFusion:<br>DSL-13:<br>Power: 305<br>Displacement: 55<br>Efficiency: A+<br>Weight: n/a<br>Color: n/a |

## 6. Pokémon Trainer

You wanna be the very best pokemon trainer, like no one ever was, so you set out to catch pokemons. Define a class **Trainer** and a class **Pokemon**. Trainer has a **name** , **number of badges** and a **collection of pokemon**. Pokemon has a **name** , an **element** and **health** , all values are **mandatory**. Every Trainer **starts with 0 badges**.

From the console you will receive an unknown number of lines until you receive the command &quot;**Tournament**&quot;, each line will carry information about a pokemon and the trainer who caught it in the format &quot;{**TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}**&quot; where **TrainerName** is the name of the Trainer who caught the pokemon, names are **unique** there cannot be 2 trainers with the same name. After receiving the command &quot;**Tournament**&quot; an unknown number of lines containing one of three elements &quot;**Fire**&quot;, &quot;**Water**&quot;, &quot;**Electricity**&quot; will follow until the command &quot;**End**&quot; is received. For every command you must check if a trainer has **at least 1** pokemon with the given element, if he does he receives 1 badge, otherwise all his pokemon **lose 10 health** , if a pokemon falls **to 0 or less health he dies** and must be deleted from the trainer&#39;s collection. After the command &quot; **End**&quot; is received you should print all trainers **sorted by the amount of badges they have in descending order** (if two trainers have the same amount of badges they should be sorted by order of appearance in the input)in the format &quot;{**TrainerName} {Badges} {NumberOfPokemon}**&quot;.

### Examples

| Input | Output |
|-|-|
| Pesho Charizard Fire 100<br>Gosho Squirtle Water 38<br>Pesho Pikachu Electricity 10<br>Tournament<br>Fire<br>Electricity<br>End | Pesho 2 2<br>Gosho 0 1 |
| Stamat Blastoise Water 18<br>Nasko Pikachu Electricity 22<br>Jicata Kadabra Psychic 90<br>Tournament<br>Fire<br>Electricity<br>Fire<br>End | Nasko 1 1<br>Stamat 0 0<br>Jicata 0 1 |

## 7. Google

_Google is always watching you, so it should come as no surprise that they know everything about you (even your pokemon collection), since you&#39;re a really good at writing classes Google asked you to design a Class that can hold all the information they need for people._

From the console you will receive an unkown amount of lines until the command &quot;**End**&quot; is red, on each of those lines there will be information about a person in one of the following formats:

- &quot;**{Name} company {companyName} {department} {salary}**&quot;
- &quot;**{Name} pokemon {pokemonName} {pokemonType}**&quot;
- &quot;**{Name} parents {parentName} {parentBirthday}**&quot;
- &quot;**{Name} children {childName} {childBirthday}**&quot;
- &quot;**{Name} car {carModel} {carSpeed}**&quot;

You should structure all information about a person in a class with nested subclasses. People names are **unique** - there won&#39;t be 2 people with the same name, a person can also have **only 1 company** and **car**, but can have **multiple parents, children** and **pokemons**. After the command &quot;**End**&quot; is received on the next line you will receive a **single** name, you should **print** all information about that person. **Note** that information can change **during** the **input** , for instance if we receive multiple lines which specify a person company, only the **last one** should be the one remembered. The salary must be formated to **two decimal places** after the seperator.

**Note** : print the information in format:

- **{personName}**
- **Company:**
- **{companyName} {companyDepartment} {salary}**
- **...**
- **Children:**
- **{childName} {childBirthday}**
- **{childName} {childBirthday}**

### Examples

| Input | Output |
|-|-|
| PeshoPeshev company PeshInc Management 1000.00<br>TonchoTonchev car Trabant 30<br>PeshoPeshev pokemon Pikachu Electricity<br>PeshoPeshev parents PoshoPeshev 22/02/1920<br>TonchoTonchev pokemon Electrode Electricity<br>End<br>TonchoTonchev | TonchoTonchev<br>Company:<br>Car:<br>Trabant 30<br>Pokemon:<br>Electrode Electricity<br>Parents:<br>Children: |
| JelioJelev pokemon Onyx Rock<br>JelioJelev parents JeleJelev 13/03/1933<br>GoshoGoshev pokemon Moltres Fire<br>JelioJelev company JeleInc Jelior 777.77<br>JelioJelev children PudingJelev 01/01/2001<br>StamatStamatov pokemon Blastoise Water<br>JelioJelev car AudiA4 180<br>JelioJelev pokemon Charizard Fire<br>End<br>JelioJelev | JelioJelev<br>Company:<br>JeleInc Jelior 777.77<br>Car:<br>AudiA4 180<br>Pokemon:<br>Onyx Rock<br>Charizard Fire<br>Parents:<br>JeleJelev 13/03/1933<br>Children:<br>PudingJelev 01/01/2001 |

## 8. \*\*\* Family Tree

_You want to build your family tree, so you went to ask your grandmother, sadly your grandmother keeps remembering information about your predecessors in pieces, so it falls to you to group the information and build the family tree._

On the first line of the input you will receive either a name or a birthdate in the format **&quot;{FirstName} {LastName}&quot;** or **&quot;day/month/year&quot;** - your task is to find information about the person in the family tree. On the next lines until the command **&quot;End&quot;** is received you will receive information about your predecessors that you will use it to build the family tree.

The information will be in one of the following formats:

- **&quot;FirstName LastName - FirstName LastName&quot;**
- **&quot;FirstName LastName - day/month/year&quot;**
- **&quot;day/month/year - FirstName LastName&quot;**
- **&quot;day/month/year - day/month/year&quot;**
- **&quot;FirstName LastName day/month/year&quot;**

The first 4 formats reveal a family tie – **the person on the left is parent to the person on the right** (as you can see the format does **not** need to contain names, for example the 4th format means the person born on the left date is parent to the person born on the right date). The last format ties **different** information together – i.e. **the person with that name was born on that date**. **Names** and **birthdates** are **unique** – there won&#39;t be 2 people with the same name or birthdate, there will **always** be enough entries to construct the family tree (all people names and birthdates are known and they have **at least one** connection to another person in the tree).

After the command **&quot;End&quot;** is received you should print all information about the person whose name or birthdate you received on the first line – his **name, birthday, parents and children** (check the examples for the format). The people in the parents and children lists should be **ordered** by their **first appearance** in the input (regardless if they appeared as a birthdate or a name, for example in the first input Stamat is before Penka because he first appeared in the second line, while she appears in the third.).

### Examples

| Input | Output |
|-|-|
| Pesho Peshev<br>11/11/1951 - 23/05/1980<br>Penka Pesheva - 23/05/1980<br>Penka Pesheva 09/02/1953<br>Pesho Peshev - Gancho Peshev<br>Gancho Peshev 01/01/2005<br>Stamat Peshev 11/11/1951<br>Pesho Peshev 23/05/1980<br>End | Pesho Peshev 23/05/1980<br>Parents:<br>Stamat Peshev 11/11/1951<br>Penka Pesheva 09/02/1953<br>Children:<br>Gancho Peshev 01/01/2005 |
| 13/12/1993<br>25/03/1934 - 04/04/1961<br>Poncho Tonchev 25/03/1934<br>04/04/1961 - Moncho Tonchev<br>Toncho Tonchev - Lomcho Tonchev<br>Moncho Tonchev 13/12/1993<br>Lomcho Tonchev 07/07/1995<br>Toncho Tonchev 04/04/1961<br>End | Moncho Tonchev 13/12/1993<br>Parents:<br>Toncho Tonchev 04/04/1961<br>Children: |

## 9. \*\* Cat Lady

_Ginka has many cats in her house of various breeds, since some breeds have specific characteristics, Ginka needs some way to catalogue the cats, help her by creating a class hierarchy with all her breeds of cats so that she can easily check on their characteristics._

Ginka has 3 specific breeds of cats &quot;**Siamese**&quot;, &quot;**Cymric**&quot; and the very famous bulgarian breed &quot;**Street Extraordinaire**&quot;, each breed has a **specific** characteristic about which information should be kept. For the Siamese cats their **ear size** should be kept, for Cymric cats - the **length** of **their fur** in milimeters and for the Street Extraordinaire the **decibels** of their **meowing** during the night.

From the console you will receive lines of cat information until the command &quot;**End**&quot; is received, the information will come in one of the following formats:

- &quot; **Siamese {name} {earSize}**&quot;
- &quot; **Cymric {name} {furLength}**&quot;
- &quot; **StreetExtraordinaire {name} {decibelsOfMeows}**&quot;

On the last line after the &quot;**End**&quot; command you will receive the **name** of a cat, you should print that cat. Round the numbers **two digits** after the decimal separator.

### Examples

| Input | Output |
|-|-|
| StreetExtraordinaire Maca 85<br>Siamese Sim 4<br>Cymric Tom 28<br>End<br>Tom | Cymric Tom 28.00 |
| StreetExtraordinaire Koti 80<br>StreetExtraordinaire Maca 100<br>Cymric Tim 31<br>End<br>Maca | StreetExtraordinaire Maca 100.00 |

### Hint

Use class inheritance to represent the cat hierarchy and override the ToString() methods of concrete breeds to allow for easy printing of the cat, regardless what breed it is.
