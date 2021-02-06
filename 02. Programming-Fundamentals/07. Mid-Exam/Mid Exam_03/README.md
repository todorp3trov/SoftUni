# **Problem 1. Bonus Scoring System**

Create a program that calculates **bonus points** for each **student** , for a certain **course**. On the first line, you are going to receive **the count of the students** for this course. **On the second line** , you will receive **the count of the lectures** in the course. Every course has **an additional bonus**. You are going to receive it **on the third line**. On the next lines, you will be receiving the **count of attendances for each student**.

The bonus is calculated with the following **formula** :

**{total bonus} = {student attendances} / {course lectures} \* (5 + {additional bonus})**

Find the student with the **maximum bonus** and print him/her, along with **his attendances** in the following format:

**&quot;Max Bonus: {maxBonusPoints}.&quot;**

**&quot;The student has attended {studentAttendances} lectures.&quot;**

Round the bonus points at the end to **the nearest bigger number**.

### Input / Constrains

- On the **first line** you are going to receive the count of the students – an integer number in the range [0…50]
- On the **second line** you are going to receive the count of the lectures – an integer number in the range [0...50].
- On the **third line** you are going to receive **the initial bonus** – an integer number in the range [0….100].
- **On the next lines** , you will be receiving the **attendances of each student**.
- There will **never** be **students with equal bonuses**.

### Output

- Print the maximum bonus points along with the attendances of the given student, **rounded** to the nearest **bigger** number, scored by a student in this course in the format described above.

### Examples

| Input | Output |
|-|-|
| 5<br>25<br>30<br>12<br>19<br>24<br>16<br>20 | Max Bonus: 34.<br>The student has attended 24 lectures. |
| **Comment** |  |
| First, we receive the number of students enrolled in the course – 5. The total count of the lectures is 25 and the initial <br>bonus is 30. Then we calculate the bonus of the student with 12 attendances, which is 16.8. We continue calculating <br>each of the student’s bonuses. The one with 24 attendances has the highest bonus – 33.6 (34 rounded), so we print <br>the appropriate message on the console. |  |
| 10<br>30<br>14<br>8<br>23<br>27<br>28<br>15<br>17<br>25<br>26<br>5<br>18 | Max Bonus: 18.<br>The student has attended 28 lectures. |

# Problem 2. Mu Online

You have **initial health 100 and initial bitcoins 0**. You will be given **a string, representing the dungeons rooms**. Each room is separated with **&#39;|&#39;** (vertical bar): **&quot;room1|room2|room3…&quot;**

Each room contains **a command** and a **number** , separated by space. The command can be:

- **&quot;potion&quot;**
  - You are healed with the number in the second part. But your health **cannot exceed** your **initial health (100)**.
  - First print: **&quot;You healed for {amount} hp.&quot;**.
  - After that, print your current health: **&quot;Current health: {health} hp.&quot;**.
- **&quot;chest&quot;**
  - You&#39;ve found some bitcoins, the number in the second part.
  - Print: **&quot;You found {amount} bitcoins.&quot;**
- In any other case you are facing a monster, you are going to fight. The second part of the room, contains the attack of the monster. You should remove the monster&#39;s attack from your health.
  - If you are not dead (health >= 0) you&#39;ve slain the monster, and you should print ( **&quot;You slayed {monster}.&quot;** )
  - If you&#39;ve died, print **&quot;You died! Killed by {monster}.&quot;** and your quest is over. Print the best room you`ve manage to reach: **&quot;Best room: {room}&quot;**.

If you managed to go through all the rooms in the dungeon, print on the next three lines:

**&quot;You&#39;ve made it!&quot;** , **&quot;Bitcoins: {bitcoins}&quot;** , **&quot;Health: {health}&quot;**.

### Input / Constraints

You receive a string, representing the dungeons rooms, separated with **&#39;|&#39;** (vertical bar): **&quot;room1|room2|room3…&quot;**.

### Output

Print the corresponding messages, described above.

### Examples

| Input | Output |
|-|-|
| rat 10\|bat 20\|potion 10\|rat 10\|chest 100\|boss 70\|chest 1000 | You slayed rat.<br>You slayed bat.<br>You healed for 10 hp.<br>Current health: 80 hp.<br>You slayed rat.<br>You found 100 bitcoins.<br>You died! Killed by boss.<br>Best room: 6 |
| cat 10\|potion 30\|orc 10\|chest 10\|snake 25\|chest 110 | You slayed cat.<br>You healed for 10 hp.<br>Current health: 100 hp.<br>You slayed orc.<br>You found 10 bitcoins.<br>You slayed snake.<br>You found 110 bitcoins.<br>You've made it!<br>Bitcoins: 120<br>Health: 65 |

# Problem 3. Inventory

_As a young traveler, you gather items and craft new items._

### Input / Constraints

You will receive a journal with some Collecting items, separated with **&#39;, &#39;** (comma and space). After that, until receiving **&quot;Craft!&quot;** you will be receiving different commands.

Commands (split by **&quot; - &quot;** ):

- **&quot;Collect - {item}&quot;** – Receiving this command, you should add the given item in your inventory. If the item already **exists** , you should **skip** this line.
- **&quot;Drop - {item}&quot;** – You should remove the item from your inventory, **if it exists**.
- **&quot;Combine Items - {oldItem}:{newItem}&quot;** – You should check if the **old item exists** , if so, **add** the new item **after** the **old one**. Otherwise, **ignore** the command.
- **&quot;Renew – {item}&quot;** – If the given item exists, you should change its position and **put it last** in your inventory.

### Output

After receiving **&quot;Craft!&quot;** print the items in your inventory, separated by **&quot;, &quot;** (comma and space).

### Examples

| Input                                                                               | Output            |
|-------------------------------------------------------------------------------------|-------------------|
| Iron, Wood, Sword<br>Collect - Gold<br>Drop - Wood<br>Craft!                        | Iron, Sword, Gold |
| Iron, Sword<br>Drop - Bronze<br>Combine Items - Sword:Bow<br>Renew - Iron<br>Craft! | Sword, Bow, Iron  |
