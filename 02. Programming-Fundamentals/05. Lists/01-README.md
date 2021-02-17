# Exercise: Lists

Problems for exercises and homework for the [&quot;Technology Fundamentals&quot; course @ SoftUni](https://softuni.bg/courses/programming-fundamentals).

You can check your solutions in [Judge.](https://judge.softuni.bg/Contests/1297)

## 1. Train

On the first line you will be given a **list of wagons** (integers). Each integer represents **the number of passengers that are currently in each wagon**. On the next line you will get **the max capacity of each wagon** (single integer). Until you receive &quot;**end**&quot; you will be given two types of input:

- **Add {passengers}** - add a wagon to the end with the given number of passengers
- **{passengers}** - find an existing wagon to **fit all the passengers** ( **starting from the first wagon** )

At the end **print the final state** of the train (all the wagons separated by a space)

### Example

| Input                                                                | Output                   |
|----------------------------------------------------------------------|--------------------------|
| 32 54 21 12 4 0 23<br>75<br>Add 10<br>Add 0<br>30<br>10<br>75<br>end | 72 54 21 12 4 75 23 10 0 |
| 0 0 0 10 2 4<br>10<br>Add 10<br>10<br>10<br>10<br>8<br>6<br>end      | 10 10 10 10 10 10 10     |


## 2. Change List

Write a program, which reads a **list** of **integers** from the console and receives **commands** , which **manipulate** the list. Your program may receive the following commands:

- **Delete {element}** - delete all elements in the array, which are equal to the given element
- **Insert {element} {position}** - insert element at the given position

You should stop the program when you receive the command **&quot;end&quot;**. Print all numbers in the array separated with a **single** whitespace.

### Examples

| Input                                                                           | Output                           |
|---------------------------------------------------------------------------------|----------------------------------|
| 1 2 3 4 5 5 5 6<br>Delete 5<br>Insert 10 1<br>Delete 5<br>end                   | 1 10 2 3 4 6                     |
| 20 12 4 319 21 31234 2 41 23 4<br>Insert 50 2<br>Insert 50 5<br>Delete 4<br>end | 20 12 50 319 50 21 31234 2 41 23 |

## 3. House Party

Write a program that keeps track of the guests that are going to a house party.

On the **first** input line you are going to receive how many commands you are going to have. On the **next lines** you are going to receive some of the following inputs:

- **&quot;{name} is going!&quot;**
- **&quot;{name} is not going!&quot;**

If you receive the first type of input, you have to add the person if he/she **is not** in the list. (If he/she is in the list print on the console: &quot;**{name} is already in the list!**&quot;). If you receive the second type of input, you have to remove the person if he/she **is** in the list. (If not print: &quot;**{name} is not in the list!**&quot;). At the end print all guests.

### Examples

| Input | Output |
|-|-|
| 4<br>Allie is going!<br>George is going!<br>John is not going!<br>George is not going! | John is not in the list!<br>Allie |
| 5<br>Tom is going!<br>Annie is going!<br>Tom is going!<br>Garry is going!<br>Jerry is going! | Tom is already in the list!<br>Tom<br>Annie<br>Garry<br>Jerry |

## 4. List Operations

You will be given numbers (list of integers) on the first input line. Until you receive **&quot;End&quot;** you will be given operations you have to apply on the list. The possible commands are:

- **Add {number}** - add number at the end
- **Insert {number} {index}** - insert number at given index
- **Remove {index}** - remove that index
- **Shift left {count}** - first number becomes last &#39;count&#39; times
- **Shift right {count}** - last number becomes first &#39;count&#39; times

**Note: It is possible that the index given is outside of the bounds of the array. In that case print &quot;Invalid index&quot;.**

### Examples

| Input                                                                                             | Output                               |
|---------------------------------------------------------------------------------------------------|--------------------------------------|
| 1 23 29 18 43 21 20 <br>Add 5<br>Remove 5<br>Shift left 3<br>Shift left 1<br>End                  | 43 20 5 1 23 29 18                   |
| 5 12 42 95 32 1<br>Insert  3 0<br>Remove 10<br>Insert 8 6<br>Shift right 1<br>Shift left 2<br>End | Invalid index<br>5 12 42 95 32 8 1 3 |

## 5. Bomb Numbers

Write a program that **reads sequence of numbers** and **special bomb number** with a certain **power**. Your task is to **detonate every occurrence of the special bomb number** and according to its power - **his neighbors from left and right**. Detonations are performed from left to right and all detonated numbers disappear. Finally print the **sum of the remaining elements** in the sequence.

### Examples

| Input | Output | Comments |
|-|-|-|
| 1 2 2 4 2 2 2 9<br>4 2 | 12 | Special number is 4 with power 2. After detonation we left with the sequence <br>[1, 2, 9] with sum 12. |
| 1 4 4 2 8 9 1<br>9 3 | 5 | Special number is 9 with power 3. After detonation we left with the sequence <br>[1, 4] with sum 5. Since the 9 has only 1 neighbor from the right we remove <br>just it (one number instead of 3). |
| 1 7 7 1 2 3<br>7 1 | 6 | Detonations are performed from left to right. We could not detonate the <br>second occurrence of 7 because its already destroyed by the first occurrence. <br>The numbers [1, 2, 3] survive. Their sum is 6. |
| 1 1 2 1 1 1 2 1 1 1<br>2 1 | 4 | The red and yellow numbers disappear in two sequential detonations. <br>The result is the sequence [1, 1, 1, 1]. Sum = 4 |

## 6. Cards Game

You will be given two hands of cards, which will be **integer** numbers. Assume that you have two players. You have to find out the winning deck and respectively the winner.

You start from the beginning of both hands. Compare the cards from the first deck to the cards from the second deck. The player, who has bigger card, takes both cards and puts them at the **back** of his hand - **the second player&#39;s card is last, and the first person&#39;s card (the winning one) is before it (second to last)** and the player with smaller card must **remove** the **card** from his deck. If both players&#39; cards have the same values - no one wins, and the two cards must be **removed from** the **decks**. The game is over when one of the decks is left without any cards. You have to print the winner on the console and the sum of the left cards:**&quot;Player {one/two} wins! Sum: {sum}&quot;**.

### Examples

| Input                            | Output                      |
|----------------------------------|-----------------------------|
| 20 30 40 50<br>10 20 30 40       | First player wins! Sum: 240 |
| 10 20 30 40 50<br>50 40 30 30 10 | Second player wins! Sum: 50 |

## 7. Append Arrays

Write a program to **append several arrays** of numbers.

- Arrays are separated by &quot;**|**&quot;
- Values are separated by spaces (&quot; &quot;, **one or several** )
- Order the arrays from the **last** to the **first** , and their values from **left** to **right**

### Examples

| Input                    | Output          |
|--------------------------|-----------------|
| 1 2 3 \|4 5 6 \|  7  8   | 7 8 4 5 6 1 2 3 |
| 7 \| 4  5\|1 0\| 2 5 \|3 | 3 2 5 1 0 4 5 7 |
| 1\| 4 5 6 7  \|  8 9     | 8 9 4 5 6 7 1   |

## 8. \*Anonymous Threat

_The Anonymous have created a cyber hypervirus which steals data from the CIA. You, as the lead security developer in CIA, have been tasked to analyze the software of the virus and observe its actions on the data. The virus is known for his innovative and unbelievably clever technique of merging and dividing data into partitions._

You will receive a **single input line** containing **STRINGS** separated by **spaces**.
The strings may contain **any ASCII** character except **whitespace**.

You will then begin receiving commands in one of the following formats:

- **merge {startIndex} {endIndex}**
- **divide {index} {partitions}**

Every time you receive the **merge command** , you must merge all elements from the **startIndex** till the **endIndex**. In other words, you should concatenate them.
**Example** : **{abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}**

If **any** of the **given indexes** is **out of the array** , you must take **ONLY** the **range** that is **INSIDE** the **array** and **merge** it.

Every time you receive the **divide command** , you must **DIVIDE** the **element** at the **given index** into **several small substrings** with **equal length**. The **count** of the **substrings** should be **equal** to the **given partitions**.

**Example** : **{abcdef, ghi, jkl} -> divide 0 3 -> {ab, cd, ef, ghi, jkl}**

If the string **CANNOT** be **exactly divided** into the **given partitions , make all partitions except** the **LAST** with **EQUAL LENGTHS** , and make the **LAST one – the LONGEST**.

**Example** : **{abcd, efgh, ijkl} -\&gt; divide 0 3 -\&gt; {a, b, cd, efgh, ijkl}**

The **input ends** when you receive the command &quot;**3:1**&quot;. At that point you must print the **resulting elements**, **joined** by a **space**.

### Input

- The **first input line** will contain the **array** of **data**
- On the **next several input** lines you will **receive commands** in the **format specified above**
- The **input ends** when you receive the command &quot;**3:1**&quot;

### Output

- As output you must print a single line containing the elements of the array, **joined** by a **space**.

### Constrains

- The **strings** in the **array** may contain any **ASCII character** except **whitespace**
- The **startIndex** and the **endIndex** will be in **range [-1000, 1000]**
- The **endIndex** will **ALWAYS** be **GREATER** than the **startIndex**
- The **index** in the **divide command** will **ALWAYS** be **INSIDE** the array
- The **partitions** will be in **range [0, 100]**
- Allowed working **time/memory** : **100ms / 16MB**

### Examples

| Input                                                                  | Output                             |
|------------------------------------------------------------------------|------------------------------------|
| Ivo Johny Tony Bony Mony<br>merge 0 3<br>merge 3 4<br>merge 0 3<br>3:1 | IvoJohnyTonyBonyMony               |
| abcd efgh ijkl mnop qrst uvwx yz<br>merge 4 10<br>divide 4 5<br>3:1    | abcd efgh ijkl mnop qr st uv wx yz |

## 9. \*Pokemon Don&#39;t Go

_Ely likes to play Pokemon Go a lot. But Pokemon Go bankrupted… So, the developers made Pokemon Don&#39;t Go out of depression. And so, Ely now plays Pokemon Don&#39;t Go. In Pokemon Don&#39;t Go, when you walk to a certain pokemon, those closer to you, naturally get further, and those further from you, get closer._

You will receive a **sequence** of **integers** , separated by **spaces** - the distances to the pokemons.
Then you will begin **receiving integers** , which will **correspond** to **indexes** in **that sequence**.

When you **receive** an **index** , you must **remove** the **element** at **that index** from the **sequence** (as if you&#39;ve captured the pokemon).

- You must **INCREASE** the **value** of **all elements** in the sequence which are **LESS** or **EQUAL** to the **removed element** , with the **value** of the **removed element**.
- You must **DECREASE** the **value** of **all elements** in the sequence which are **GREATER** than the **removed element** , with the **value** of the **removed element**.

If the **given index** is **LESS** than **0** , **remove** the **first element** of the **sequence** , and **COPY** the **last element** to its place.

If the **given index** is **GREATER** than the **last index** of the **sequence** , **remove** the **last element** from the sequence, and **COPY** the **first element** to its place.

The **increasing** and **decreasing** of elements should be done in these cases, **also**. The **element** , whose value you should use, is the **REMOVED** element.

The program **ends** when the **sequence** has **no elements** (there are no pokemons left for Ely to catch).

### Input

- On the **first line** of input you will receive a **sequence** of **integers** , **separated** by **spaces**
- On the **next several** lines you will receive **integers** – the **indexes**

### Output

- When the program ends, you must print on the console, the **summed up value** of **all REMOVED elements**

### Constrains

- The input data will consist **ONLY** of **valid integers** in the **range [-2.147.483.648, 2.147.483.647]**

### Examples

| Input | Output | Comments |
|-|-|-|
| 4 5 3<br>1<br>1<br>0 | 14 | The array is {4, 5, 3}. The index is 1.<br>We remove 5, and we increase all lower than it and decrease all higher than it.<br>In this case there are no higher than 5.<br>The result is {9, 8}.<br>The index is 1. So we remove 8, and decrease all higher than it. <br>The result is {1}. <br>The index is 0. So we remove 1. <br>There are no elements left, so we print the sum of all removed elements. <br>5 + 8 + 1 = 14. |
| 5 10 6 3 5<br>2<br>4<br>1<br>1<br>3<br>0<br>0 | 51 | Step 1: {11, 4, 9, 11}<br>Step 2: {22, 15, 20, 22}<br>Step 3: {7, 5, 7}<br>Step 4: {2, 2}<br>Step 5: {4, 4}<br>Step 6: {8}<br>Step 7: {} (empty).<br>Result = 6 + 11 + 15 + 5 + 2 + 4 + 8 = 51. |

## 10. \*SoftUni Course Planning

_You are tasked to help plan the next Programing Fundamentals course by keeping track of the lessons, that are going to be included in the course, as well as all the exercises for the lessons._

On the first input line you will **receive the initial schedule of lessons and exercises** that are going to be part of the next course, separated by **comma and space &quot;, &quot;.** But before the course starts, there are some changes to be made. Until you receive **&quot;course start&quot;** you will be given **some commands to modify the course schedule**. The possible commands are:

**Add:{lessonTitle}** - add the lesson to the end of the schedule, **if it does not exist**

**Insert:{lessonTitle}:{index}** -insert the lesson to the given index, **if it does not exist**

**Remove:{lessonTitle}** -remove the lesson, **if it exists**

**Swap:{lessonTitle}:{lessonTitle}** -change the place of the two lessons, **if they exist**

**Exercise:{lessonTitle}** -add Exercise in the schedule right after the lesson index **, if the lesson exists and there is no exercise already** , in the following format **&quot;{lessonTitle}-Exercise&quot;**. **If the lesson doesn&#39;t exist** , **add the lesson** in the end of the course schedule **, followed by the Exercise**.

**Each time you Swap or Remove a lesson, you should do the same with the Exercises, if there are any, which follow the lessons.**

### Input

- On the first line -the initial schedule lessons -strings, separated by comma and space &quot;, &quot;
- Until **&quot;course start&quot;** you will receive commands in the format described above

### Output

- Print the whole course schedule, each lesson on a new line with its number(index) in the schedule:
**&quot;{lesson index}.{lessonTitle}&quot;**
- Allowed working **time** / **memory** : **100ms** / **16MB**

### Examples

| Input | Output | Comments |
|-|-|-|
| Data Types, Objects, Lists<br>Add:Databases<br>Insert:Arrays:0<br>Remove:Lists<br>course start | 1.Arrays<br>2.Data Types<br>3.Objects<br>4.Databases | We receive the initial schedule. <br>Next, we add Databases lesson, because it doesn't exist. <br>We Insert at the given index lesson Arrays, because it's not present in the schedule. <br>After receiving the last command and removing lesson Lists, we print the whole schedule. |
| Arrays, Lists, Methods<br>Swap:Arrays:Methods<br>Exercise:Databases<br>Swap:Lists:Databases<br>Insert:Arrays:0<br>course start | 1.Methods<br>2.Databases<br>3.Databases-Exercise<br>4.Arrays<br>5.Lists | We swap the given lessons, because both exist.<br>After receiving the Exercise command, we see that such lesson <br>doesn't exist, so we add the lesson at the end, followed by the exercise.<br>We swap Lists and Databases lessons, the Databases-Exercise is <br>also moved after the Databases lesson.<br>We skip the next command, because we already have such lesson in our schedule. |
