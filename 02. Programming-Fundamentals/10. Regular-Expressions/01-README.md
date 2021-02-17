#
# Exercise: Regular Expressions

Problems for exercises and homework for the [&quot;Programming Fundamentals&quot; course @ SoftUni](https://softuni.bg/trainings/3212/java-fundamentals-january-2021).

You can check your solutions in [Judge.](https://judge.softuni.bg/Contests/1673/Regular-Expressions-Exercises)

## 1. Furniture

Write a program to calculate the total cost of different types of furniture. You will be given some lines of input until you receive the line &quot;Purchase&quot;. For the line to be valid it should be in the following format:

**&quot;>>{furniture name}<<{price}!{quantity}&quot;**

The price can be a floating-point number or a whole number. Store the names of the furniture and the total price. At the end print each bought furniture on a separate line in the format:
**&quot;Bought furniture:**
**{1st name}**
**{nd name}**
… **&quot;**

And on the last line print the following: **&quot;Total money spend: {spend money}&quot;** formatted to the second decimal point.

### Examples

| Input | Output | Comment |
|-|-|-|
| >>Sofa<<312.23!3<br>>>TV<<300!5<br>>Invalid<<!5<br>Purchase | Bought furniture:<br>Sofa<br>TV<br>Total money spend: 2436.69 | Only the Sofa and the TV are valid, for <br>each of them we multiply the price by <br>the quantity and print the result |

## 2. Race

Write a program that processes information about a race. On the **first line** you will be given a **list of participants separated by &quot;,&quot;**. On the next few lines until you receive a line **&quot;end of race&quot;** you will be given some info which will be some **alphanumeric characters**. In between them you could have some **extra characters which you should ignore**. For example:**&quot;G!32e%o7r#32g$235@!2e&quot;**. The **letters are the name** of the person and the **sum of the digits is the distance** he ran. So here we have **George** who ran **29km**. Store the information about the person only **if the list of racers contains the name of the person**. If you receive the **same person more than once just add the distance to his old distance**. At the end **print the top 3 racers** ordered by **distance in descending** in the format:
**&quot;1st place: {first racer}**
**2nd place: {second racer}**
**3rd place: {third racer}&quot;**

### Examples

| Input | Output | Comment |
|-|-|-|
| George, Peter, Bill, Tom<br>G4e@55or%6g6!68e!!@<br>R1@!3a$y4456@<br>B5@i@#123ll<br>G@e54o$r6ge#<br>7P%et^#e5346r<br>T$o553m&6<br>end of race | 1st place: George<br>2nd place: Peter<br>3rd place: Tom | On the 3rd input line we have Ray. He is <br>not in the list, so we do not count his <br>result. The other ones are valid. <br>George has total of 55 km, Peter has 25 <br>and Tom has 19. We do not print Bill <br>because he is on 4th place. |

## 3. \*SoftUni Bar Income

Let`s take a break and visit the game bar at SoftUni. It is about time for the people behind the bar to go home and you are the person who has to draw the line and calculate the money from the products that were sold throughout the day. Until you receive a line with text **&quot;end of shift&quot;** you will be given lines of input. But before processing that line you have to do some validations first.

**Each valid order** should have a **customer, product, count and a price:**

- Valid customer&#39;s name should be **surrounded by &#39;%&#39;** and must **start with a capital letter** , followed by **lower-case letters**
- Valid product **contains any word character** and must be **surrounded by &#39;<&#39; and &#39;>&#39;**
- Valid count is an **integer** , **surrounded by &#39;|&#39;**
- Valid price is any **real number followed by &#39;$&#39;**

The parts of a valid order should appear in the order given: **customer, product, count and a price**.

Between each part there can be other symbols, except ( **&#39;|&#39;, &#39;$&#39;, &#39;%&#39; and &#39;.&#39;** )

For each valid line print on the console: **&quot;{customerName}: {product} - {totalPrice}&quot;**

When you receive **&quot;end of shift&quot;** print the total amount of money for the day **rounded to 2 decimal places** in the following format: **&quot;Total income: {income}&quot;.**

### Input / Constraints

- Strings that you have to process until you receive text **&quot;end of shift&quot;.**

### Output

- Print all the valid lines in the format **&quot;{customerName}: {product} - {totalPrice}&quot;**
- After receiving **&quot;end of shift&quot;** print the total amount of money for the day rounded to 2 decimal places in the following format: **&quot;Total income: {income}&quot;**
- Allowed working **time** / **memory** : **100ms** / **16MB**.

### Examples

| Input | Output | Comment |
|-|-|-|
| %George%<Croissant>\|2\|10.3$<br>%Peter%<Gum>\|1\|1.3$<br>%Maria%<Cola>\|1\|2.4$<br>end of shift | George: Croissant - 20.60<br>Peter: Gum - 1.30<br>Maria: Cola - 2.40<br>Total income: 24.30 | Each line is valid, so we print each <br>order, calculating the total price of the <br>product bought.<br>At the end we print the total income <br>for the day |
| %InvalidName%<Croissant>\|2\|10.3$<br>%Peter%<Gum>1.3$<br>%Maria%<Cola>\|1\|2.4<br>%Valid%<Valid>valid\|10\|valid20$<br>end of shift | Valid: Valid - 200.00<br>Total income: 200.00 | On the first line, the customer name <br>isn't valid, so we skip that line.<br>The second line is missing product <br>count.<br>The third line don't have a valid price.<br>And only the forth line is valid |

## 4. \*Star Enigma

The war is in its peak, but you, young Padawan, can turn the tides with your programming skills. You are tasked to create a program to **decrypt** the messages of The Order and prevent the death of hundreds of lives.

You will receive several messages, which are **encrypted** using the legendary star enigma. You should **decrypt the messages** , following these rules:

To properly decrypt a message, you should **count all the letters [s, t, a, r] – case insensitive** and **remove** the count from the **current ASCII value of each symbol** of the encrypted message.

After decryption:

Each message should have a **planet name, population, attack type (&#39;A&#39;, as attack or &#39;D&#39;, as destruction) and soldier count.**

The planet name **starts after &#39;@&#39;** and contains **only letters from the Latin alphabet**.

The planet population **starts after &#39;:&#39;** and is an **Integer** ;

The attack type may be **&quot;A&quot;(attack) or &quot;D&quot;(destruction)** and must be **surrounded by &quot;!&quot;** (exclamation mark).

The **soldier count** starts after **&quot;->&quot;** and should be an Integer.

The order in the message should be: **planet name -> planet population -> attack type -> soldier count.** Each part can be separated from the others by **any character except: &#39;@&#39;, &#39;-&#39;, &#39;!&#39;, &#39;:&#39; and &#39;>&#39;.**

### Input / Constraints

- The **first line holds n** – the number of **messages – integer in range [1…100];**
- On the next **n** lines, you will be receiving encrypted messages.

### Output

After decrypting all messages, you should print the decrypted information in the following format:

First print the attacked planets, then the destroyed planets.
**&quot;Attacked planets: {attackedPlanetsCount}&quot;**
**&quot;-> {planetName}&quot;**
**&quot;Destroyed planets: {destroyedPlanetsCount}&quot;**
**&quot;-> {planetName}&quot;**

The planets should be **ordered by nam alphabetically.**

### Examples

| Input | Output | Comment |
|-|-|-|
| 2<br>STCDoghudd4=63333$D$0A53333<br>EHfsytsnhf?8555&I&2C9555SR | Attacked planets: 1<br>-> Alderaa<br>Destroyed planets: 1<br>-> Cantonica | We receive two messages, to decrypt them <br>we calculate the key:<br>First message has decryption key 3. So we <br>substract from each characters code 3.<br>PQ@Alderaa1:30000!A!->20000<br>The second message has key 5.<br>@Cantonica:3000!D!->4000NM<br>Both messages are valid and they contain <br>planet, population, attack type and <br>soldiers count. <br>After decrypting all messages we print <br>each planet according the format given. |
| 3<br>tt(''DGsvywgerx>6444444444%H%1B9444<br>GQhrr\|A977777(H(TTTT<br>EHfsytsnhf?8555&I&2C9555SR | Attacked planets: 0<br>Destroyed planets: 2<br>-> Cantonica<br>-> Coruscant | We receive three messages.<br>Message one is decrypted with key 4:<br>pp$##@Coruscant:2000000000!D!->5000<br>Message two is decrypted with key 7:<br>@Jakku:200000!A!MMMM<br>This is invalid message, missing soldier count, so we continue.<br>The third message has key 5.<br>@Cantonica:3000!D!->4000NM |

&quot;It&#39;s a trap!&quot; – Admiral Ackbar

## 5. \*Nether Realms

Mighty battle is coming. In the stormy nether realms, demons are fighting against each other for supremacy in a duel from which only one will survive.

Your job, however, is not so exciting. You are assigned to **sign in all the participants** in the nether realm&#39;s mighty battle&#39;s demon book, which of course is **sorted alphabetically**.

A demon&#39;s **name contains his health and his damage**.

The **sum of the asci codes** of **all characters** (excluding numbers (0-9), arithmetic symbols ( **&#39;+&#39;, &#39;-&#39;, &#39;\*&#39;, &#39;/&#39;** ) and delimiter dot ( **&#39;.&#39;** )) gives a **demon&#39;s total health**.

**The sum of all numbers** in his name forms his base damage. Note that you should consider the plus **&#39;+&#39;** and minus **&#39;-&#39;** signs (e.g. **+10 is 10** and **-10 is -10** ). However, there are some symbols ( **&#39;\*&#39;** and **&#39;/&#39;** ) that can further **alter the base damage by multiplying or dividing it by 2** (e.g. in the name &quot;m **15** \*/c **-5.0**&quot;, the base damage is **15 + (-5.0) = 10** and then you need to multiply it by 2 (e.g. 10 \* 2 = 20) and then divide it by 2 (e.g. 20 / 2 = 10)).

So, **multiplication and division** are applied **only after all numbers are included** in the calculation and **in the order they appear in the name**.

You will get all demons **on a single line** , separated by commas and zero or more blank spaces. Sort them in **alphabetical order** and print their names **along their health and damage**.

### Input

The input will be read from the console. The input consists of a **single line** containing all demon names **separated by commas and zero or more spaces** in the format: **&quot;{demon name}, {demon name}, … {demon name}&quot;**

### Output

Print all demons **sorted by their name in ascending order** , each on a separate line in the format:

- **&quot;{demon name} - {health points} health, {damage points} damage&quot;**

### Constraints

- A demon&#39;s name will contain **at least one character**
- A demon&#39;s name **cannot contain** blank spaces &#39; &#39; or commas &#39;,&#39;
- A **floating-point number will always have digits before and after its decimal separator**
- **Number** in a demon&#39;s name **is considere** d everything that is a valid integer or floating point number (with dot &#39;.&#39; used as separator). For example, all these are valid numbers: &#39;4&#39;, &#39;+4&#39;, &#39;-4&#39;, &#39;3.5&#39;, &#39;+3.5&#39;, &#39;-3.5&#39;

### Examples

| Input | Output | Comment |
|-|-|-|
| M3ph-0.5s-0.5t0.0** | M3ph-0.5s-0.5t0.0** - 524 health, <br>8.00 damage | M3ph-0.5s-0.5t0.0**:<br>Health = 'M' + 'p' + 'h' + 's' + 't' = 524 health.<br>Damage = (3 + (-0.5) + (-0.5) + 0.0) * 2 * 2 = 8 damage. |
| M3ph1st0**, Azazel | Azazel - 615 health, 0.00 damage <br>M3ph1st0** - 524 health, 16.00 damage | Azazel: <br>Health - 'A' + 'z' + 'a' + 'z' + 'e' + 'l' = 615 health. <br>Damage - no digits = 0 damage.<br><br>M3ph1st0**:<br>Health - 'M' + 'p' + 'h' + 's' + 't' = 524 health.<br>Damage - (3 + 1 + 0) * 2 * 2 = 16 damage. |
| Gos/ho | Gos/ho - 512 health, 0.00 damage |  |

## 6. \*Extract Emails

Write a program to **extract all email addresses from a given text**. The text comes at the only input line. Print the emails on the console, each at a separate line. Emails are considered to be in format **<user>@<host>** , where:

- **<user>** is a sequence of **letters** and **digits** , where &#39;**.**&#39;, &#39; **-**&#39; and &#39;**\_**&#39; can appear between them.
  - Examples of valid users: &quot;**stephan**&quot;, &quot;**mike03**&quot;, &quot;**s.johnson**&quot;, &quot;**st\_steward**&quot;, &quot;**softuni-bulgaria**&quot;, &quot; **12345**&quot;.
  - Examples of invalid users: &#39;&#39;**--123**&quot;, &quot;**.....**&quot;, &quot;**nakov\_-**&quot;, &quot;**\_steve**&quot;, &quot;**.info**&quot;.
- **<host>** is a sequence of at least two words, separated by dots &#39; **.**&#39;. Each word is sequence of letters and can have hyphens &#39; **-**&#39; between the letters.
  - Examples of hosts: &quot;**softuni.bg**&quot;, &quot;**software-university.com**&quot;, &quot;**intoprogramming.info**&quot;, &quot;**mail.softuni.org**&quot;.
  - Examples of invalid hosts: &quot;**helloworld**&quot;, &quot;**.unknown.soft.**&quot;, &quot;**invalid-host-**&quot;, &quot;**invalid-**&quot;.
- Examples of **valid emails** : **info<span>@</span>softuni-bulgaria.org** , **kiki<span>@</span>hotmail.co.uk** , **no-reply<span>@</span>github.com** , **s.peterson<span>@</span>mail.uu.net** , **info-bg<span>@</span>software-university.software.academy**.
- Examples of **invalid emails** : **--123<span>@</span>gmail.com** , **…<span>@</span>mail.bg** , **.info<span>@</span>info.info** , **\_steve<span>@</span>yahoo.cn** , **mike<span>@</span>helloworld** , **mike<span>@</span>.unknown.soft.**, **s.johnson<span>@</span>invalid-**.

### Examples

| Input | Output |
|-|-|
| Please contact us at: support<span>@</span>github.com. | support<span>@</span>github.com |
| Just send email to s.miller<span>@</span>mit.edu <br>and j.hopking<span>@</span>york.ac.uk for more information. | s.miller<span>@</span>mit.edu<br>j.hopking<span>@</span>york.ac.uk |
| Many users @ SoftUni confuse email addresses. <br>We @ Softuni.BG provide high-quality training @ home or @ class. <br>–- steve.parker<span>@</span>softuni.de. | steve.parker<span>@</span>softuni.de |
