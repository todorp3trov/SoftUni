# Lab: Functional Programming

This document defines the lab for [&quot;Java Advanced&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). You can check your solutions in [Judge](https://judge.softuni.bg/Contests/1513/Functional-Programming-Lab).

## 1. Sort Even Numbers

Write a program that reads one line of **Integers** separated by **&quot;, &quot;**.

- Print the **even** numbers
- **Sort** them in ascending order
- Print them again.

Use 2 **Lambda Expresions** to do so.

### Examples

| Input | Output |
|-|-|
| 4, 2, 1, 3, 5, 7, 1, 4, 2, 12 | 4, 2, 4, 2, 12<br>2, 2, 4, 4, 12 |
| 1, 3, 5 | (no output) |
| 2, 4, 6 | 2, 4, 6<br>2, 4, 6 |

### Hints

- It is up to you what type of data structures you will use to solve this problem
- Try different ways, for solving this problem, for example:

## 2. Sum Numbers

Write a program that reads one line of **Integers** separated by **&quot;, &quot;**. Print the **count** of the numbers and their **sum.**

Use a **Function{String, Integer}**

### Examples

| Input | Output |
|-|-|
| 4, 2, 1, 3, 5, 7, 1, 4, 2, 12 | Count = 10<br>Sum = 41 |
| 2, 4, 6 | Count = 3<br>Sum = 12 |

### Hints

- Use **Function{String, Integer}** for **parsing** integers after you split them to a **String** array

## 3. Count Uppercase Words

Write a program that reads one line of **text** from the console. Print the **count** of words that start with a **Uppercase letter** , after that print all these **words** in the **same order,** like you found them in the text.

Use a **Predicate{String}**

### Examples

| Input | Output |
|-|-|
| The following example shows how to use Predicate | 2<br>The<br>Predicate |
| Write a program that reads one line of text from console. <br>Print count of words that start with Uppercase, <br>after that print all those words in the same order like you find them in text. | 3<br>Write<br>Print<br>Uppercase, |

### Hints

- Use a **Predicate{String}** like an **if-condition**

## 4. Add VAT

Write a program that reads one line of **Double** prices separated by **&quot;, &quot;**. Print the prices with added **VAT** s for all of them. Format them to the **2nd** digit after the decimal point. The order of the prices must remain the same.

Use an **UnaryOperator{Double}**

### Examples

| Input | Output |
|-|-|
| 1.38, 2.56, 4.4 | Prices with VAT:<br>1.66<br>3.07<br>5.28 |
| 1, 3, 5, 7 | Prices with VAT:<br>1.20<br>3.60<br>6.00<br>8.40 |

## 5. Filter by Age

Write a program that reads an integer **N** on the first line. And on next **N** lines read pairs of **&quot;[name], [age]&quot;.** Then read three more lines with:

- Condition - &quot;**younger**&quot; or &quot;**older**&quot;
- Age - **Integer**
- Format - &quot;**name**&quot;, &quot;**age**&quot; or &quot;**name age**&quot;

Depending on the **condition,** print the **pairs** in the right **format**.

**Don&#39;t use any build-in functionality. Write your own methods.**

### Examples

| Input | Output | Input | Output | Input | Output |
|-|-|-|-|-|-|
| 5<br>Pesho, 20<br>Gosho, 18<br>Mimi, 29<br>Ico, 31<br>Simo, 16<br>older<br>20<br>name age | Pesho - 20<br>Mimi - 29<br>Ico - 31 | 5<br>Pesho, 20<br>Gosho, 18<br>Mimi, 29<br>Ico, 31<br>Simo, 16<br>younger<br>20<br>name | Pesho<br>Gosho<br>Simo | 5<br>Pesho, 20<br>Gosho, 18<br>Mimi, 29<br>Ico, 31<br>Simo, 16<br>younger<br>50<br>age | 20<br>18<br>29<br>31<br>16 |

## 6. Find Evens or Odds

You are given a **lower** and an **upper bound** for a range of integer numbers. Then a command specifies if you need to list all **even or odd** numbers in the given range. Use **predicates** that need to be **passed to a method.**

### Examples

| Input | Output |
|-|-|
| 1 10<br>odd | 1 3 5 7 9 |
| 20 30<br>even | 20 22 24 26 28 30 |

# Exercises: Functional Programming

This document defines the exercises for [&quot;Java Advanced&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). You can check your solutions in [Judge](https://judge.softuni.bg/Contests/1514/Functional-Programming-Exercises).

## 1. Consumer Print

Write a program that **reads** a collection of **strings** , separated by one or **more** whitespaces, from the console and then prints them onto the console. Each string should be printed on a new line. Use a **Consumer{T}**.

### Examples

| Input | Output |
|-|-|
| Pesho Gosho Adasha | Pesho<br>Gosho<br>Adasha |

## 2. Knights of Honor

Write a program that **reads a collection of names** as strings from the console and then **appends &quot;Sir&quot;** in front of every name and prints it back onto the console. Use a **Consumer{T}**.

### Examples

| Input | Output |
|-|-|
| Pesho Gosho Adasha StanleyRoyce | Sir Pesho <br>Sir Gosho<br>Sir Adasha<br>Sir StanleyRoyce |

## 3. Custom Min Function

Write a simple program that **reads** a **set of numbers** from the console and finds the **smallest** of the **numbers** using a simple **Function{Integer[], Integer}**.

### Examples

| Input | Output |
|-|-|
| 1 4 3 2 1 7 13 | 1 |

## 4. Applied Arithmetic

On the first line you are given a **list of numbers**. On the next lines you are passed different **commands** that you need to apply to all numbers in the list: **&quot;add&quot;** -> adds 1; **&quot;multiply&quot;** -> multiplies by 2; **&quot;subtract&quot;** -> subtracts 1; **&quot;print&quot;** -> prints all numbers on **a new line**. The input will end with an &quot;**end**&quot; command, after which you need to print the result.

### Examples

| Input | Output | Input | Output |
|-|-|-|-|
| 1 2 3 4 5<br>add<br>add<br>print<br>end | 3 4 5 6 7 | 5 10<br>multiply<br>subtract<br>print<br>end | 9 19 |

## 5. Reverse and Exclude

Write a program that **reverses** a collection and **removes** elements that are **divisible** by a given integer **n**.

### Examples

| **Input** | **Output** |
| --- | --- |
| 1 2 3 4 5 62 | 5 3 1 |
| 20 10 40 30 60 503 | 50 40 10 20 |

## 6. Predicate for Names

Write a **predicate**. Its goal is to **check** a name for its length and to return **true** if the names length is **less or equal** the passed **integer**. You will be given an **integer** that represents the length you have to use. On the second line you will be given a **string** array with some names. Print the names, passing the **condition** in the predicate.

### Examples

| Input | Output |
|-|-|
| 4<br>Kurnelia Qnaki Geo Muk Ivan | Geo<br>Muk<br>Ivan |
| 4<br>Karaman Asen Kiril Yordan | Asen |

## 7. Find the Smallest Element

Write a program which is using a custom **function** (written by you) to find the **smallest** integer in a **sequence** of **integers**. The input could have more than one space. Your task is to **collect** the integers from the console, find the **smallest one** and print its **index** (if **more** than one such elements exist, print the index of the **rightmost** one).

### Hints

- Use a **Function{List{Integer}, Integer}** or something similar.

### Examples

| Input | Output |
|-|-|
| 1 2 3 0 4 5 6 | 3 |
| 123 10 11 3 | 3 |

## 8. Custom Comparator

Write a custom **comparator** that **sorts** all even numbers before all **odd** ones in **ascending order**. Pass it to an **Arrays.sort()** function and print the result.

### Examples

| Input | Output |
|-|-|
| 10<br>1 1 1 2 | 2 4 6 8 10 |
| 100<br>2 5 10 20 | 20 40 60 80 100 |

## 9. List of Predicates

Find all **numbers** in the range **1..N** that are **divisible** by the numbers of a given sequence. Use **predicates**.

### Examples

| **Input** | **Output** |
| --- | --- |
| 101 1 1 2 | 2 4 6 8 10 |
| 1002 5 10 20 | 20 40 60 80 100 |


## 10. Predicate Party!

The Wire&#39;s parents are on a vacation for the holidays and he is planning an epic party at home. Unfortunately, his organizational skills are next to non-existent so you are given the task to help him with the reservations.

On the first line you get a **list** with all the **people** that are coming. On the next lines, until you get the &quot;**Party**!&quot; command, you may be asked to **double** or **remove** all the people that apply to **given criteria**. There are three different options:

- Everyone that has a name **starting** with a given string;
- Everyone that has a name **ending** with a given string;
- Everyone that has a name with a given **length**.

When you print the guests that are coming to the party, you have to print them in **asscending** order. If nobody is going, print **&quot;Nobody is going to the party!&quot;.** See the examples below:

### Examples

| Input | Output |
|-|-|
| Pesho Misho Stefan<br>Remove StartsWith P<br>Double Length 5<br>Party! | Misho, Misho, Stefan are going to the party! |
| Pesho<br>Double StartsWith Pesh<br>Double EndsWith esho<br>Party! | Pesho, Pesho, Pesho, Pesho are going to the party! |
| Pesho<br>Remove StartsWith P<br>Party! | Nobody is going to the party! |

## 11. \* The Party Reservation Filter Module

You are a young and talented **developer**. The first task you need to do is to implement a **filtering module** to a party reservation software. First, The Party Reservation Filter Module ( **TPRF** Module for short) is passed a **list** with invitations. Next the **TPRF** receives a sequence of **commands** that specify if you need to add or remove a given filter.

**TPRF** Commands are in the given format **{command;filter type;filter parameter}**

You can receive the following **TPRF** commands: **&quot;Add filter&quot;** , **&quot;Remove filter&quot;** or **&quot;Print&quot;**. The possible **TPRF** filter types are: **&quot;Starts with&quot;, &quot;Ends with&quot;, &quot;Length&quot;** and **&quot;Contains&quot;.** All **TPRF** filter parameters will be a string (or an integer for the length filter).

The input will end with a **&quot;Print&quot;** command. See the examples below:

### Examples

| Input | Output |
|-|-|
| Pesho Misho Slav<br>Add filter;Starts with;P<br>Add filter;Starts with;M<br>Print | Slav |
| Pesho Misho Jica<br>Add filter;Starts with;P<br>Add filter;Starts with;M<br>Remove filter;Starts with;M<br>Print | Misho Jica |
