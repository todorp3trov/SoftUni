# 1. Cooking

_You are asked to cook baked foods for the near bakery, because your recipes are so great. You need to mix liquids with ingredients to cook the required delicacies._

First, you will be given **a sequence of integers, representing liquids**. Afterwards, you will be given another **sequence of integers representing ingredients**.

You need to start from the **first liquid** and try to mix it with the **last ingredient.** If the **sum** of their values is **equal** to **any of the items in the table below** – **cook the food corresponding** to the **value** and **remove both** the **liquid** and the **ingredient**. Otherwise, **remove only the liquid** and **increase** the **value** of the **ingredient by 3**. You need to **stop** combining when you have **no more liquids** or **ingredients**.

| Food | Value needed |
|-|-|
| Bread | 25 |
| Cake | 50 |
| Pastry | 75 |
| Fruit Pie | 100 |

### Input

- On the **first line** , you will receive the integers representing the **liquids** , **separated** by a **single space**.
- On the **second line** , you will receive the integers representing the **ingredients** , **separated** by a **single space**.

### Output

- On the **first** line of output print one of the following ouputs:
  - &quot;**Wohoo! You succeeded in cooking all the food!**&quot; - if you have at least
**one of each** of the **foods** , after completing combining.
  - &quot;**Ugh, what a pity! You didn&#39;t have enough materials to cook everything.**&quot; – if you **did not** collect **one of each** of the **foods** , after completing combining.
- On the **second** line - print all liquids you have left:
  - If there are no liquids: &quot;**Liquids left: none**&quot;
  - If there are liquids: &quot;**Liquids left: {liquid1}, {liquid2}, {liquid3}, (…)**&quot;
- On the **third** line - print all physical materials you have left:
  - If there are no items: &quot;**Ingredients left: none**&quot;
  - If there are items: &quot;**Ingredients left: {ingredient}, {ingredient}, {ingredient}, (…)&quot;**
- Then **,** you need to print **all** AdvancedMaterials and the **amount you have of them** , ordered **alphabetically** :
  - **&quot;Bread : {amount}&quot;**
  - **&quot;Cake: {amount}&quot;**
  - **&quot;Fruit Pie: {amount}&quot;**
  - **&quot;Pastry: {amount}&quot;**

### Constraints

- All of the given numbers will be valid integers in the range **[0, 100]**.
- Advanced materials **can be** crafted more than once.

### Examples

| Input | Output | Comment |
|-|-|-|
| 1 25 50 50<br>50 25 25 24 | Wohoo! You succeeded in cooking all the food!<br>Liquids left: none<br>Ingredients left: none<br>Bread: 1<br>Cake: 1<br>Fruit pie: 1<br>Pastry: 1 | The first pair is the first liquid with value of <br>1 and the last ingredient of value 24, their sum <br>is 25, so we cook Bread. Then we have sum of 50, <br>we cook Cake. After that we have sum of 75, we <br>cook Pastry. Next we have sum of 100, so we craft <br>Fruit Pie. We have no left liquids and/or <br>ingredients, so we stop trying to cook foods, but <br>we have enough of them to give them to the bakery. |
| 10 20 30 40 50<br>50 40 30 30 15 | Ugh, what a pity! You didn't have enough materials to to cook everything.<br>Liquids left: none<br>Ingredients left: 39, 40, 50<br>Bread: 1<br>Cake: 1<br>Fruit pie: 0<br>Pastry: 0 | First, we take the first given liquid and the <br>last ingredient, their sum is 25 and we cook <br>Bread, removing both of them from the collections.<br>Then, we take the next pair and their sum is <br>50, cooking Cake and again – removing both the <br>liquid and the ingredient.<br>Next, we take the next pair and their sum is <br>60, so we remove the liquid and increase the <br>ingredient's value by 3.<br>The next 2 pairs follow the same scenario, so <br>we end up with not enough materials for all the <br>food, no liquids left and some ingredients, one <br>of which is 39 (originally 30, increased its <br>value three times). |

# 2. Selling

_You successfully started your cooking journey, so now you need to sell the products from your basket in the bakery in order to collect your price._

You will be given an integer **n** for the **size** of the bakery with **square** shape. On the next **n** lines, you will receive the **rows** of the bakery. You will be placed on a **random position** , marked with the letter &#39;**S**&#39;. On random positions there will be clients, marked with a **single digit**. There **may** also be **pillars**. Their **count** will be either **0** or **2** and they are **marked** with the **letter** - &#39;**O**&#39;. **All of the empty positions** will be marked with **&#39;-&#39;**.

Each turn, you will be given **commands** for the **your movement**. Move commands will be: &quot;**up**&quot;, &quot;**down**&quot;, &quot;**left**&quot;, &quot;**right**&quot;. If you **move** to a **client** , you **collects the price equal** to the **digit there** and the client **disappears**. If you move to a **pillar**, you move on the **position** of the **other pillar** and then **both** pillars **disappear**. If you **go out** of the bakery, you **disappear** from the bakery and you are out of there. You need **at least 50 dollars** to rent your own Bakery

When **you are out of the bakery or you collect enough money,** the program **ends**.

### Input

- On the first line, you are given the integer **n** – the size of the **square** matrix.
- The **next n lines** holds the values for every **row**.
- On each of the next lines you will get a move command.

### Output

- On the first line:
  - If the player goes to the void, print: &quot;**Bad news, you are out of the bakery.**&quot;
  - If the player collects enough star power, print: &quot;**Good news! You succeeded in collecting enough money!**&quot;
- On the second line print all star power collected: &quot;**Money: {money}**&quot;
- In the end print the matrix.

### Constraints

- The size of the **square** matrix will be between **[2…10].**
- There will **always** be **0** or **2** pillars, marked with the **letter** - &#39;**O**&#39;.
- Your position will be marked with &#39;**S**&#39;.
- You will **always** go out of the bakery or collect enough money.

### Examples

| Input | Output | Comment |
|-|-|-|
| 5<br>SO---<br>-----<br>-----<br>-----<br>----O<br>right<br>right | Bad news, you are out of the bakery.<br>Money: 0<br>-----<br>-----<br>-----<br>-----<br>----- | The first command is right. You move to one of <br>the pillars and then appears on the other side of it (4,4).<br>The bakery looks like this after the first command:<br>-----<br>-----<br>-----<br>-----<br>----S<br>The second command is right. You go of the bakery. |
| 6<br>S98---<br>99----<br>666666<br>------<br>--77--<br>-6-6-6<br>right<br>right<br>down<br>left<br>left<br>down<br>right<br>right | Good news! You succeeded in collecting enough money!<br>Money: 53<br>------<br>------<br>--S666<br>------<br>--77--<br>-6-6-6 | Here we have no pillars and bakery rich of clients.<br>You manage to collect enough money without going out <br>of the bakery.<br>The clients you have selled food to have disappeared <br>and we can see where you were when you collected the <br>last neeeded money (2,2). |

# 3. Openning

_Now that you successfully saved money for your own Bakery ,you need to recruit some employees to work there. You are You should build a system for that._

## Preparation

Download the skeleton provided in Judge. **Do not** change the **packages**!

**Pay attention to name the package bakery, all the classes, their fields and methods the same way they are presented in the following document. It is also important to keep the project structure as described.**

## Problem description

Your task is to create a bakery, which stores employees by creating the classes described below.

First, write a Java class **Employee** with the following properties:

- **name: String**
- **age: int**
- **country: String**

The class **constructor** should receive **name, age** and **country** and override the **ToString()** method in the following format:

**&quot;Employee: {name}, {age} ({country})&quot;**

**Next** , write a Java class **Bakery** that has **employees** (a collection, which stores the entity **Employee** ). All entities inside the repository have the **same properties**. Also, the Bakery class should have those properties:

- **name: String**
- **capacity: int**

The class **constructor** should receive **name** and **capacity** , also it should initialize the **employees** with a new instance of the collection **.** Implement the following features:

- Field **employees** – **List** that holds added Employees
- Method **add(Employee employee)** – **adds** an **entity** to the data **if there is room** for him/her.
- Method **remove(String name)** – removes an employee by **given name,** if such **exists** , and **returns bool**.
- Method **getOldestEmployee()** – returns the **oldest** employee.
- Method **getEmployee(string name)** – returns the employee with the **given name**.
- Getter **getCount()** – **returns** the **number** of employees.
- **report()** – **returns** a **string** in the following **format** :
  - **&quot;Employees working at Bakery {bakeryName}:
 {Employee1}
 {Employee2}
 (…)**&quot;

## Constraints

- The **names** of the employees will be **always unique**.
- The **age** of the employees will always be with **positive values**.
- You will always have an employee added before receiving methods manipulating the Space Station&#39;s Employees.

## Examples

This is an example how the **Bakery** class is **intended to be used**.
```java
//Initialize the repository
Bakery bakery = new Bakery("Barny", 10);
//Initialize entity
Employee employee = new Employee("Stephen", 40, "Bulgaria");
//Print Employee
System.out.println(employee); //Employee: Stephen, 40 (Bulgaria)

//Add Employee
bakery.add(employee);
//Remove Employee
System.out.println(bakery.remove("Employee name")); //false

Employee secondEmployee = new Employee("Mark", 34, "UK");

//Add Employee
bakery.add(secondEmployee);

Employee oldestEmployee = bakery.getOldestEmployee(); // Employee with name Stephen
Employee employeeStephen = bakery.getEmployee("Stephen"); // Employee with name Stephen
System.out.println(oldestEmployee); //Employee: Stephen, 40 (Bulgaria)
System.out.println(employeeStephen); //Employee: Stephen, 40 (Bulgaria)

System.out.println(bakery.getCount()); //2

System.out.println(bakery.report());
//Employees working at Bakery Barny:
//Employee: Stephen, 40 (Bulgaria)
//Employee: Mark, 34 (UK)
```

## Submission

Submit **single .zip file** , containing **bakery package, with the classes inside (Employee, Bakery and the Main class)**, there is no specific content required inside the Main class e. g. you can do any kind of local testing of you program there. However there should be **main(String[] args)** method inside.
