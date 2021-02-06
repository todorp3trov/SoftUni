# Programming Fundamentals Final Exam 04.04.2020

## Problem 1. Password Reset

_Yet again you have forgotten your password... Naturally it`s not the first time this has happened. Actually you got so tired of it that you decided to help yourself with a smart solution._

Write a password reset program that performs a series of commands upon a predefined string. First, you will receive a string and afterwards, until the command &quot; **Done**&quot; is given, you will be receiving strings with commands split by a single space. The commands will be the following:

- **TakeOdd**
  - Takes only the characters at **odd indices** and **concatenates** them together to
 obtain the **new raw password** and then **prints** it.
- **Cut {index} {length}**
  - Gets the substring with the **given length** starting from the **given index** from the password and removes its first occurrence of it, then prints the password on the console.
  - The given index and length will **always** be **valid**.
- **Substitute {substring} {substitute}**
  - If the raw password contains the given substring, replaces all of its
 occurrences with the substitute text given and prints the result.
  - If it doesn&#39;t, prints **&quot;Nothing to replace!&quot;**

### Input

- You will be receiving strings until the &quot; **Done**&quot; command is given.

### Output

- After the **&quot;Done&quot;** command is received, print:
  - **&quot;Your password is: {password}&quot;**

### Constraints

- The indexes from the &quot; **Cut {index} {length}**&quot; command will always be valid.

### Examples

| Input | Output |
|-|-|
| Siiceercaroetavm!:?:ahsott.:i:nstupmomceqr <br>TakeOdd<br>Cut 15 3<br>Substitute :: -<br>Substitute \| ^<br>Done | icecream::hot::summer<br>icecream::hot::mer<br>icecream-hot-mer<br>Nothing to replace!<br>Your password is: icecream-hot-mer |
| **Comment** |  |
| TakeOdd<br>Siiceercaroetavm!:?:ahsott.:i:nstupmomceqr -> icecream::hot::summer<br>We only take the chars at odd indices 1, 3, 5 etc.<br>Cut 15  3 -> icecream::hot::summer -> sum<br>icecream::hot::mer<br>We cut a substring starting at index 15 with length 3, <br>remove it from the raw password and print it. <br>Then, on a new line we print the resulting new raw password.<br>Substitute :: - -> icecream::hot::summer -> icream-hot-summer<br>We replace "::" with "-".<br>Substitute \| ^ -> Nothing to replace! <br>"\|" is not found anywhere in the raw password.<br>Finally, after receiving the "Done" command, we print the resulting password in the proper format. |  |
| **Input** | **Output** |
| up8rgoyg3r1atmlmpiunagt!-irs7!1fgulnnnqy<br>TakeOdd<br>Cut 18 2<br>Substitute ! ***<br>Substitute ? .!.<br>Done | programming!is!funny<br>programming!is!fun<br>programming***is***fun<br>Nothing to replace!<br>Your password is: programming***is***fun |

## Problem 2. Fancy Barcodes

Your first task is to determine if the given sequence of characters is a **valid** barcode or **not**.

**Each line must not contain anything else but a valid barcode**. A barcode is **valid** when:

- Is surrounded with a **&quot;@&quot;** followed by one or more **&quot;#&quot;**
- Is **at least 6 characters long** (without the surrounding **&quot;@&quot;** or **&quot;#&quot;** )
- **Starts** with a **capital letter**
- Contains **only letters** (lower and upper case) **and digits**
- **Ends** with a **capital letter**

Examples of valid barcodes: **@#FreshFisH@#** , **@###Brea0D@###** , **@##Che46sE@##** , **@##Che46sE@###**

Examples of invalid barcodes: **##InvaliDiteM##** , **@InvalidIteM@** , **@#Invalid\_IteM@#**

Next you have to determine the **product group** of the item from the **barcode**. The product group is obtained by **concatenating= all the digits** found in the barcode. If there are **no digits** present in the barcode, the **default** product group is **&quot;00&quot;.**

Examples:

**@#FreshFisH@#** -> product group: 00

**@###Brea0D@###** --> product group: 0

**@##Che4s6E@##** -> product group: 46

### Input

On the first line you will be given an integer **n** – the count of barcodes that you will be receiving next.

On the next **n** lines, you will receive different strings.

### Output

For each barcode that you process, you need to print a message.

If the barcode is invalid:

- **&quot;Invalid barcode&quot;**

If the barcode is valid:

- **&quot;Product group: {product group}&quot;**

### Constraints

### Examples

| Input | Output |
|-|-|
| 3<br>@#FreshFisH@#<br>@###Brea0D@###<br>@##Che4s6E@## | Product group: 00<br>Product group: 0<br>Product group: 46 |
| **Input** | **Output** |
| 6<br>@###Val1d1teM@###<br>@#ValidIteM@#<br>##InvaliDiteM##<br>@InvalidIteM@<br>@#Invalid_IteM@#<br>@#ValiditeM@# | Product group: 11<br>Product group: 00<br>Invalid barcode<br>Invalid barcode<br>Invalid barcode<br>Product group: 00 |

## Problem 3. Heroes of Code and Logic VII

_You got your hands on the most recent update on the best MMORPG of all time – Heroes of Code and Logic. You want to play it all day long! So cancel all other arrangements and create your party!_

On the first line of the standard input you will receive an integer **n** – the number of heroes that you can choose for your party. On the next **n** lines, the heroes themselves will follow with their **hit points** and **mana points** separated by empty space in the following format:

**{hero name} {HP} {MP}**

- where **HP** stands for hit points and **MP** for mana points
- a hero can have a **maximum** of **100 HP** and **200 MP**

After you have successfully picked your heroes, you can start playing the game. You will be receiving different commands, each on a new line, separated by **&quot; – &quot;**, until the **&quot;End&quot;** command is given.

There are several actions that can be performed by the heroes:

**CastSpell – {hero name} – {MP needed} – {spell name}**

- If the hero has the required MP, he casts the spell, thus reducing his MP. Print this message:
  - **&quot;{hero name} has successfully cast {spell name} and now has {mana points left} MP!&quot;**
- If the hero is unable to cast the spell print:
  - &quot; **{hero name} does not have enough MP to cast {spell name}!**&quot;

**TakeDamage – {hero name} – {damage} – {attacker}**

- Reduce the hero HP by the given damage amount. If the hero is still alive (his HP is greater than 0) print:
  - **&quot;{hero name} was hit for {damage} HP by {attacker} and now has {current HP} HP left!&quot;**
- If the hero has died, remove him from your party and print:
  - **&quot;{hero name} has been killed by {attacker}!&quot;**

**Recharge – {hero name} – {amount}**

- The hero increases his MP. If a command is given that would bring the MP of the hero abovethe **maximum value** (**200)**, MP is increased to **200**. (the MP can&#39;t go over the maximum value).
- Print the following message:
  - **&quot;{hero name} recharged for {amount recovered} MP!&quot;**

**Heal – {hero name} – {amount}**

- The hero increases his HP. If a command is given that would bring the HP of the hero above the **maximum value (100)**, HP is increased to **100** (the HP can&#39;t go over the maximum value).
- Print the following message:
  - **&quot;{hero name} healed for {amount recovered} HP!&quot;**

### Input

- On the first line of the standard input you will receive an integer **n**
- On the next **n** lines, the heroes themselves will follow with their **hit points** and **mana points** separated by empty space in the following format
- You will be receiving different **commands** , each on a new line, separated by **&quot; – &quot;**, until the **&quot;End&quot;** command is given

### Output

- Print all members of your party who are **still alive** , sorted by their **HP in descending order** , then by their **name in ascending order** , in the following format (their HP/MP need to be indented 2 spaces):

**&quot;{hero name}**
**HP: {current HP}**
**MP: {current MP}**
**...&quot;**

### Constraints

- The starting HP/MP of the heroes will be valid, 32-bit integers, will never be negative or exceed the respective limits.
- The HP/MP amounts in the commands will never be negative.
- The hero names in the commands will always be valid members of your party. No need to check that explicitly

### Examples

| Input | Output |
|-|-|
| 2<br>Solmyr 85 120<br>Kyrre 99 50<br>Heal - Solmyr - 10<br>Recharge - Solmyr - 50<br>TakeDamage - Kyrre - 66 - Orc<br>CastSpell - Kyrre - 15 - ViewEarth<br>End | Solmyr healed for 10 HP!<br>Solmyr recharged for 50 MP!<br>Kyrre was hit for 66 HP by Orc and now has 33 HP left!<br>Kyrre has successfully cast ViewEarth and now has 35 MP!<br>Solmyr<br>  HP: 95<br>  MP: 170<br>Kyrre<br>  HP: 33<br>  MP: 35 |
| **Comment** |  |
| These are examples of successful actions. <br>The different colors denote the commands and their respective messages. |  |
| **Input** | **Output** |
| 4<br>Adela 90 150<br>SirMullich 70 40<br>Ivor 1 111<br>Tyris 94 61<br>Heal - SirMullich - 50<br>Recharge - Adela - 100<br>CastSpell - Tyris - 1000 - Fireball<br>TakeDamage - Tyris - 99 - Fireball<br>TakeDamage - Ivor - 3 - Mosquito<br>End | SirMullich healed for 30 HP!<br>Adela recharged for 50 MP!<br>Tyris does not have enough MP to cast Fireball!<br>Tyris has been killed by Fireball!<br>Ivor has been killed by Mosquito!<br>SirMullich<br>  HP: 100<br>  MP: 40<br>Adela<br>  HP: 90<br>  MP: 200 |
| **Comment** |  |
| Heal – SirMullich healed for 30 HP due to the HP max limit.<br>Recharge – Adela recharged for 50 MP due to the MP max limit.<br>CastSpell – Tyris does not have enough MP to cast the spell.<br>TakeDamage – Tyris's HP is reduced by 99, thus becoming -5, which means that he is dead.<br>TakeDamage – Ivor's HP is now -2, so he is dead too.<br>After the "End" command we print the remaining living heroes, sorted by their HP in reverse order. |  |
