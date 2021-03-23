# 1. Flower Wreaths

_You want to go on a flowers wreath competition but to participate you have to make at least 5 flower wreaths._

You will be given **two sequences of integers, representing roses and lilies**. You need to start making wreaths **knowing that one wreath needs 15 flowers**. Your goal is to make **at least 5 flower wreaths**.

You will start crafting from the **last lilies** and the **first roses**. If the **sum** of their values is **equal** to **15** – **create one wreath** and **remove** them. If the sum is **bigger than 15** , just **decrease** the value of the **lilies by 2.** If the sum is **less than 15 you have to store them for later and remove them**. You need to **stop** combining when you have **no more roses or lilies**. In the end, if you have **any stored flowers you should make as many wreaths as you can with them**.

### Input

- On the **first line** , you will receive the integers representing the **lilies** , **separated** by **&quot;, &quot;**.
- On the **second line** , you will receive the integers representing the **roses** , **separated** by &quot; **,**&quot;.

### Output

- Print whether you have succeeded making **at least 5 wreaths** :
  - **&quot;You made it, you are going to the competition with {count of wreaths} wreaths!&quot;**
  - **&quot;You didn&#39;t make it, you need {wreaths needed} wreaths more!&quot;**

### Constraints

- All of the given numbers will be valid integers in the range **[0, 120]**.
- Don&#39;t have situation with negative number.

### Examples

| Input | Output |
|-|-|
| 10, 15, 2, 7, 9, 13<br>2, 10, 8, 12, 0, 5 | You made it, you are going to the competition with 5 wreaths! |
| Comment | We start with the last lilies (13) and the first roses <br>(2) -> 13 + 2 = 15 -> 15 = 15 <br>So we create one wreath and remove them bouth. <br>Next we have 9 + 10 = 19 -> 19 > 15 so we decrease the <br>lilies by 2 -> 7 + 10 = 17 <br>and we decrease the liles by 2 -> 5 + 10 = 15 and we <br>create one more wreath and remove them.<br>Next, we have 7 + 8 = 15. We create one more wreaht <br>and remove them.<br>Next, we have  2 + 12 = 14 -> 14 < 15 so we have to store <br>theire sum for later and remove theme.<br>Next, we have 15 + 0 = 15 so we create one more wreath.<br>And last we have 10 + 5 = 15, we create one more wreath <br>and stop mixing because we don’t have any flowers left.<br>Now we have a tottal of 5 wreaths and we also have 14 <br>flowers left but we cant create wreath because 14 < 15. |
| Input | Output |
| 10, 5, 3, 7, 8<br>5, 10, 8, 7, 6 | You didn't make, you need 1 wreaths more! |
| Comment | We start with 8 + 5 = 13 -> 13 < 15 -> we have to store their <br>sum for later and remove them.<br>Next, we have 7 + 10 = 17 -> we decrease the lilies by <br>2 -> 5 + 10 = 15 -> 15 = 15 and we create one wreath.<br>Next, we have 3 + 8 = 11 -> 11 < 15 -> we store their <br>sum for later and remove them.<br>Next, we have 5 +7 = 12 -> we store their sum for later <br>and remove them.<br>Next, we have 10 + 6 = 16 -> 16 > 15 we decrease the lilies by <br>2 -> 8 + 6 = 14 and we store their sum for later and remove them.<br>We stop crafting because we don’t have any flowers left and we <br>have 1 wreath and 50 stored flowers. We create 3 more wreaths <br>because 3 * 15 = 45 -> 50 – 45 = 5 -> 5 < 15. |

# 2. Bee

You will be given an integer **n** for the **size** of the bee territory with **square** shape. On the next **n** lines, you will receive the **rows** of the territory. The bee will be placed on a **random position** , marked with the letter &#39;**B**&#39;. On random positions there will be flowers, marked with **&#39;f&#39;**. There may also be а **bonus** on the territory. There will always be only one bonus. It will be **marked** with the **letter** - &#39;**O**&#39;. **All of the empty positions** will be marked with **&#39;.&#39;**.

Each turn, you will be given **command** for the **bee&#39;s movement**.

The commands will be: &quot;**up**&quot;, &quot;**down**&quot;, &quot;**left**&quot;, &quot; **right**&quot;, &quot;**End**&quot;.

If the bee **moves** to a **flower** , it pollinates the flower and increase pollinated flowers with one.

If it goes to a **bonus** , the bee gets a bonus one move forward and then the bonus **disappears**. If the bee **goes out** she can&#39;t return back and the program ends. If the bee receive &quot;**End**&quot; command the program ends. The bee needs **at least 5 pollinated flowers**.

### Input

- On the first line, you are given the integer **n** – the size of the **square** matrix.
- The **next n lines** holds the values for every **row**.
- On each of the next lines until you receive &quot;**End**&quot; command, you will receive a move command.

### Output

- On the first line:
  - If the bee goes out of its territory print: **&quot;The bee got lost!&quot;**
- On the second line:
  - If the bee couldn&#39;t pollinated enough flowers print: **&quot;The bee couldn&#39;t pollinate the flowers, she needed {needed} flowers more&quot;**
  - If the bee successfully pollinated enough flowers print: **&quot;Great job, the bee manage to pollinate {polinationed flowers} flowers!&quot;**
- In the end print the matrix.

### Constraints

- The size of the **square** matrix will be between **[2…10].**
- There will **always** be **0** or **1** bonus, marked with - &#39;**O**&#39;.
- The bee position will be marked with &#39;**B**&#39;.
- There won&#39;t be a case where a bonus moves the bee out of its territory.

### Examples

| Input | Output |
|-|-|
| 5<br>Bff..<br>..O..<br>f.f.f<br>.....<br>fffff<br>right<br>right<br>down<br>left<br>left<br>down<br>down<br>right<br>down | The bee got lost!<br>Great job, the bee manage to pollinate 6 flowers!<br>.....<br>.....<br>....f<br>.....<br>..fff |
| Comment | 1) right     2) right     3) down     5) left<br>   .Bf..           ..B..           .....           .....<br>   ..O..        ..O..        .....       .....<br>   f.f.f        f.f.f        f.B.f       fB..f  <br>   .....        .....        .....       .....<br>   fffff        fffff        fffff       fffff<br>…<br>2) pollinate a flower: 'f' (0, 1)<br>3) step on a bonus: 'O' (1, 2) and make one more step <br>down to: 'f' (2, 2)<br>4) the bee is on (4, 1), the next command she receive <br>is down and she goes out of the field and the program ends. |
| Input | Output |
| 4<br>....<br>.O..<br>ff..<br>f.B.<br>left<br>left<br>up<br>right<br>up<br>End | The bee couldn't pollinate the flowers, she needed 2 flowers more<br>.B..<br>....<br>....<br>.... |

# 3. Vet Clinic

## Preparation

Download the skeleton provided in Judge. **Do not** change the **packages**!

**Pay attention to name the package parking, all the classes, their fields and methods the same way they are presented in the following document. It is also important to keep the project structure as described.**

## Problem description

Your task is to create a repository, which stores items by creating the classes described below.

First, write a Java class **Pet** with the following fields:

- **name: String**
- **age: int**
- **owner: String**

The class **constructor** should receive **name, age** and **owner.** You need to create the appropriate **getters and setters**. The class should override the **toString()** method in the following format:

**&quot;{name} {age} ({owner})&quot;**

**Next** , write a Java class **Clinic** that has **data** (a collection, which stores the Pets). All entities inside the repository have the **same fields**. Also, the **Clinic** class should have those filelds:

- **capacity: int**

The class **constructor** should receive **capacity** , also it should initialize the **data** with a new instance of the collection **.** Implement the following features:

- Field **data** – **List** that holds added pets
- Method **add(Pet pet)** – **adds** an **entity** to the data **if there is** an **empty cell** for the pet.
- Method **remove(String name)** – removes the pet by **given name,** if such **exists** , and **returns boolean**.
- Method **getPet(String name, String owner)** – returns the pet with the **given name** and **owner** or **null**  **if no such pet exists**.
- Method **getOldestPet()** – returns the oldest Pet.
- Getter **get Count **–** returns **the** number** of pets.
- **getStatistics()** – **returns** a **String** in the following **format** :
  - **&quot;The clinic has the following patients:**
 **{name} {owner}**
 **{name} {owner}**
 **(…)**&quot;

## Constraints

- The **combinations** of **names** and **owners** will **always be unique**.
- The **age** of the pets will always be **positive**.

## Examples

This is an example of how the **Clinic** class is **intended to be used**.

```java
// Initialize the repository
Clinic clinic = new Clinic(20);

// Initialize entity
Pet dog = new Pet("Ellias", 5, "Tim");

// Print Pet
System.out.println(dog); // Ellias 5 (Tim)

// Add Pet
clinic.add(dog);

// Remove Pet
System.out.println(clinic.remove("Ellias")); // true
System.out.println(clinic.remove("Pufa")); // false

Pet cat = new Pet("Bella", 2, "Mia");
Pet bunny = new Pet("Zak", 4, "Jon");

clinic.add(cat);
clinic.add(bunny);

// Get Oldest Pet
Pet oldestPet = clinic.getOldestPet();
System.out.println(oldestPet); // Zak 4 (Jon)

// Get Pet
Pet pet = clinic.getPet("Bella", "Mia");
System.out.println(pet); // Bella 2 (Mia)

// Count
System.out.println(clinic.getCount()); // 2

// Get Statistics
System.out.println(clinic.getStatistics());
//The clinic has the following patients:
//Bella Mia
//Zak Jon
```

## Submission

Zip all the files in the project folder except **bin** and **obj** folders

Submit **single .zip file** , containing **vetClinic package, with the classes inside (Pet, Clinic and the Main class)**, there is no specific content required inside the Main class e. g. you can do any kind of local testing of you program there. However there should be **main(String[] args)** method inside.
