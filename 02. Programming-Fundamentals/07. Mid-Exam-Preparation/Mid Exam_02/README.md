# Problem 1. SoftUni Reception

Every day thousands of students pass by the reception at SoftUni with different questions to ask and the employees have to help everyone by providing all the information and to answer all of the questions.

There are **3 employees** working on the reception all day. Each of them can handle **different number of students per hour**. Your task is to **calculate how much time** it will take to **answer all the questions** of given number of students.

First you will receive 3 lines with integers, representing **count of students that each of the employee can**  **help per**  **hour.** On the next line you will receive **students count as a single integer**.

**Every forth**  **hour all of the employees have a break, so they don&#39;t work**  **for a**  **hour.** This is the only break for the employees, because they don`t need rest, nor have a personal life. Calculate the time needed to answer all the student&#39;s questions and print it in the following format: **&quot;Time needed: {time}h.&quot;**

## Input / Constraints

- On first three lines - **each employee efficiency** - integer in range **[1 - 100]**
- On the fourth line - **students count** – integer in range **[0 – 10000]**
- Input will always be valid and in the range specified

## Output

- Print a single line: **&quot;Time needed: {time}h.&quot;**
- Allowed working **time** / **memory** : **100ms** / **16MB**

## Examples

| Input | Output | Comment |
|-|-|-|
| 5<br>6<br>4<br>20 | Time needed: 2h. | All employees can answer 15 students per hour. After the first hour there are 5 students left to be answered.<br>All students will be answered in the second hour. |
| 1<br>2<br>3<br>45 | Time needed: 10h. | All employess can answer 6 students per hour. In the first 3 hours they have answered 6 * 3 = 18 students. Then they have a break for an hour.<br>After the next 3 hours there are <br>18 + 6 * 3 = 36 answered students. <br>After the break for an hour, there are only 9 students to answer.<br>So in the 10th hour all of the student's questions would be answered. |
| 3<br>2<br>5<br>40 | Time needed: 5h. |  |

# Problem 2. Array Modifier

You are given **an array with integers**. Write a program to **modify the elements** after **receive the commands**: &quot;**swap**&quot;, &quot;**multiply**&quot; or &quot;**decrease**&quot;.

- &quot;**swap {index1} {index2}**&quot; take **two elements** and **swap their places**.
- &quot;**multiply {index1} {index2}**&quot; take **element at the 1st index** and **multiply it with element at 2nd index. Save the product at the 1st index.**
- &quot;**decrease**&quot; **decreases all elements** in the array **with1**.

## Input

On the **first input line** you will be given **the initial array values** separated by a single space.

On the **next lines** you will receive commands **until** you receive the **command &quot;end&quot;**. The **commands are** as follow:

- &quot;**swap {index1} {index2}**&quot;
- &quot;**multiply {index1} {index2}**&quot;
- &quot;**decrease**&quot;

## Output

**The output** should be printed on the console and consist **element of the modified array – separated by &quot;, &quot;** ( **comma and single space** ).

## Constraints

- Commands will be: &quot;**swap**&quot;, &quot;**multiply**&quot;, &quot;**decrease**&quot; and &quot; **end**&quot;
- **Elements of the array** will be **integer numbers** in the range **[-2****31 ****...2**** 31****]**
- **Count of the array elements** will be in the range **[2...100]**
- **Indexes will be always in the range of the array**

## Examples

| Input | Output | Comment |
|-|-|-|
| 23 -2 321 87 42 90 -123<br>swap 1 3<br>swap 3 6<br>swap 1 0<br>multiply 1 2<br>multiply 2 1<br>decrease<br>end | 86, 7382, 2369942, -124, 41, 89, -3 | 23 -2 321 87 42 90 -123 – initial values<br>swap 1(-2) and 3(87) ▼<br>23 87 321 -2 42 90 -123<br>swap 3(-2) and 6(-123) ▼<br>23 87 321 -123 42 90 -2<br>swap 1(87) and 0(23) ▼<br>87 23 321 -123 42 90 -2<br>multiply 1(23) 2(321) = 7383 ▼<br>87 7383 321 -123 42 290 -2<br>multiply 2(321) 1(7383) = 2369943 ▼<br>87 7383 2369943 -123 42 90 -2<br>decrease – all - 1 ▼<br>86 7383 2369942 -124 41 89 -3 |
| 1 2 3 4<br>swap 0 1<br>swap 1 2<br>swap 2 3<br>multiply 1 2<br>decrease<br>end | 1, 11, 3, 0 |  |

# Problem 3. Numbers

Write a program to **read a sequence of integers** and find and print the **top 5** numbers that are **greater than the average** value in the sequence, sorted in descending order.

## Input

Read from the console a single line holding space separated number.

## Output

Print the above described numbers on a single line, space separated. If **less than 5 numbers** hold the above mentioned property, print less than 5 numbers. Print &quot; **No**&quot; if no numbers hold the above property.

## Constraints

All input numbers are integers in range [-1 000 000 … 1 000 000]. 
The count of numbers is in range [1…10 000].

## Examples

| Input | Output | Comment |
|-|-|-|
| 10 20 30 40 50 | 50 40 | Average number = 30.<br>Numbers greater than 30 are: {40, 50}. <br>The top 5 numbers among them in descending order are: {50, 40}.<br>Note that we have only 2 numbers, so all of them are included in the top 5. |
| 5 2 3 4 -10 30 40 50 20 50 60 60 51 | 60 60 51 50 50 | Average number = 28.08.<br>Numbers greater than 20.078 are:<br>{30, 40, 50, 50, 60, 60, 51}.<br>The top 5 numbers among them in descending order are: {60, 60, 51, 50, 50}. |
| 1 | No | Average number = 1.<br>There are no numbers, greater than 1. |
| -1 -2 -3 -4 -5 -6 | -1 -2 -3 | Average number = -3.5.<br>Numbers greater than -3.5 are: {-1, -2, -3}.<br>The top 5 numbers among them in descending order are: {-1, -2, -3}. |
