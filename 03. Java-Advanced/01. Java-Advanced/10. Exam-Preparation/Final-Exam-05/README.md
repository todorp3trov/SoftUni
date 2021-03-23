# 1. Dating App

First you will be given **a sequence of integers representing males**. Afterwards you will be given another **sequence of integers representing females**.

You have to start from the **first female** and try to match it with the **last male**.

- If their **values** are **equal** , you have to **match them** and **remove both** of them. Otherwise you should **remove only the female** and **decrease** the **value** of the **male** by **2**.
- If someone&#39;s value is **equal**  **to**  **or below 0 **, you should** remove him/her **from the records** before **trying to** match** him/her with anybody.
- Special case - if someone&#39;s **value divisible by 25 without remainder**, you should **remove him/her and** the **next person** of the **same gender**.

You need to **stop matching** people when you have **no more females or males**.

### Input

- On the **first line** of input you will receive the integers, representing the **males** , **separated** by a **single space**.
- On the **second line** of input you will receive the integers, representing the **females** , **separated** by a **single space**.

### Output

- On the first line of output - print the number of successful matches:
  - &quot;**Matches: {matchesCount}&quot;**
- On the second line - print all males left:
  - If there are no males: &quot;**Males left: none**&quot;
  - If there are males: &quot;**Males left: {male1}, {male2}, {male3}, (…)**&quot;
- On the third line - print all females left:
  - If there are no females: &quot;**Females left: none**&quot;
  - If there are females: &quot;**Females left: {female1}, {female2}, {female3}, (…)**&quot;

### Constraints

- All of the given numbers will be valid integers in the range [-100, 100].

### Examples

| Input | Output |
|-|-|
| 3 6 9 12<br>12 9 6 1 25 25 | Matches: 3<br>Males left: 1<br>Females left: none |
| Comment | The first pair is the first female with value of 12 <br>and the last male of value 12, their values are equal, <br>so we match them, therefore - remove them from the records. <br>Then we have two more matches (9 == 9 and 6 == 6). <br>But the value of the next male is 3 and the value of the <br>next female is 1, it’s not a match and we remove the female <br>and reduce the male’s value by 2. We have a female whose <br>value is 25 and we have to remove her and the next female.<br>Then, we print the desired output. |
| Input | Output |
| 3 0 3 6 9 0 12<br>12 9 6 1 2 3 15 13 4 | Matches: 4<br>Males left: none<br>Females left: 15, 13, 4 |

# 2. Book Worm

You will be given a **string**. Then, you will be given an **integer N** for the **size** of the field with **square** shape. On the next **N** lines, you will receive the **rows** of the field. The player will be placed on a **random position**, marked with **&quot;P**&quot;. On **random positions** there will be **letters**. **All of the empty positions** will be marked with **&quot;-&quot;**.

Each turn you will be given commands for the **player&#39;s movement**. If he moves to a **letter** , he **consumes** it, **concatеnates** it to the **initial string** and the letter **disappears from the field**. If he tries to move **outside** of the field, he **is punished** -he **loses** the **last** letter **in the string** , **if there are any** , and the **player&#39;s position **is** not changed**.

When the command &quot;**end**&quot; is received, **stop the program** , **print all letters and the field**.

### Input

- On the **first line** , you are given the **initial string**
- On the **second line** , you are given the integer **N** - the size of the **square** matrix
- The **next N lines** holds the values for every **row**
- On each of the next lines you will get a move command

### Output

- On the first line the **final** state of the **string**
- In the end print **the matrix**

### Constraints

- The size of the **square** matrix will be between **[2…10]**
- The **player position** will be **marked** with &quot;**P**&quot;
- The **letters** on the field will be **any letter except** for &quot;**P**&quot;
- Move commands will be: &quot;**up**&quot;, &quot;**down**&quot;, &quot;**left**&quot;, &quot;**right**&quot;
- Stop command will be &quot;**end**&quot;

### Examples

| Input | Output |
|-|-|
| Hello<br>4<br>P---<br>Mark<br>-l-y<br>--e-<br>down<br>right<br>right<br>right<br>end | HelloMark<br>----<br>---P<br>-l-y<br>--e- |
| Comment | The initial string we receive is "Hello". <br>Then we receive 4x4 field and the player <br>is on index [0;0].<br>Then, we start receiving commands. First <br>the player moves to [1;0], where he <br>consumes 'M', and then all letters on the right. <br>When we receive the "end" command, our string is <br>"HelloMark" and the player is on index [1;3]. |
| Input | Output |
| Initial<br>5<br>-----<br>t-r--<br>--Pa-<br>--S--<br>z--t-<br>up<br>left<br>left<br>left<br>end | Initialr<br>-----<br>P----<br>---a-<br>--S--<br>z--t- |
| Comment | The initial string we receive is "Initial". <br>Then we receive 5x5 field and the player is <br>on index [2;2].<br>The player consumes 'r' and 't', but also <br>tries to go out of the matrix once, so he <br>loses the last character of his string – 't'. <br>The string after the "end" command is "Initialr". |

# 3. Rabbits

## Preparation

Download the skeleton provided in Judge. **Do not** change the **packages**.

**Pay attention to name the package** **(rabbits), all the classes, their fields and methods the same way they are presented in the following document. It is also important to keep the project structure as described.**

## Problem description

Your task is to create a repository which stores departments by creating the classes described below.

# Rabbit

First, write a Java class **Rabbit** with the following fields:

- **name: String**
- **species: String**
- **available: boolean - true by default**

The class **constructor** should receive **(name, species)**.

The class should also have the following methods:

- **getName()**
- **get Species()**
- **isAvailable ()**
- **setAvailable()**
- Override the **toString()** method in the format:

**&quot;Rabbit ({species}): {name}&quot;**

# Cage

**Next** , write a Java class **Cage** that has **data** (a collection which stores the entity **Rabbit** ). All entities inside the repository have the **same fields**. Also, the **Cage** class should have those **fields** :

- **name: String**
- **capacity: int**
- **data** : **List{Rabbit}** that holds added rabbits

The class **constructor** should receive **(name**, **capacity)**, also it should initialize the **data** with a new instance of the collection.

Implement the following features:

- **getName()**
- **getCapacity()**
- **add(Rabbit rabbit)**method - **adds** an **entity** to the data **if**** there ****is**** room** for it
- **removeRabbit(String name)** method - removes a rabbit by **given name,** if such **exists** , and **returns boolean**
- **removeSpecies(String species)** method - removes **all rabbits** by given **species**
- **sellRabbit(String name)** method - **sell** ( **set** its **available property** to **false** without removing it from the collection) the **first rabbit** with the **given name**, also **return** the **rabbit**
- **sellRabbitBySpecies(String species)** method - sells and returns **all rabbits** from that **species**  **as a**  **List**
- **count()** - **returns** the **number** of rabbits
- **report()** - **returns** a **String** in the following **format, including only**  **not sold**  **rabbits** :
  - &quot;Rabbits available at {cageName}:  
    {Rabbit 1} 
    
    {Rabbit 2} 
    
    (…)&quot;

## Constraints

- The **names** of the rabbits will be **always unique**.
- You will always have a rabbit added before receiving methods manipulating the Cage&#39;s rabbits.

## Examples

```java
//Initialize the repository (Cage)
Cage cage = new Cage("Wildness", 20);
 //Initialize entity
Rabbit rabbit = new Rabbit("Fluffy", "Blanc de Hotot");
 //Print Rabbit
System.out.println(rabbit); // Rabbit (Blanc de Hotot): Fluffy

//Add Rabbit
cage.add(rabbit);
System.out.println(cage.count()); //1
//Remove Rabbit
cage.removeRabbit("Rabbit Name"); //false

Rabbit secondRabbit = new Rabbit("Bunny", "Brazilian");
Rabbit thirdRabbit = new Rabbit("Jumpy", "Cashmere Lop");
Rabbit fourthRabbit = new Rabbit("Puffy", "Cashmere Lop");
Rabbit fifthRabbit = new Rabbit("Marlin", "Brazilian");
 
//Add Rabbits
cage.аdd(secondRabbit);
cage.аdd(thirdRabbit);
cage.аdd(fourthRabbit);
cage.аdd(fifthRabbit);
 
//Sell Rabbit by name
System.out.println(cage.sellRabbit("Bunny")); //Rabbit (Brazilian): Bunny
//Sell Rabbit by species
List<Rabbit> soldSpecies = cage.sellRabbitBySpecies(("Cashmere Lop");

soldSpecies.forEach(f-> {
      System.out.println(f.getName());

  });
 //Jumpy
 //Puffy

System.out.println(cage.report());
//Rabbits available at Wildness:
//Rabbit (Blanc de Hotot): Fluffy
//Rabbit (Brazilian): Marlin
```

## Submission

Submit **single .zip file** , containing **rabbits package, with the classes inside (Rabbit, Cage and the Main class****) **, there is no specific content required inside the Main class e. g. you can do any kind of local testing of youр program there. However, there should be** main(String[] args)** method inside.
