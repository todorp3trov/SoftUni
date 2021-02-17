
# Lab: Multidimensional Arrays

This document defines the lab for [&quot;Java Advanced&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). 
You can check your solutions in  [Judge](https://judge.softuni.bg/Contests/1459/Multidimensional-Arrays-Lab).

## 1. Compare Matrices

Write a program that reads two integer matrices (2D arrays) from the console and compares them element by element. For better code reusability, you could do the comparison in a method, which returns **true** if they are equal and **false** if not.

Each matrix definition on the console will contain a line with a positive integer number **R** – the number of rows in the matrix and **C** – the number of columns – followed by **R** lines containing the **C** numbers, separated by spaces (each line will have an equal amount of numbers.

The matrices will have at most **10** rows and at most **10** columns.

Print **equal** if the matrices match, and **not equal** if they don&#39;t match.

### Examples

| Input                                          | Output    |
|------------------------------------------------|-----------|
| 2 3<br>1 2 3<br>2 1 3<br>2 3<br>1 2 3<br>2 1 3 | equal     |
| 2 3<br>1 2 3<br>4 5 6<br>2 2<br>1 3<br>4 5     | not equal |

## 2. Positions Of

Write a program that reads a matrix of integers from the console, then a number and prints all the positions at which that number appears in the matrix.

The matrix definition on the console will contain a line with two positive integer numbers **R** and **C** – the number of rows and columns in the matrix – followed by **R** lines, each containing **C** numbers (separated by spaces), representing each row of the matrix.

The number you will need to find the positions of will be entered on a single line, after the matrix.

You should print each position on a single line – first print the row, then the column at which the number appears.

If the number does not appear in the matrix, print **not found**

### Examples

| Input                         | Output            |
|-------------------------------|-------------------|
| 2 3<br>1 2 3<br>4 2 2<br>2    | 0 1<br>1 1<br>1 2 |
| 2 3<br>1 -2 -3<br>4 -5 6<br>5 | not found         |

## 3. Intersection of Two Matrices

Write a program that reads two char matrices **(A[][] and B[][])** of the same order **M \* N** andprints third matrix **C[][]** which is filled with the intersecting elements of **A and B** ,otherwise set the element to **&#39;\*&#39;**. On the first two lines you receive **M** and **N** , then on **2 \* M** lines **N** characters – the matrices elements.

The matrix elements may be any ASCII char **except &#39;\*&#39;.**

### Examples

| Input                                                                    | Output                          |
|--------------------------------------------------------------------------|---------------------------------|
| 3<br>4<br>a b c d<br>a b c d<br>a b c d<br>k b c k<br>a b g d<br>a k c d | * b c * <br>a b * d <br>a * c d |

## 4. Sum Matrix Elements

Write a program that **reads a matrix** from the console and prints:

- The count of **rows**
- The count of **columns**
- The sum of all **matrix&#39;s elements**

On the first line you will get the dimensions of the matrix in format **{rows, columns}.** On the next lines you will get the elements for each **row** separated with a coma.

### Examples

| Input                                                            | Output       |
|------------------------------------------------------------------|--------------|
| 3, 6<br>7, 1, 3, 3, 2, 1<br>1, 3, 9, 8, 5, 6<br>4, 6, 7, 9, 1, 0 | 3<br>6<br>76 |

## 5. Maximum Sum of 2X2 Submatrix

Write a program that **reads a matrix** from the console. Then find the biggest sum of a **2x2 submatrix.** Print the submatrix and its sum.

On the first line you will get the dimensions of the matrix in format **{rows, columns}.** On the next lines you will get the elements for each **row** separated with a coma.

### Examples

| Input                                                            | Output                 |
|------------------------------------------------------------------|------------------------|
| 3, 6<br>7, 1, 3, 3, 2, 1<br>1, 3, 9, 8, 5, 6<br>4, 6, 7, 9, 1, 0 | 9 8<br>7 9<br>33       |
| 2, 4<br>10, 11, 12, 13<br>14, 15, 16, 17                         | 12 13 <br>16 17 <br>58 |

## 6. Print Diagonals of Square Matrix

Write a program that **reads a matrix** from the console. Then print the diagonals. The matrix will always be square. On the first line you read a single integer **N** the matrix size. Then on each line N elements. The first diagonal should always start with the element at the **first row and col** , the second diagonal should start with the element at the **last row and first col**.

### Examples

| Input                                         | Output              |
|-----------------------------------------------|---------------------|
| 3<br>1 2 3<br>1 2 3<br>1 2 3                  | 1 2 3<br>1 2 3      |
| 4<br>1 2 3 2<br>1 1 2 4<br>1 2 1 4<br>2 2 3 1 | 1 1 1 1 <br>2 2 2 2 |

## 7. \*\*Find the Real Queen

Write a program that **reads (8 x 8) matrix of characters** from the console. The matrix represents a chess board with figures on it. The figures can be - queens as char **&#39;q&#39;** or **any other ASCII symbol**. There will be more than one queen but only **one queen will have valid position** , which is not attacked from any other queen and does not attack any other queen. In other word in the way of the valid queen there are no other queens, but there may be any other ASCII symbol. Your task is to read the chessboard and find the position of the valid queen. According to chess rules the queen can attack all the cells in horizontal vertical and both diagonals which cross the queen position.

### Examples

| Input | Output |
|-|-|
| p a p a p a p a<br>p a p a p a p a<br>p a q a p a q a<br>p a p a p a p a<br>p a p q p a p a<br>p a p a p a p a<br>p a q a p a q a<br>p a p a p a p a | 4 3 |
| 1 q q q 1 q q q<br>q 1 q q 1 q q 1<br>q q 1 q 1 q 1 q<br>q q q 1 1 1 q q<br>1 1 1 1 q 1 1 1<br>q q q 1 1 1 q q<br>q q 1 q 1 q 1 q<br>q 1 q q 1 q q 1 | 4 4 |

## 8. Wrong Measurements

You will be given the rows of a matrix. Then the matrix itself. Inside this matrix there are mistaken values which need to be replaced you will receive the wrong value at the last line. Those values should be replaced with the sum of the nearest elements in the four directions **up, down, left and right** , but only if they are valid values. At the end you have to print the fixed measurements.

### Examples

| Input                                     | Output                            |
|-------------------------------------------|-----------------------------------|
| 3<br>1 2 4<br>4 6 7<br>8 9 4<br>1 0       | 1 2 9 <br>15 6 7 <br>8 9 16       |
| 3<br>1 2 4 4<br>4 6 4 3<br>8 9 4 2<br>1 0 | 1 2 2 3 <br>15 6 9 3 <br>8 9 11 2 |

# Exercises: Multidimensional Arrays

This document defines the exercises for [&quot;Java Advanced&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). 
You can check your solutions in  [Judge](https://judge.softuni.bg/Contests/1460/Multidimensional-Arrays-Exercises).

## 1. Fill the Matrix

Filling a matrix in the regular way ( **top to bottom** and **left to right** ) is boring. Write two **methods** that **fill** a **matrix** of size  **N x N** in **two** different **patterns.**

### Examples

| Input | Output                    |
|-------|---------------------------|
| 3, A  | 1 4 7 <br>2 5 8 <br>3 6 9 |
| 3, B  | 1 6 7 <br>2 5 8 <br>3 4 9 |

### Hints

- Make a different method for each pattern
- Make a method for printing the matrix

## 2. Matrix of Palindromes

Write a program to generate the following **matrix of palindromes** of **3** letters with **r** rows and **c** columns like the one in the examples below.

- **Rows** define the first and the last letter: row 0 -> &#39;a&#39;, row 1 -> &#39;b&#39;, row 2 -> &#39;c&#39;, …
- **Columns + rows** define the middle letter:
  - column 0, row 0 -> &#39;a&#39;, column 1, row 0 -> &#39;b&#39;, column 2, row 0 -> &#39;c&#39;, …
  - column 0, row 1 -> &#39;b&#39;, column 1, row 1 -> &#39;c&#39;, column 2, row 1 -> &#39;d&#39;, …

### Input

- The numbers **r** and **c** stay at the first line at the input.
- **r** and **c** are integers in the range [1…26].
- **r + c** ≤ 27

### Examples

| Input | Output |
|-|-|
| 4 6 | aaa aba aca ada aea afa<br>bbb bcb bdb beb bfb bgb<br>ccc cdc cec cfc cgc chc<br>ddd ded dfd dgd dhd did |
| 3 2 | aaa aba<br>bbb bcb<br>ccc cdc |

### Hints

- Use two nested loops to generate the matrix.
- Print the matrix row by row in a loop.
- Don&#39;t forget to pack everything in methods.

## 3. Diagonal Difference

Write a program that finds the **difference between the sums of the square matrix diagonals** (absolute value).

### Input

- The **first line** holds a number **n** – the size of matrix.
- The next **n**  **lines** hold the **values for every row** – **n** numbers separated by a space.

### Examples

| Input | Output | Comment |
|-|-|-|
| 3<br>11 2 4<br>4 5 6<br>10 8 -12 | 15 | Primary diagonal: sum = 11 + 5 + (-12) = 4<br>Secondary diagonal: sum = 4 + 5 + 10 = 19<br>Difference: \|4 - 19\| = 15 |

### Hints

- Use a **single** loop **i = [1…n]** to sum the diagonals.

- The **primary diagonal** holds all cells { **row** , **col** } where **row** == **col** == **i**.
- The **secondary diagonal** holds all cells { **row** , **col** } where **row** == **i** and **col** == **n-1-i**.

## 4. Maximal Sum

Write a program that reads a rectangular integer matrix of size  **N x M**  and finds in it the square  **3 x 3**  that **has maximal sum of its elements**.

### Input

- On the first line, you will receive the rows **N** and columns **M**.
- On the next **N lines** you will receive **each row with its elements**.

Print the **elements** of the 3 x 3 square as a matrix, along with their **sum**. See the format of the output below:

### Examples

| Input | Output |
|-|-|
| 4 5<br>1 5 5 2 4<br>2 1 4 14 3<br>3 7 11 2 8<br>4 8 12 16 4 | Sum = 75<br>1 4 14<br>7 11 2<br>8 12 16 |

## 5. Matrix Shuffling

Write a program which reads a string matrix from the console and performs certain operations with its elements. User input is provided in a similar way like in the problems above – first you read the **dimensions** and then the **data**.

Your program should then receive commands in format: &quot;**swap row1 col1 row2c col2**&quot; where row1, row2, col1, col2 are **coordinates** in the matrix. In order for a command to be valid, it should start with the &quot; **swap**&quot; keyword along with **four valid coordinates** (no more, no less). You should **swap the values** at the given coordinates (cell [row1, col1] with cell [row2, col2]) **and print the matrix at each step** (thus you&#39;ll be able to check if the operation was performed correctly).

If the **command is not valid** (doesn&#39;t contain the keyword &quot;swap&quot;, has fewer or more coordinates entered or the given coordinates do not exist), print &quot;**Invalid input!**&quot; and move on to the next command. Your program should finish when the string &quot;**END**&quot; is entered.

### Examples

| Input | Output |
|-|-|
| 2 3<br>1 2 3<br>4 5 6<br>swap 0 0 1 1<br>swap 10 9 8 7<br>swap 0 1 1 0<br>END | 5 2 3<br>4 1 6<br>Invalid input!<br>5 4 3<br>2 1 6 |
| 1 2<br>Hello World<br>0 0 0 1<br>swap 0 0 0 1<br>swap 0 1 0 0<br>END | Invalid input!<br>World Hello<br>Hello World |

### Hints

- Think about Exception Handling

## 6. String Matrix Rotation

You are given a **sequence of text lines**. Assume these text lines form a **matrix of characters** (pad the missing positions with spaces to build a rectangular matrix). Write a program to **rotate the matrix** by 90, 180, 270, 360, … degrees. Print the result at the console as sequence of strings after receiving the &quot;**END**&quot; command.

### Input

The input is read from the console:

- The first line holds a command in format &quot;**Rotate(X)**&quot; where **X** are the degrees of the requested rotation.
- The next lines contain the **lines of the matrix** for rotation.
- The input ends with the command &quot;**END**&quot;.

The input data will always be valid and in the format described. There is no need to check it explicitly.

### Output

Print at the console the **rotated matrix** as a sequence of text lines.

### Constraints

- The rotation **degrees** is positive integer in the range [0…90000], where **degrees** is **multiple of 90**.
- The number of matrix lines is in the range [1… **1 000**].
- The matrix lines are **strings** of length 1 … 1 000.
- Allowed working time: 0.2 seconds. Allowed memory: 16 MB.

### Examples

| Input | Output |  | Input | Output |  | Input | Output |
|-|-|-|-|-|-|-|-|
| Rotate(90)<br>hello<br>softuni<br>exam<br>END | esh<br>xoe<br>afl<br>mtl<br> uo<br> n <br> i |  | Rotate(180)<br>hello<br>softuni<br>exam<br>END | maxe<br>inutfos<br>  olleh |  | Rotate(270)<br>hello<br>softuni<br>exam<br>END | i <br> n <br>ou <br>ltm<br>lfa<br>eox<br>hse |
| Rotate(720)<br>js<br>exam<br>END | js<br>exam |  | Rotate(810)<br>js<br>exam<br>END | ej<br>xs<br>a<br>m |  | Rotate(0)<br>js<br>exam<br>END | js<br>exam |

## 7. Crossfire

You will receive **two integers** which represent the **dimensions** of a **matrix** . Then, you must **fill th matrix** with **increasing integers** starting from 1, and continuing on every row, like this:
first row: 1, 2, 3, …, n
second row: n + 1, n + 2, n + 3, …, n + n
third row: 2 \* n + 1, 2 \* n + 2, …, 2 \* n + n

You will also receive several commands in the form of **3 integers** separated by a space. Those 3 integers will represent a **row** in the matrix, a **column** and a **radius**. You must then **destroy** the cells which correspond to those arguments **cross-like.**

**Destroying** a cell means that, **that cell** becomes completely **nonexistent** in the matrix.Destroying cells **cross-like** means that you form a **cross figure** with center point - equal to the cell with coordinates – the **given row** and **column**, and **lines** with length equal to the **given radius**. See the examples for more info.

The **input ends** when you receive the command &quot;Nuke it from orbit&quot;. When that happens, you must print what has remained from the initial matrix.

### Input

- On the first line you will receive the dimensions of the matrix. You must then fill the matrix according to those dimensions
- On the next several lines you will begin receiving 3 integers separated by a single **space** , which represent the row, col and radius. You must then destroy cells according to those coordinates
- When you receive the command &quot;**Nuke it from orbit**&quot; the input ends

### Output

- The output is simple. You must print what is left from the matrix
- Every row must be printed on a new line and every column of a row - separated by a space

### Constraints

- The dimensions of the matrix will be integers in the range [2, 100]
- The given rows and columns will be valid integers in the range [-231 + 1, 231 - 1]
- The radius will be in range [0, 231 - 1]
- Allowed time/memory: 250ms/16MB

### Examples

| Input | Output | Comment |
|-|-|-|
| 5 5<br>3 3 2<br>4 3 2<br>Nuke it from orbit | 1 2 3 4 5<br>6 7 8 10<br>11 12 13<br>16<br>21 | Initial matrix:<br>1  2  3  4  5<br>6  7  8  9  10<br>11 12 13 14 15<br>16 17 18 19 20<br>21 22 23 24 25<br>Result from first destruction:<br>1  2  3  4  5<br>6  7  8  10<br>11 12 13 15<br>16           <br>21 22 23 25<br>Result from second destruction:<br>1  2  3  4  5<br>6  7  8  10<br>11 12 13<br>16<br>21 |
| 5 5<br>4 4 4<br>Nuke it from orbit | 1 2 3 4<br>6 7 8 9<br>11 12 13 14<br>16 17 18 19 |  |

## 8. The Heigan Dance

At last, level 80. And what do level eighties do? Go raiding. This is where you are now – trying not to be wiped by the famous dance boss, Heigan the Unclean. The fight is pretty straightforward - dance around the Plague Clouds and Eruptions, and you&#39;ll be just fine.

Heigan&#39;s chamber is a 15-by-15 two-dimensional array. The player always starts at the **exact center.** For each turn, Heigan uses a spell that hits a certain cell and the neighboring **rows/columns**. For example, if he hits (1,1), he also hits (0,0, 0,1, 0,2, 1,0 … 2,2). If the player&#39;s current position is within the area of damage, the player tries to move. First, he tries to move **up** , if there&#39;s **damage/wall** , he tries to move **right** , then **down** , then **left**. If he **cannot move** in any direction, because **the cell is damaged** or there is **a wall** , the player **stays** in place and takes the damage.

**Plague cloud** does 3500 damage **when it hits** , and 3500 damage **the next turn**. Then it **expires. Eruption** does 6000 damage **when it hits.** If a spell hits a player that also has an active Plague Cloud from the previous turn, the **cloud** damage is applied **first**. **Both** Heigan and the player **may** die in the same turn. If Heigan is **dead** , the spell he **would** have casted is **ignored**.

The player always starts at **18500** hit points; Heigan starts at **3,000,000** hit points. **Each** turn, the player does damage to Heigan. The fight is over either when the player is **killed** , or Heigan is **defeated**.

### Input

- On the first line you receive a floating-point number **D –** the damage done to Heigan each turn
- On the next several lines – you receive input in format **{spell} {row} {col}** – **{spell}** is either **Cloud** or **Eruption**

### Output

- On the first line
  - If Heigan is defeated: &quot;**Heigan: Defeated!**&quot;
  - Else: &quot;**Heigan: {remaining** }&quot;, where remaining is rounded to two digits after the decimal separator
- On the second line:
  - If the player is killed: &quot;**Player: Killed by {spell}**&quot;
  - Else &quot;**Player: {remaining}&quot;**
- On the third line: &quot;**Final position: {row, col}**&quot; -\&gt; the last coordinates of the player

### Constraints

- **D** is a floating-point number in range [0 … 500000]
- A damaging spell will always affect at least one cell
- Allowed memory: 16 MB
- Allowed working time: 0.25s

### Examples

| Input | Output |
|-|-|
| 10000<br>Cloud 7 7<br>Eruption 6 7<br>Eruption 8 7<br>Eruption 8 7 | Heigan: 2960000.00<br>Player: Killed by Eruption<br>Final position: 8, 7 |
| 500000<br>Cloud 7 6<br>Eruption 7 8<br>Eruption 7 7<br>Cloud 7 8<br>Eruption 7 9<br>Eruption 6 14<br>Eruption 7 11 | Heigan: Defeated!<br>Player: 12500<br>Final position: 7, 11 |
| 12500.66<br>Cloud 7 7<br>Cloud 7 7<br>Cloud 7 7<br>Cloud 7 7 | Heigan: 2949997.36<br>Player: Killed by Plague Cloud<br>Final position: 7, 7 |

## 9. \*Parking System

The parking lot in front of SoftUni is one of the busiest in the country, and it&#39;s a common cause for conflicts between the doorkeeper Bai Tzetzo and the students. The SoftUni team wants to proactively resolve all conflicts, so an automated parking system should be implemented. They are organizing a competition – Parkoniada – and the author of the best parking system will win a romantic dinner with RoYaL. That&#39;s **exactly** what you&#39;ve been dreaming of, so you decide to join in.

The parking lot is a **rectangular** matrix where the **first** column is **always** free and all other cells are parking spots. A car can enter from **any cell** of the **first column** and then decides to go to a specific spot. If that spot is **not** free, the car searches for the **closest** free spot on the **same** row. If **all** the cells on that specific row are used, the car cannot park and leaves. If **two** free cells are located at the **same** distance from the **initial** parking spot, the cell which is **closer** to the entrance is preferred. A car can **pass** through a used parking spot.

Your task is to calculate the distance travelled by each car to its parking spot.

Example: A car enters the parking at row 1. It wants to go to cell 2, 2 so it moves through **exactly four** cells to reach its parking spot.
| 0 | 0 | 0 | 0 |
|:-:|:-:|:-:|:-:|
| 1 | 0 | 0 | 0 |
| 1 | 1 | 1 | 0 |
| 0 | 0 | 0 | 0 |

### Input

- On the first line of input, you are given the integers **R** and **C** , defining the dimensions of the parking lot
- On the next several lines, you are given the integers **Z, X, Y** where **Z** is the entry row and **X, Y** are the coordinates of the desired parking spot
- The input stops with the command &#39;**stop**&#39;. All integers are separated by a **single** space

### Output

- For each car, print the distance travelled to the desired spot or the first free spot
- If a car cannot park on its desired row, print the message &#39;**Row {row number} full**&#39;

### Constraints

- 2 ≤ R,C ≤ 10000
- Z, X, Y are inside the dimensions of the matrix. Y is never on the first column
- There are no more than 1000 input lines
- Allowed time/space: 0.1s (C#) /16MB

### Examples

| Input | Output |
|-|-|
| 4 4<br>1 2 2<br>2 2 2<br>2 2 2<br>3 2 2<br>stop | 4<br>2<br>4<br>Row 2 full |

## 10. \*Radioactive Mutant Vampire Bunnies

Browsing through GitHub, you come across an old JS Basics teamwork game. It is about very nasty bunnies that multiply extremely fast. There&#39;s also a player that has to escape from their lair. You really like the game so you decide to port it to Java because that&#39;s your language of choice. The last thing that is left is the algorithm that decides if the player will escape the lair or not.

First, you will receive a line holding integers **N** and **M** , which represent the rows and columns in the lair. Then you receive **N** strings that can **only** consist of **&quot;.&quot;** , **&quot;B&quot;** , **&quot;P&quot;**. The **bunnies** are marked with &quot;**B&quot;,** the **player** is marked with &quot;**P**&quot;, and **everything** else is free space, marked with a dot **&quot;.&quot;**. They represent the initial state of the lair. There will be **only** one player. Then you will receive a string with **commands** such as **LLRRUUDD** – where each letter represents the next **move** of the player (Left, Right, Up, Down).

**After** each step of the player, each of the bunnies spread to the up, down, left and right (neighboring cells marked as &quot;.&quot; **changes** their value to B). If the player **moves** to a bunny cell or a bunny **reaches** the player, the player has died. If the player goes **out** of the lair **without** encountering a bunny, the player has won.

When the player **dies** or **wins** , the game ends. All the activities for **this** turn continue (e.g. all the bunnies spread normally), but there are no more turns. There will be **no** stalemates where the moves of the player end before he dies or escapes.

Finally, print the final state of the lair with every row on a separate line. On the last line, print either **&quot;dead: {row} {col}&quot;** or **&quot;won: {row} {col}&quot;**. Row and col are the coordinates of the cell where the player has died or the last cell he has been in before escaping the lair.

### Input

- On the first line of input, the numbers **N** and **M** are received – the number of **rows** and **columns** in the lair
- On the next N lines, each row is received in the form of a string. The string will contain only &quot;.&quot;, &quot;B&quot;, &quot;P&quot;. All strings will be the same length. There will be only one &quot;P&quot; for all the input
- On the last line, the directions are received in the form of a string, containing &quot;R&quot;, &quot;L&quot;, &quot;U&quot;, &quot;D&quot;

### Output

- On the first N lines, print the final state of the bunny lair
- On the last line, print the outcome – &quot;won:&quot; or &quot;dead:&quot; + {row} {col}

### Constraints

- The dimensions of the lair are in range [3…20]
- The directions string length is in range [1…20]

### Examples

| Input | Output |
|-|-|
| 5 8<br>.......B<br>...B....<br>....B..B<br>........<br>..P.....<br>ULLL | BBBBBBBB<br>BBBBBBBB<br>BBBBBBBB<br>.BBBBBBB<br>..BBBBBB<br>won: 3 0 |
| 4 5<br>.....<br>.....<br>.B...<br>...P.<br>LLLLLLLL | .B...<br>BBB..<br>BBBB.<br>BBB..<br>dead: 3 1 |

## 11. Reverse Matrix Diagonals

You are given a matrix (2D array) of integers. You have to print the matrix diagonal but in reversed order. Print each diagonal on new line.

### Input

On the first line, single integer the number **R** of rows in the matrix. On each of the next **R** lines, **C** numbers separated by single spaces. Note that **R** and **C** may have different values.

### Output

The output should consist of R lines, each consisting of exactly C characters, separated by spaces, representing the matrix diagonals reversed.

### Constraints

All the integers will be in the range **[1….1000]**

### Examples

| Input | Output |
|-|-|
| 3 4<br>21 20 18 15<br>19 17 14 12<br>16 13 11 10 | 10<br>11 12<br>13 14 15<br>16 17 18<br>19 20<br>21 |
| 1 3<br>3 2 1 | 1<br>2<br>3 |
| 3 3<br>18 17 15<br>16 14 12<br>13 11 10 | 10<br>11 12<br>13 14 15<br>16 17<br>18 |

## 12. \*\*\*the Matrix

You are given a matrix (2D array) of lowercase alphanumeric characters ( **a-z** , **0-9** ), a starting position – defined by a start row **startRow** and a start column **startCol** – and a filling symbol **fillChar**. Let&#39;s call the symbol originally at **startRow** and **startCol** the **startChar**. Write a program, which, starting from the symbol at **startRow** and **startCol** , changes to **fillChar** every symbol in the matrix which:

- is equal to **startChar** AND
- can be reached from **startChar** by going up ( **row – 1** ), down ( **row + 1** ), left ( **col – 1** ) and right ( **col + 1** ) and &quot;stepping&quot; ONLY on symbols equal **startChar**

So, you basically start from **startRow** and **startCol** and can move either by changing the row OR column (not both at once, i.e. you can&#39;t go diagonally) by **1** , and can only go to positions which have the **startChar** written on them. Once you find all those positions, you change them to **fillChar**.

In other words, you need to implement something like the Fill tool in MS Paint, but for a 2D char array instead of a bitmap.

### Input

On the first line, two integers will be entered – the number **R** of rows and number **C** of columns.

On each of the next **R** lines, **C** characters separated by single spaces will be entered – the symbols of the **R** th row of the matrix, starting from the **0** th column and ending at the **C-1** column.

On the next line, a single character – the **fillChar** – will be entered.

On the last line, two integers – **startRow** and **startCol** – separated by a single space, will be entered.

### Output

The output should consist of R lines, each consisting of exactly C characters, **NOT SEPARATED** by spaces, representing the matrix after the fill operation has been finished.

### Constraints

**0 < R, C < 20**
**0 <= startRow < R**
**0 <= startCol < C**

All symbols in the input matrix will be lowercase alphanumerics ( **a-z** , **0-9** ). The **fillChar** will also be alphanumeric and lowercase.
The total running time of your program should be no more than **0.1s**
The total memory allowed for use by your program is **5MB**

### Examples

| Input | Output |
|-|-|
| 5 3<br>a a a<br>a a a<br>a b a<br>a b a<br>a b a<br>x<br>0 0 | xxx<br>xxx<br>xbx<br>xbx<br>xbx |
| 5 3<br>a a a<br>a a a<br>a b a<br>a b a<br>a b a<br>x<br>2 1 | aaa<br>aaa<br>axa<br>axa<br>axa |
| 5 6<br>o o 1 1 o o<br>o 1 o o 1 o<br>1 o o o o 1<br>o 1 o o 1 o<br>o o 1 1 o o<br>3<br>2 1 | oo11oo<br>o1331o<br>133331<br>o1331o<br>oo11oo |
| 5 6<br>o o o o o o<br>o o o 1 o o<br>o o 1 o 1 1<br>o 1 1 w 1 o<br>1 o o o o o<br>z<br>4 1 | oooooo<br>ooo1oo<br>oo1o11<br>o11w1z<br>1zzzzz |
| 5 6<br>o 1 o o 1 o<br>o 1 o o 1 o<br>o 1 1 1 1 o<br>o 1 o w 1 o<br>o o o o o o<br>z<br>4 0 | z1oo1z<br>z1oo1z<br>z1111z<br>z1zw1z<br>zzzzzz |

**Hints**

For some of the tests you can solve the problem with naive approach, however complete solution can be obtained by using **Stack** , **Queue** , **DFS** or **BFS** – go search on the internet.
