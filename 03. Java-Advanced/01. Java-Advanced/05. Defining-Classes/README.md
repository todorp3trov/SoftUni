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

