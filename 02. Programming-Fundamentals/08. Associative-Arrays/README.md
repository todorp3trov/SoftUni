# Exercise: Associative Arrays, Lambda and Stream API

Problems for exercises and homework for the [&quot;Programming Fundamentals&quot; course @ SoftUni](https://softuni.bg/courses/programming-fundamentals).

You can check your solutions in [Judge.](https://judge.softuni.bg/Contests/1312)

## 1. Count Chars in a String

Write a program, which **counts all characters** in a string **except space (&#39; &#39;)**.

**Print all occurrences in the following format:**

**{char} -> {occurrences}**

### Examples

| Input          | Output                     |
|----------------|----------------------------|
| text           | t -> 2<br>e -> 1<br>x -> 1 |
| text text text | t -> 6<br>e -> 3<br>x -> 3 |

## 2. A Miner Task

Until you receive **&quot;stop&quot;** command, you will be given a sequence of strings, each on a new line. Every **odd** line on the console is representing a **resource** (e.g. Gold, Silver, Copper, etc.) and every **even** - **quantity**. Your task is to collect the resources and print them each on a new line.

**Print the resources and their quantities in format:**  **{resource} –> {quantity}**

The quantities inputs will be in the range **[1 … 2 000 000 000]**

### Examples

| Input | Output |  | Input | Output |
|-|-|-|-|-|
| Gold<br>155<br>Silver<br>10<br>Copper<br>17<br>stop | Gold -> 155<br>Silver -> 10<br>Copper -> 17 |  | gold<br>155<br>silver<br>10<br>copper<br>17<br>gold<br>15<br>stop | gold -> 170<br>silver -> 10<br>copper -> 17 |

## 3. Legendary Farming

_You&#39;ve beaten all the content and the last thing left to accomplish is own a legendary item. However, it&#39;s a tedious process and requires quite a bit of farming._

Anyway, you are not too pretentious - any legendary will do. The possible items are:

- **Shadowmourne** - requires **250 Shards**
- **Valanyr** - requires **250 Fragments**
- **Dragonwrath** - requires **250 Motes**

**Shards, Fragments** and **Motes** are the **key materials** , all else is **junk.** You will be given lines of input, such as
**&quot;2 motes 3 ores 15 stones&quot;.** Keep track of the **key materials -** the **first** that reaches the **250 mark wins** the **race**. At that point, print the corresponding legendary obtained. Then, print the **remaining** shards, fragments, motes, ordered by **quantity** in **descending** order, then by **name** in **ascending** order, each on a new line. Finally, print the collected **junk** items, in **alphabetical** order.

### Input

- Each line of input is in format **{quantity} {material} {quantity} {material} … {quantity} {material}**

### Output

- On the first line, print the obtained item in format **{Legendary item} obtained!**
- On the next three lines, print the remaining key materials in descending order by quantity
  - If two key materials have the same quantity, print them in alphabetical order
- On the final several lines, print the junk items in alphabetical order
  - All materials are printed in format **{material}: {quantity}**
  - All output should be **lowercase** , except the first letter of the legendary

### Examples

| Input | Output |
|-|-|
| 3 Motes 5 stones 5 Shards<br>6 leathers 255 fragments 7 Shards | Valanyr obtained!<br>fragments: 5<br>shards: 5<br>motes: 3<br>leathers: 6<br>stones: 5 |
| 123 silver 6 shards 8 shards 5 motes<br>9 fangs 75 motes 103 MOTES 8 Shards<br>86 Motes 7 stones 19 silver | Dragonwrath obtained!<br>shards: 22<br>motes: 19<br>fragments: 0<br>fangs: 9<br>silver: 123 |

## 4. Orders

Write a program, which keeps information about **products** and their **prices**. Each product has a **name** , a **price** and its **quantity**. If the product **doesn&#39;t exist** yet, **add** it with its **starting quantity**.

If you receive a product, which **already exists, increase** its quantity by the input quantity and if its **price is different, replace** the price as well.

You will receive products&#39; **names** , **prices** and **quantities** on **new lines**.Until you receive the command &quot; **buy**&quot;, keep adding items. When you do receive the command &quot; **buy**&quot;, print the items with their **names** and **total price** of all the products with that name.

**Input**

- Until you receive &quot; **buy**&quot;, the products come in the format: &quot; **{name} {price} {quantity}**&quot;
- The product data is **always** delimited by a **single space**

**Output**

- Print information about **each product**, following the format:
&quot; **{productName} -> {totalPrice}**&quot;
- **Format** the average grade to the **2nd decimal place**

### Examples

| Input | Output |
|-|-|
| Beer 2.20 100<br>IceTea 1.50 50<br>NukaCola 3.30 80<br>Water 1.00 500<br>buy | Beer -> 220.00<br>IceTea -> 75.00<br>NukaCola -> 264.00<br>Water -> 500.00 |
| Beer 2.40 350<br>Water 1.25 200<br>IceTea 5.20 100<br>Beer 1.20 200<br>IceTea 0.50 120<br>buy | Beer -> 660.00<br>Water -> 250.00<br>IceTea -> 110.00 |
| CesarSalad 10.20 25<br>SuperEnergy 0.80 400<br>Beer 1.35 350<br>IceCream 1.50 25<br>buy | CesarSalad -> 255.00<br>SuperEnergy -> 320.00<br>Beer -> 472.50<br>IceCream -> 37.50 |

## 5. SoftUni Parking

_SoftUni just got a new_  **parking lot** __. It&#39;s so fancy, it even has online_ __**parking validation**__. Except, the online service doesn&#39;t work. It can only receive users&#39; data, but doesn&#39;t know what to do with it. Good thing you&#39;re on the dev team and know how to fix it, right?_

Write a program, which validates parking for an online service. Users can **register** to park and **unregister** to leave.

The program **receives 2 commands** :

- &quot; **register {username} {licensePlateNumber}**&quot;:
  - The system only supports **one car per user** at the moment, so if a user tries to register **another license plate** , using the **same username** , the system should print:
&quot; **ERROR: already registered with plate number {licensePlateNumber}**&quot;
  - If the aforementioned checks pass successfully, the plate can be registered, so the
system should print:
&quot; **{username} registered {licensePlateNumber} successfully**&quot;
- &quot; **unregister {username}**&quot;:
  - If the user is **not present** in the database, the system should print:
&quot; **ERROR: user {username} not found**&quot;
  - If the aforementioned check passes successfully, the system should print:
&quot; **{username} unregistered successfully**&quot;

After you execute all of the commands, **print** all the currently **registered users** and their **license plates** in the format:

- &quot; **{username} => {licensePlateNumber}**&quot;

### Input

- First line: **n** - **number of commands** - **integer**
- Next **n** lines: **commands** in one of **two** possible formats:
  - Register: &quot; **register {username} {licensePlateNumber}**&quot;
  - Unregister: &quot; **unregister {username}**&quot;

The input will **always** be **valid** and you **do not need** to check it explicitly.

### Examples

| Input | Output |
|-|-|
| 5<br>register John CS1234JS<br>register George JAVA123S<br>register Andy AB4142CD<br>register Jesica VR1223EE<br>unregister Andy | John registered CS1234JS successfully<br>George registered JAVA123S successfully<br>Andy registered AB4142CD successfully<br>Jesica registered VR1223EE successfully<br>Andy unregistered successfully<br>John => CS1234JS<br>George => JAVA123S<br>Jesica => VR1223EE |
| 4<br>register Jony AA4132BB<br>register Jony AA4132BB<br>register Linda AA9999BB<br>unregister Jony | Jony registered AA4132BB successfully<br>ERROR: already registered with plate number AA4132BB<br>Linda registered AA9999BB successfully<br>Jony unregistered successfully<br>Linda => AA9999BB |
| 6<br>register Jacob MM1111XX<br>register Anthony AB1111XX<br>unregister Jacob<br>register Joshua DD1111XX<br>unregister Lily<br>register Samantha AA9999BB | Jacob registered MM1111XX successfully<br>Anthony registered AB1111XX successfully<br>Jacob unregistered successfully<br>Joshua registered DD1111XX successfully<br>ERROR: user Lily not found<br>Samantha registered AA9999BB successfully<br>Anthony => AB1111XX<br>Joshua => DD1111XX<br>Samantha => AA9999BB |

## 6. Courses

Write a program, which keeps information about **courses**. Each course has a **name** and **registered students**.

You will receive **course name** and **student name**, until you receive the command &quot;**end**&quot;. **Check if such course already exists, and if not - add the course.** Register the user into the course. When you do receive the command &quot; **end**&quot;, print the courses with their **names** and **total registered users** , ordered by the count of registered users in **descending** order. For each contest print registered users ordered by name in **ascending** order.

**Input**

- Until you receive &quot; **end**&quot;, the input come in the format: &quot; **{courseName} : {studentName}**&quot;
- The product data is **always** delimited by &quot; : &quot;

**Output**

- Print information about **each course**, following the format:
**&quot;{courseName}: {registeredStudents}&quot;**
- Print information about each student, following the format:
**&quot;-- {studentName}&quot;**

### Examples

| Input | Output |
|-|-|
| Programming Fundamentals : John Smith<br>Programming Fundamentals : Linda Johnson<br>JS Core : Will Wilson<br>Java Advanced : Harrison White<br>end | Programming Fundamentals: 2<br>-- John Smith<br>-- Linda Johnson<br>JS Core: 1<br>-- Will Wilson<br>Java Advanced: 1<br>-- Harrison White |
| Algorithms : Jay Moore<br>Programming Basics : Martin Taylor<br>Python Fundamentals : John Anderson<br>Python Fundamentals : Andrew Robinson<br>Algorithms : Bob Jackson<br>Python Fundamentals : Clark Lewis<br>end | Python Fundamentals: 3<br>-- Andrew Robinson<br>-- Clark Lewis<br>-- John Anderson<br>Algorithms: 2<br>-- Bob Jackson<br>-- Jay Moore<br>Programming Basics: 1<br>-- Martin Taylor |

## 7. Student Academy

Write a program, which keeps information about **students** and **their grades**.

On the first line you will receive number **n**. After that you will receive **n pair of rows**. First you will receive the **student&#39;s name** , after that you will receive his **grade**. **Check if student already exists, and if not - add him**. Keep track of all grades for each student.

When you finish reading data, keep students with **average grade higher or equal to 4.50**. Order filtered students by **average grade in descending order**.

**Print the students and their average grade in format:**

**&quot;{name} –> {averageGrade}&quot;**

**Format** the average grade to the **2nd decimal place**.

### Examples

| Input | Output |  | Input | Output |
|-|-|-|-|-|
| 5<br>John<br>5.5<br>John<br>4.5<br>Alice<br>6<br>Alice<br>3<br>George<br>5 | John -> 5.00<br>George -> 5.00<br>Alice -> 4.50 |  | 5<br>Amanda<br>3.5<br>Amanda<br>4<br>Rob<br>5.5<br>Christian<br>5<br>Robert<br>6 | Robert -> 6.00<br>Rob -> 5.50<br>Christian -> 5.00 |

## 8. Company Users

Write a program which keeps information about companies and their employees.

You will receive **company name** and **employee&#39;s id**, until you receive the command &quot;**End**&quot;. Add each employee to the given company. Keep in mind that a company **cannot** have two employees with the same id.

When you finish reading data, **order the companies by the name in ascending order**.

Print the company name and each employee&#39;s id in the following format:

**{companyName}**

**-- {id1}**

**-- {id2}**

**-- {idN}**

**Input / Constraints**

- Until you receive &quot; **End**&quot;, the input come in the format: &quot; **{companyName} -> {employeeId}**&quot;
- The input **always** will be valid

### Examples

| Input | Output |  | Input | Output |
|-|-|-|-|-|
| SoftUni -> AA12345<br>SoftUni -> BB12345<br>Microsoft -> CC12345<br>HP -> BB12345<br>End | HP<br>-- BB12345<br>Microsoft<br>-- CC12345<br>SoftUni<br>-- AA12345<br>-- BB12345 |  | SoftUni -> AA12345<br>SoftUni -> CC12344<br>Lenovo -> XX23456<br>SoftUni -> AA12345<br>Movement -> DD11111<br>End | Lenovo<br>-- XX23456<br>Movement<br>-- DD11111<br>SoftUni<br>-- AA12345<br>-- CC12344 |

## 9. \*ForceBook

_The force users are struggling to remember which side are the different forceUsers from, because they switch them too often. So you are tasked to create a web application to manage their profiles._

You should store information for every **unique forceUser** , registered in the application.

You will receive **several input lines** in one of the following formats:

**{forceSide} | {forceUser}**

**{forceUser} -> {forceSide}**

The **forceUser and forceSide** are strings, containing **any** character.

If you receive **forceSide | forceUser** you should **check if such forceUser already exists** , and **if not** - **add** him/her to the corresponding side.

If you receive a **forceUser -> forceSide** you should check if there is such **forceUser** already and if so, **change his/her side**. If there is no such **forceUser** , add him/her to the corresponding **forceSide** , treating the command **as new registered forceUser.**
**Then you should print on the console: &quot;{forceUser} joins the {forceSide} side!&quot;**

You should end your program when you receive the command **&quot;Lumpawaroo&quot;**. At that point you should print each force side, **ordered descending by forceUsers count, than ordered by name**. For each side print the **forceUsers** , **ordered by name**.

In case there are **no forceUsers in a side** , you **shouldn&#39;t print** the side information.

### Input / Constraints

- The input comes in the form of commands in one of the formats specified above
- The input ends when you receive the command **&quot;Lumpawaroo&quot;**

### Output

- As output for each forceSide, **ordered descending by forceUsers count** , **then by name** , you must print all the forceUsers, **ordered by name alphabetically**
- The output format is:

**Side: {forceSide}, Members: {forceUsers.Count}**

**! {forceUser}**

**! {forceUser}**

**! {forceUser}**

- In case there are **NO forceUsers**, don&#39;t print this side

### Examples

| Input | Output | Comment |
|-|-|-|
| Light \| Gosho<br>Dark \| Pesho<br>Lumpawaroo | Side: Dark, Members: 1<br>! Pesho<br>Side: Light, Members: 1<br>! Gosho | We register Gosho in the Light side <br>and Pesho in the Dark side. After <br>receiving "Lumpawaroo", we print <br>both sides, ordered by <br>membersCount and then by name. |
| Lighter \| Royal<br>Darker \| DCay<br>Ivan Ivanov -> Lighter<br>DCay -> Lighter<br>Lumpawaroo | Ivan Ivanov joins the Lighter side!<br>DCay joins the Lighter side!<br>Side: Lighter, Members: 3<br>! DCay<br>! Ivan Ivanov<br>! Royal | Although Ivan Ivanov doesn't have <br>profile, we register him <br>and add him to the Lighter side.<br>We remove DCay from Darker side <br>and add him to Lighter side.<br>We print only Lighter side, because <br>Darker side has no members. |

## 10. \*SoftUni Exam Results

Judge statistics on the last Programing Fundamentals exam was not working correctly, so you have the task to take all the submissions and analyze them properly. You should collect all the submission and print the final results and statistics about each language that the participants submitted their solutions in.

You will be receiving lines in the following format: **&quot;{username}-{language}-{points}&quot;** until you receive **&quot;exam finished&quot;**.You should store each username and his submissions and points.
You can receive a **command to ban** a user for cheating in the following format: **&quot;{username}-banned&quot;.** In that case, you should **remove** the user from the contest, but **preserve his submissions in the total count of submissions for each language**.

After receiving **&quot;exam finished&quot;** , print each of the participants, ordered **descending** by their max points, then by username, in the following format:

**Results:**
**{username} | {points}**
…
 After that print each language, used in the exam, ordered **descending** by total submission count and then by language name, in the following format:

**Submissions:**
**{language} - {submissionsCount}**
…
### Input / Constraints

Until you receive **&quot;exam finished&quot;** , you will be receiving participant submissions in the following format: **&quot;{username}-{language}-{points}&quot;**

You can receive a ban command -> **&quot;{username}-banned&quot;**

The points of the participant will always be a **valid integer in the range [0-100]**

### Output

- Print the exam results for each participant, ordered descending by max points and then by username, in the following format:

**Results:**
**{username} | {points}**
…

- After that print each language, ordered descending by total submissions and then by language name, in the following format:

**Submissions:**
**{language} - {submissionsCount}**
…

- Allowed working **time** / **memory** : **100ms** / **16MB**

### Examples

| Input | Output | Comment |
|-|-|-|
| Pesho-Java-84<br>Gosho-C#-70<br>Gosho-C#-84<br>Kiro-C#-94<br>exam finished | Results:<br>Kiro \| 94<br>Gosho \| 84<br>Pesho \| 84<br>Submissions:<br>C# - 3<br>Java - 1 | We order the participant descending by max points and <br>then by name, printing only the username and the max <br>points.<br>After that we print each language along with the count of <br>submissions, ordered descending by submissions count, and <br>then by language name. |
| Pesho-Java-91<br>Gosho-C#-84<br>Kiro-Java-90<br>Kiro-C#-50<br>Kiro-banned<br>exam finished | Results:<br>Pesho \| 91<br>Gosho \| 84<br>Submissions:<br>C# - 2<br>Java - 2 | Kiro is banned so he is removed from the contest, but his <br>submissions are still preserved in the languages submissions <br>count. <br>So although there are only 2 participants in the results, <br>there are 4 submissions in total. |
