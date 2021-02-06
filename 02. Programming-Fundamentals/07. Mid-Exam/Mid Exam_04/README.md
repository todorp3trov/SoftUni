# Problem 1. National Court

_Every day thousands of people pass by the reception at &quot;__National Court__&quot; with various questions to ask and the employees have to help everyone by providing correct information and to answer all questions._

There are **3 employees** working on the reception all day long. Each of them can handle different number of **people per hour**. Your task is to calculate **how much time** it will take **to answer all the questions** of a given number **of people**.

First you will receive 3 lines with integers, representing the **count of people** that each of the **employee can**  **help per**  **hour.** On the next line you will receive the **total people count** as a single integer.

Every **fourth hour** all the employees **have a one-hour break** before they start working again. This is the only break they get because they don't need rest and have no personal life. Calculate the time needed to answer all people`s questions and print it in the following format: **&quot;Time needed: {time}h.&quot;**

### Input / Constraints

- On first three lines - **each employee`s efficiency** - an integer in the range **[1 - 100]**
- On the fourth line - **people count** – an integer in the range **[0 – 10000]**
- Input will always be valid and in the range specified

### Output

- Print a single line: **&quot;Time needed: {time}h.&quot;**
- Allowed working **time** / **memory** : **100ms** / **16MB**

### Examples

| Input | Output | Comment |
|-|-|-|
| 5<br>6<br>4<br>20 | Time needed: 2h. | All employees can answer 15 people per hour. <br>After the first hour there are 5 people left to be answered.<br>All people will be answered in the second hour. |
| 1<br>2<br>3<br>45 | Time needed: 10h. | All employess can answer 6 people per hour. In the first 3 hours they have answered <br>6 * 3 = 18 people. Then they have a break for an hour.<br>After the next 3 hours there are <br>18 + 6 * 3 = 36 answered people. <br>After the break for an hour, there are only 9 people to answer.<br>So in the 10th hour all of the people questions would be answered. |
| 3<br>2<br>5<br>40 | Time needed: 5h. |  |

# Problem 2. Shopping List

_It&#39;s the end of the week and it is time for you to go shopping, so you need to create a shopping list first._

### Input

You will receive an **initial list** with groceries separated by **&quot;!&quot;**.

After that you will be receiving **4 types** of commands, until you receive **&quot;Go Shopping!&quot;**

- **Urgent {item} - add** the item at the **start** of the list. If the item **already exists,** skip this command.
- **Unnecessary {item} - remove** the item with the given name, only **if it exists** in the list. Otherwise skip this command.
- **Correct {oldItem} {newItem} –** if the item with the given **old name** exists, **change** its name with the **new** one. If it **doesn&#39;t exist** , skip this command.
- **Rearrange {item} -** if the grocery exists in the list, **remove** it from its **current position** and **add** it at the **end** of the list.

### Constraints

- There won`t be any duplicate items in the initial list

### Output

Print the **list** with all the groceries, joined by **&quot;, &quot;.**

- **&quot;{firstGrocery}, {secondGrocery}, …{nthGrocery}&quot;**

### Examples

| Input | Output |
|-|-|
| Tomatoes!Potatoes!Bread<br>Unnecessary Milk<br>Urgent Tomatoes<br>Go Shopping! | Tomatoes, Potatoes, Bread |
| Milk!Pepper!Salt!Water!Banana<br>Urgent Salt<br>Unnecessary Grapes <br>Correct Pepper Onion<br>Rearrange Grapes<br>Correct Tomatoes Potatoes<br>Go Shopping! | Milk, Onion, Salt, Water, Banana |

# Problem 3. Heart Delivery

_Valentine&#39;s Day is coming, and Cupid has very limited time to spread some love across the neighborhood. Help him with his mission!_

You will receive a **string** with **even integers** , separated by a &quot;**@**&quot;. This is our neighborhood. After that a series of **Jump** commands will follow, until you receive **&quot;Love!&quot;** Every house in the neighborhood needs a certain number of **hearts** delivered by Cupid, in order to be able to celebrate Valentine&#39;s Day. Those needed hearts are indicated by the integers in the neighborhood.

Cupid starts at the position of the **first house** (index 0) and must jump by a**given length. **The jump commands will be in this format:**&quot;Jump {length}&quot;**.

Every time he jumps from one house to another, the needed hearts for the visited house are **decreased by 2**. If the needed hearts for a certain house become **equal to 0** , print on the console **&quot;Place {houseIndex} has Valentine&#39;s day.&quot;** If **Cupid** jumps to a house where the needed hearts are **already 0**, print on the console&quot;**Place {houseIndex} already had Valentine&#39;s day.**&quot;.

Keep in mind that **Cupid** can have a **bigger jump length** than the **size of the neighborhood** and if he does jump **outside** of it, he should **start** from the **first house** again **.**

_For example, we are given this neighborhood: 6@6@6. Cupid is at the start and jumps with a length of 2. He will end up at index 2 and decrease the needed hearts there by 2: [6, 6, 4]. Next he jumps again with a length of 2 and goes outside the neighborhood, so he goes back to the first house (index 0) and again decreases the needed hearts there: [4, 6, 4]._

### Input

- On the first line you will receive a **string** with **even integers** separated by **&quot;@&quot;** –the neighborhood and the number of hearts for each house.
- On the next lines, until &quot; **Love!**&quot; is received, you will be getting jump commands in this format: &quot; **Jump {length}**&quot;.

### Output

At the end print **Cupid&#39;s last position** and whether his mission was successful or not:

- &quot; **Cupid&#39;s last position was {lastPositionIndex}.**&quot;
- If **each house** has had a Valentine&#39;s day, print:
  - &quot; **Mission was successful.**&quot;
- If **not,** print the **count** of all houses that **didn`t** celebrate a Valentine&#39;s Day:
  - **&quot;Cupid has failed {houseCount} places.&quot;**

### Constraints

- The **neighborhood`s** size will be in the range [1…20]

- Each **house** will need an **even number** of hearts in the range [2 … 10]
- Each **jump length** will be an integer in the range [1 … 20]

### Examples

| Input | Output | Comment |
|-|-|-|
| 10@10@10@2<br>Jump 1<br>Jump 2<br>Love! | Place 3 has Valentine's day.<br>Cupid's last position was 3.<br>Cupid has failed 3 places. | Jump 1 ->> [10, 8, 10, 2]<br><br>Jump 2 ->> [10, 8, 10, 0] so we print <br>"Place 3 has Valentine's day."<br><br>Next command is "Love!", so we print <br>Cupid`s last position and the outcome of <br>his mission. |
| 2@4@2<br>Jump 2<br>Jump 2<br>Jump 8<br>Jump 3<br>Jump 1<br>Love! | Place 2 has Valentine's day.<br>Place 0 has Valentine's day.<br>Place 0 already had Valentine's day.<br>Place 0 already had Valentine's day.<br>Cupid's last position was 1.<br>Cupid has failed 1 places. |  |
