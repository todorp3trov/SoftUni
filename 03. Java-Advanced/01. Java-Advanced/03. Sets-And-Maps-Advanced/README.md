# Lab: Sets and Maps Advanced

This document defines the lab for [&quot;Java Advanced&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). You can check your solutions in [Judge](https://judge.softuni.bg/Contests/1462/Sets-And-Maps-Advanced-Lab).

## I. Sets

## 1. Parking Lot

Write a program that:
- Records **car number** for every car that enter in the **parking lot**
- Removes **car number** when the car go out

### Input

The input will be string in format **[direction, carNumber]**
The input ends with string **&quot;END&quot;**

### Output

Print the output with all car numbers which are in parking lot

### Examples

| Input | Output |
|-|-|
| IN, CA2844AA<br>IN, CA1234TA<br>OUT, CA2844AA<br>IN, CA9999TT<br>IN, CA2866HI<br>OUT, CA1234TA<br>IN, CA2844AA<br>OUT, CA2866HI<br>IN, CA9876HH<br>IN, CA2822UU<br>END | CA9999TT<br>CA2844AA<br>CA9876HH<br>CA2822UU |
| IN, CA2844AA<br>IN, CA1234TA<br>OUT, CA2844AA<br>OUT, CA1234TA<br>END | Parking Lot is Empty |

### Hints

- Car numbers are **unique**
- Use the methods **isEmpty()**

## 2. SoftUni Party

There is a party in SoftUni. Many guests are invited, and they are two types: **VIP** and **regular**.
When guest comes, you have to check if he/she **exist** in any of two reservation lists.

All reservation numbers will be with **8 chars.**

All **VIP** numbers start with **digit.**

There will be 2 command lines. First is **&quot;PARTY&quot;** - party is on and guests start coming.
Second is **&quot;END&quot;** - then party is over, and no more guest will come.

Output shows all guests, who didn&#39;t come to the party (**VIP** must be first).

### Examples

| Input | Output | Input | Output |
|-|-|-|-|
| 7IK9Yo0h<br>9NoBUajQ<br>Ce8vwPmE<br>SVQXQCbc<br>tSzE5t0p<br>PARTY<br>9NoBUajQ<br>Ce8vwPmE<br>SVQXQCbc<br>END | 2<br>7IK9Yo0h<br>tSzE5t0p | m8rfQBvl<br>fc1oZCE0<br>UgffRkOn<br>7ugX7bm0<br>9CQBGUeJ<br>2FQZT3uC<br>dziNz78I<br>mdSGyQCJ<br>LjcVpmDL<br>fPXNHpm1<br>HTTbwRmM<br>B5yTkMQi<br>8N0FThqG<br>xys2FYzn<br>MDzcM9ZK<br>PARTY<br>2FQZT3uC<br>dziNz78I<br>mdSGyQCJ<br>LjcVpmDL<br>fPXNHpm1<br>HTTbwRmM<br>B5yTkMQi<br>8N0FThqG<br>m8rfQBvl<br>fc1oZCE0<br>UgffRkOn<br>7ugX7bm0<br>9CQBGUeJ<br>END | 2<br>MDzcM9ZK<br>xys2FYzn |

## 3. &quot;Voina&quot; – Number Game

Write a program that:

- Reads 20 numbers for both players, separated with &quot; &quot; (single space)
- Every player can hold only **unique** numbers

Each Round both players get the **top number** from their own deck. Player with the bigger number get both numbers and add it on the **bottom** of his own sequence

Game ends after **50 rounds** or if any player **lose all** of his numbers

### Input

- Numbers – **Integer**
- Output must be **&quot;First Player Win!&quot;** , **&quot;Second Player Win!&quot;** or **&quot;Draw!&quot;**

### Examples

| Input | Output |
|-|-|
| 26 58 16 92 44 65 65 77 57 23 71 57 7 52 85 44 32 70 38 23<br>43 95 33 51 62 93 57 55 0 31 32 95 68 34 30 51 37 32 11 97 | Second player win! |
| 74 78 82 42 19 39 29 69 20 42 31 77 57 36 76 26 4 9 83 42<br>15 43 80 71 22 88 78 35 28 30 46 41 76 51 76 18 14 52 47 38 | First player win! |

### Hints

- Use **Iterator<E>** and **next()** for finding top number in decks
- Think where to check if any player is **without** cards
- When you find top number, be sure to **remove** it **immediately**

## II. Maps

## 4. Count Real Numbers

Write a program that counts the occurrence of real **numbers**. The input is a single line with real numbers separated by spaces. Print the numbers in the order of appearance. All **numbers** must be formatted to one digit after the decimal point.

### Examples

| Input | Output |
|-|-|
| -2.5 4 3 -2.5 -5.5 4 3 3 -2.5 3 | -2.5 -> 3<br>4.0 -> 2<br>3.0 -> 4<br>-5.5 -> 1 |
| 2.3 4.5 4.5 5.5 5.5 2.3 3.0 3.0 4.5 4.5 3.0 3.0 4.0 3.0 5.5 3.0 2.3 5.5 4.5 3.0 | 2.3 -> 3<br>4.5 -> 5<br>5.5 -> 4<br>3.0 -> 7<br>3.0 -> 1 |

## 5. Average Students Grades

Write a program, which reads the **name** of a student and their **grades** and **adds** them to the **student record** , then **prints gradesalong with their average grade – ordered the output by the names of the students**.

### Input

On the first line **N** – the number of students, then on the next **N** lines student name with grade.

### Examples

| Input | Output |
|-|-|
| 7<br>Ivancho 5.20<br>Mariika 5.50<br>Ivancho 3.20<br>Mariika 2.50<br>Stamat 2.00<br>Mariika 3.46<br>Stamat 3.00 | Ivancho -> 5.20 3.20 (avg: 4.20)<br>Mariika -> 5.50 2.50 3.46 (avg: 3.82)<br>Stamat -> 2.00 3.00 (avg: 2.50) |
| 4<br>Vladimir 4.50<br>Petko 3.00<br>Vladimir 5.00<br>Petko 3.66 | Petko -> 3.00 3.66 (avg: 3.33)<br>Vladimir -> 4.50 5.00 (avg: 4.75) |
| 5<br>Gosho 6.00<br>Gosho 5.50<br>Gosho 6.00<br>Ivan 4.40<br>Petko 3.30 | Gosho -> 6.00 5.50 6.00 (avg: 5.83)<br>Ivan -> 4.40 (avg: 4.40)<br>Petko -> 3.30 (avg: 3.30) |

### Hints

- Use a **TreeMap** ( **String** -> **ArrayList<Double>** )
- Check if the name **exists** before adding the grade. If it doesn&#39;t, add it to the map.
- Pass through all **key-value pairs** in the map and print the results.
- Think of way to get the average grades for each student.
- You can do that with an ordinary loop or with **Stream API**

## 6. Product Shop

Write a program that prints information about food shops in Sofia and the products they store. Until the &quot;**Revision**&quot; command you will receive an input in the format: **&quot;{shop}, {product}, {price}&quot;**

Take in mind that if you receive a shop you already have received, you must collect its product information.

Your output must be ordered by shop name and must be in the format:
**{shop}->**
**Product: {product}, Price: {price}**
The price should be formated to **one** digit after the decimal point.

### Examples

| Input | Output |
|-|-|
| lidl, juice, 2.30<br>fantastico, apple, 1.20<br>kaufland, banana, 1.10<br>fantastico, grape, 2.20<br>Revision | fantastico-><br>Product: apple, Price: 1.2<br>Product: grape, Price: 2.2<br>kaufland-><br>Product: banana, Price: 1.1<br>lidl-><br>Product: juice, Price: 2.3 |
| tmarket, peanuts, 2.20<br>GoGrill, meatballs, 3.30<br>GoGrill, HotDog, 1.40<br>tmarket, sweets, 2.20<br>Revision | GoGrill-><br>Product: meatballs, Price: 3.3<br>Product: HotDog, Price: 1.4<br>tmarket-><br>Product: peanuts, Price: 2.2<br>Product: sweets, Price: 2.2 |

## 7. Cities by Continent and Country

Write a program to read **continents** , **countries** and their **cities** , put them in a **nested map** and **print** them in the order of first appearance.

### Examples

| Input | Output |
|-|-|
| 9<br>Europe Bulgaria Sofia<br>Asia China Beijing<br>Asia Japan Tokyo<br>Europe Poland Warsaw<br>Europe Germany Berlin<br>Europe Poland Poznan<br>Europe Bulgaria Plovdiv<br>Africa Nigeria Abuja<br>Asia China Shanghai | Europe:<br>  Bulgaria -> Sofia, Plovdiv<br>  Poland -> Warsaw, Poznan<br>  Germany -> Berlin<br>Asia:<br>  China -> Beijing, Shanghai<br>  Japan -> Tokyo<br>Africa:<br>  Nigeria -> Abuja |
| 3<br>Europe Germany Berlin<br>Europe Bulgaria Varna<br>Africa Egypt Cairo | Europe:<br>  Germany -> Berlin<br>  Bulgaria -> Varna<br>Africa:<br>  Egypt -> Cairo |
| 8<br>Africa Somalia Mogadishu<br>Asia India Mumbai<br>Asia India Delhi<br>Europe France Paris<br>Asia India Nagpur<br>Europe Germany Hamburg<br>Europe Poland Gdansk<br>Europe Germany Danzig | Africa:<br>  Somalia -> Mogadishu<br>Asia:<br>  India -> Mumbai, Delhi, Nagpur<br>Europe:<br>  France -> Paris<br>  Germany -> Hamburg, Danzig<br>  Poland -> Gdansk |

### Hints

- Use a **nested Map(String -> (Map -> ArrayList<String>))**
- Check if the continent **exists** before adding the country. If it doesn&#39;t, **add** it to the dictionary.
- Check if the country **exists** , before **adding** the city. If it doesn&#39;t, add it to the dictionary.
- Pass through all **key-value pairs** in the Map and the values&#39; key-value pairs and print the results.

## 8. Academy Graduation

Write a program that:

- Reads from console **number** of students for a track
- Reads on **pair of rows** :
  - First line is the **name** of student
  - Second line is his **score** for different number of courses
- Print on console &quot;**{name}** is graduated with **{average scores)**&quot;

### Examples

| Input | Output |
|-|-|
| 3<br>Gosho<br>3.75 5<br>Mara<br>4.25 6<br>Pesho<br>6 4.5 | Gosho is graduated with 4.375<br>Mara is graduated with 5.125<br>Pesho is graduated with 5.25 |
| 5<br>Gruio<br>4.36 5.50 3.30 5.63 2.57 5.75 2.81 4.89 <br>Trendafilka<br>3.10 5.35 3.30 3.35 5.64 4.99 2.75 4.68 <br>Mite<br>3.45 3.23 3.03 5.42 5.46 4.15 2.26 5.95 <br>Roza<br>2.08 3.48 3.36 2.73 2.96 4.54 3.70 3.85<br>Ganio<br>4.75 4.92 3.78 4.79 4.82 4.75 2.81 2.13 | Ganio is graduated with 4.09375<br>Gruio is graduated with 4.351249999999999<br>Mite is graduated with 4.11875<br>Roza is graduated with 3.3375<br>Trendafilka is graduated with 4.145 |

### Hints

- Think about **proper type** of map
- **Value** can be **array**
- **Nested loop** and one more **variable** will be need for average score

# Exercises: Sets and Maps Advanced

This document defines the exercises for [&quot;Java Advanced&quot; course @ Software University](https://softuni.bg/modules/59/java-advanced). You can check your solutions in [Judge](https://judge.softuni.bg/Contests/1463/Sets-And-Maps-Exercises).

## 1. Unique Usernames

Write a simple program that reads from the console a sequence of usernames and keeps a collection with only the unique ones. Print the collection on the console in order of insertion:

### Examples

| Input | Output |
|-|-|
| 6<br>Ivan<br>Ivan<br>Ivan<br>SemoMastikata<br>Ivan<br>Hubaviq1234 | Ivan<br>SemoMastikata<br>Hubaviq1234 |
| 10<br>Pesho<br>Mara<br>Pesho<br>Gosho<br>Stamat<br>Mara<br>Sashka<br>Pesho<br>Stamat<br>Gosho | Pesho<br>Mara<br>Gosho<br>Stamat<br>Sashka |

## 2. Sets of Elements

On the first line you are given the length of two sets n and m. On the next n + m lines there are n numbers that are in the first set and m numbers that are in the second one. Find all non-repeating element that appears in both of them, and print them in same order at the console:

Set with length n = 4: {1, **3** , **5** , 7}
Set with length m = 3: { **3** , 4, **5** }
Set that contains all repeating elements -> { **3** , **5** }

### Examples

| Input                                  | Output |
|----------------------------------------|--------|
| 4 3<br>1<br>3<br>5<br>7<br>3<br>4<br>5 | 3 5    |
| 2 2<br>1<br>3<br>1<br>5                | 1      |

## 3. Periodic Table

You are given an n number of chemical compounds. You need to keep track of all chemical elements used in the compounds and at the end print all unique ones in ascending order:

### Examples

| Input                               | Output              |
|-------------------------------------|---------------------|
| 4<br>Ce O<br>Mo O Ce<br>Ee<br>Mo    | Ce Ee Mo O          |
| 3<br>Ge Ch O Ne<br>Nb Mo Tc<br>O Ne | Ch Ge Mo Nb Ne O Tc |

## 4. Count Symbols

Write a program that reads some text from the console and counts the occurrences of each character in it. Print the results in **alphabetical** (lexicographical) order.

### Examples

| Input | Output |
|-|-|
| SoftUni rocks | : 1 time/s<br>S: 1 time/s<br>U: 1 time/s<br>c: 1 time/s<br>f: 1 time/s<br>i: 1 time/s<br>k: 1 time/s<br>n: 1 time/s<br>o: 2 time/s<br>r: 1 time/s<br>s: 1 time/s<br>t: 1 time/s |
| Did you know Math.Round rounds to the nearest even integer? | : 9 time/s<br>.: 1 time/s<br>?: 1 time/s<br>D: 1 time/s<br>M: 1 time/s<br>R: 1 time/s<br>a: 2 time/s<br>d: 3 time/s<br>e: 7 time/s<br>g: 1 time/s<br>h: 2 time/s<br>i: 2 time/s<br>k: 1 time/s<br>n: 6 time/s<br>o: 5 time/s<br>r: 3 time/s<br>s: 2 time/s<br>t: 5 time/s<br>u: 3 time/s<br>v: 1 time/s<br>w: 1 time/s<br>y: 1 time/s |

## 5. Phonebook

Write a program that receives some info from the console about **people** and their **phone numbers**.

You are free to choose the manner in which the data is entered; each **entry** should have just **one name** and **one number** (both of them strings). If you receive a name that **already exists** in the phonebook, simply update its number.

After filling this simple phonebook, upon receiving the **command** &quot;**search**&quot;, your program should be able to perform a search of a contact by name and print her details in format &quot;**{name} -> {number}**&quot;. In case the contact isn&#39;t found, print &quot;**Contact {name} does not exist.**&quot; Examples:

### Examples

| Input | Output |
|-|-|
| Nakov-0888080808<br>search<br>Mariika<br>Nakov<br>stop | Contact Mariika does not exist.<br>Nakov -> 0888080808 |
| Nakov-+359888001122<br>RoYaL(Ivan)-666<br>Gero-5559393<br>Simo-02/987665544<br>search<br>Simo<br>simo<br>RoYaL<br>RoYaL(Ivan)<br>stop | Simo -> 02/987665544<br>Contact simo does not exist.<br>Contact RoYaL does not exist.<br>RoYaL(Ivan) -> 666 |

## 6. A Miner Task

You are given a sequence of strings, each on a **new line**. Every **odd** line on the console is representing a **resource**(e.g. Gold, Silver, Copper, and so on) , and every **even – quantity**. Your task is to **collect** the resources and print them each on a **new line**.

**Print the resources and their quantities in format:**
**{resource} –> {quantity}**

The quantities inputs will be in the **range** [1 … 2 000 000 000]

### Examples

| Input | Output |
|-|-|
| Gold<br>155<br>Silver<br>10<br>Copper<br>17<br>stop | Gold -> 155<br>Silver -> 10<br>Copper -> 17 |

## 7. Fix Emails

You are given a sequence of strings, each on a new line, **until you receive &quot;stop&quot; command**. First string is a **name** of a person. On the second line you receive his **email**. Your task is to **collect** their names and emails, and **remove** emails whose domain ends with &quot;us&quot;, &quot;uk&quot; or &quot;com&quot; (case insensitive). 

Print: **{name} –> {email}**

### Examples

| Input | Output |
|-|-|
| Ivan<br>ivanivan@abv.bg<br>Petar Ivanov<br>petartudjarov@abv.bg<br>Mike Tyson<br>myke@gmail.us<br>stop  | Ivan -> ivanivan@abv.bg<br>Petar Ivanov -> petartudjarov@abv.bg |
| Ivan<br>ivanivan@gmail.com<br>Petar Ivanov<br>petartudjarov@yahoo.com<br>Mike Tyson<br>myke@abv.bg<br>stop | Mike Tyson -> myke@abv.bg |

## 8. Hands of Cards

You are given a sequence of people and for every person what **cards** he draws from the deck. The input will be **separate** lines in the **format** :

**{personName}: {PT, PT, PT,… PT}**

Where P (2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A) is the power of the card and T (S, H, D, C) is the type. The input ends when a **&quot;JOKER&quot;** is drawn. The name can contain any ASCII symbol except **&#39;:&#39;**. The input will always be valid and in the format described, there is no need to check it.

A single person **cannot have more than one** card with the same power and type, if he draws such a card he **discards** it. The people are playing with **multiple decks** . Each card has a value that is **calculated** by the power multiplied by the type. Powers **2 to 10** have the same value and **J to A** are **11 to 14**. Types are mapped to multipliers the following way (**S -> 4, H-> 3, D -> 2, C -> 1**).

Finally print out the **total value each player** has in his hand in the format:

**{personName}: {value}**

### Examples

| Input | Output |
|-|-|
| Pesho: 2C, 4H, 9H, AS, QS<br>Slav: 3H, 10S, JC, KD, 5S, 10S<br>Peshoslav: QH, QC, QS, QD<br>Slav: 6H, 7S, KC, KD, 5S, 10C<br>Peshoslav: QH, QC, JS, JD, JC<br>Pesho: JD, JD, JD, JD, JD, JD<br>JOKER | Pesho: 167<br>Slav: 175<br>Peshoslav: 197 |

## 9. \* User Logs

Marian is a famous system administrator. The person to overcome the security of his servers has not yet been born. However, there is a new type of threat where users flood the server with messages and are hard to be detected since they change their IP address all the time. Well, Marian is a system administrator and is not so into programming. Therefore, he needs a skillful programmer to track the user logs of his servers. You are the chosen one to help him!

You are given an input in the format:

**IP=(IP.Address) message=(A&amp;sample&amp;message) user=(username)**

Your task is to **parse** the **IP** and the **username** from the input and for **every user** , you have to display **every IP** from which the corresponding user has sent a message and the **count of the messages** sent with the corresponding IP. In the output, the usernames must be **sorted alphabetically** while their IP addresses should be displayed in the **order of their first appearance.** The output should be in the following format:

**username:**
**IP => count, IP => count.**

For example, given the following input - **IP=192.23.30.40 message=&#39;Hello&amp;derps.&#39; user=destroyer** , you have to get theusername **destroyer** and the IP **192.23.30.40** and display it in the following format:

**destroyer:**
**192.23.30.40 => 1.**

The username destroyer has sent a message from IP 192.23.30.40 once.

Check the examples below. They will further clarify the assignment.

### Input

The input comes from the console as **varying number** of lines. You have to parse every command until the command that follows is **end.** The input will be in the format displayed above, there is no need to check it explicitly.

### Output

For every user found, you have to display each log in the format:

**username:**
**IP => count, IP => count…**

The IP addresses must be split with a comma, and each line of IP addresses must end with a dot.

### Constraints

- The number of commands will be in the range [1..50]
- The IP addresses will be in the format of either **IPv4** or **IPv6.**
- The messages will be in the format: **This&amp;is&amp;a&amp;message**
- The username will be a string with length in the range [3..50]
- Time limit: 0.3 sec. Memory limit: 16 MB.

### Examples

| Input | Output |
|-|-|
| IP=192.23.30.40 message='Hello&derps.' user=destroyer<br>IP=192.23.30.41 message='Hello&yall.' user=destroyer<br>IP=192.23.30.40 message='Hello&hi.' user=destroyer<br>IP=192.23.30.42 message='Hello&Dudes.' user=destroyer<br>end | destroyer: <br>192.23.30.40 => 2, 192.23.30.41 => 1, 192.23.30.42 => 1. |
| IP=FE80:0000:0000:0000:0202:B3FF:FE1E:8329 message='Hey&son' user=mother<br>IP=192.23.33.40 message='Hi&mom!' user=child0<br>IP=192.23.30.40 message='Hi&from&me&too' user=child1<br>IP=192.23.30.42 message='spam' user=destroyer<br>IP=192.23.30.42 message='spam' user=destroyer<br>IP=192.23.50.40 message='' user=yetAnotherUsername<br>IP=192.23.50.40 message='comment' user=yetAnotherUsername<br>IP=192.23.155.40 message='Hello.' user=unknown<br>end | child0: <br>192.23.33.40 => 1.<br>child1: <br>192.23.30.40 => 1.<br>destroyer: <br>192.23.30.42 => 2.<br>mother: <br>FE80:0000:0000:0000:0202:B3FF:FE1E:8329 => 1.<br>unknown: <br>192.23.155.40 => 1.<br>yetAnotherUsername: <br>192.23.50.40 => 2. |

## 10. \* Population Counter

So many people! It&#39;s hard to count them all. But that&#39;s your job as a statistician. You get raw data for a given city and you need to aggregate it.

On each input line you&#39;ll be given data in format: **&quot;city|country|population&quot;**. There will be **no redundant whitespaces anywhere** in the input. Aggregate the data **by country and by city** and print it on the console. **For each** country, print its **total population** and on separate lines the data for each of its cities. **Countries** should be ordered by **their total population in descending order** and within each country, the **cities** should be ordered by **the same criterion**. If two countries/cities have the same population, keep them inthe **order in which they were** entered. Check out the examples; follow the output format strictly!

### Input

- The input data should be read from the console.
- It consists of a variable number of lines and ends when the command &quot;**report**&quot; is received.
- The input data will always be valid and in the format described. There is no need to check it explicitly.

### Output

- The output should be printed on the console.
- Print the aggregated data for each country and city in the format shown below.

### Constraints

- The name of the city, country and the population count will be separated from each other by **a pipe (&#39;|&#39;)**.
- The **number of input lines** will be in the range [2 … 50].
- A city-country pair will not be repeated.
- The **population count** of each city will be an integer in the range [0 … 2 000 000 000].
- Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.

### Examples

| Input | Output |
|-|-|
| Sofia\|Bulgaria\|1000000<br>report | Bulgaria (total population: 1000000)<br>=>Sofia: 1000000 |
| Sofia\|Bulgaria\|1<br>Veliko Tarnovo\|Bulgaria\|2<br>London\|UK\|4<br>Rome\|Italy\|3<br>report | UK (total population: 4)<br>=>London: 4<br>Bulgaria (total population: 3)<br>=>Veliko Tarnovo: 2<br>=>Sofia: 1<br>Italy (total population: 3)<br>=>Rome: 3 |

## 11. \* Logs Aggregator

You are given a sequence of access logs in format **<IP><user><duration>**. For example:

- 168.0.11 peter 33
- 10.17.33 alex 12
- 10.17.35 peter 30
- 10.17.34 peter 120
- 10.17.34 peter 120
- 50.118.81 alex 46
- 50.118.81 alex 4

Write a program to aggregate the logs data and print **for each user** the **total duration** of his sessions and a **list of unique IP addresses** in format &quot;**<user>:<duration>[<IP1>, <IP2>, …]**&quot;. Order the **users alphabetically**. Order the **IPs alphabetically**. In our example, the output should be the following:

- alex: 62 [10.10.17.33, 212.50.118.81]
- peter: 303 [10.10.17.34, 10.10.17.35, 192.168.0.11]

### Input

The input comes from the console. At the first line a number **n** stays which says how many log lines will follow. Each of the next n lines holds a log information in format **<IP><user><duration>**. The input data will always be **valid** and in the format described. There is no need to check it explicitly.

### Output

Print **one line for each user** (order users alphabetically). For each user print its sum of durations and all of his sessions&#39; IPs, ordered alphabetically in format **<user>:<duration>[<IP1>, <IP2>, …]**. Remove any duplicated values in the IP addresses and order them alphabetically (like we order strings).

### Constraints

- The **count** of the order lines **n** is in the range [1…1000].
- The **<IP>** is a standard IP address in format **a.b.c.d** where **a** , **b** , **c** and **d** are integers in the range [0…255].
- The **<user>** consists of only of **Latin characters** , with length of [1…20].
- The **<duration>** is an integer number in the range [1…1000].
- Time limit: 0.3 sec. Memory limit: 16 MB.

### Examples

| Input | Output |
|-|-|
| 7<br>192.168.0.11 peter 33<br>10.10.17.33 alex 12<br>10.10.17.35 peter 30<br>10.10.17.34 peter 120<br>10.10.17.34 peter 120<br>212.50.118.81 alex 46<br>212.50.118.81 alex 4 | alex: 62 [10.10.17.33, 212.50.118.81]<br>peter: 303 [10.10.17.34, 10.10.17.35, 192.168.0.11] |
| 2<br>84.238.140.178 nakov 25<br>84.238.140.178 nakov 35 | nakov: 60 [84.238.140.178] |

## 12. \* Legendary Farming

You&#39;ve beaten all the content and the last thing left to accomplish is own a legendary item. However, it&#39;s a tedious process and requires quite a bit of farming. Anyway, you are not too pretentious – any legendary will do. The possible items are:

- **Shadowmourne** – requires **250 Shards** ;
- **Valanyr** – requires **250 Fragments** ;
- **Dragonwrath** – requires **250 Motes** ;

**Shards, Fragments** and **Motes** are the **key materials** , all else is **junk.** You will be given lines of input, such as
**2 motes 3 ores 15 stones.** Keep track of the **key materials -** the **first** that reaches the **250 mark wins** the **race**. At that point, print the corresponding legendary obtained. Then, print the **remaining** shards, fragments, motes, ordered by **quantity** in **descending** order, each on a new line. Finally, print the collected **junk** items, in **alphabetical** order.

### Input

- Each line of input is in format **{quantity} {material} {quantity} {material} … {quantity} {material}**

### Output

- On the first line, print the obtained item in format **{Legendary item} obtained!**
- On the next three lines, print the remaining key materials in descending order by quantity
  - If two key materials have the same quantity, print them in alphabetical order
- On the final several lines, print the junk items in alphabetical order
  - All materials are printed in format **{material}: {quantity}**
  - All output should be **lowercase** , except the first letter of the legendary

### Constraints

- The quantity-material pairs are between 1 and 25 per line.
- The number of lines is in range [1..10]
- All materials are case-insensitive.
- Allowed working time: 0.25s
- Allowed memory: 16 MB

### Examples

| Input | Output |
|-|-|
| 3 Motes 5 stones 5 Shards<br>6 leathers 255 fragments 7 Shards | Valanyr obtained!<br>fragments: 5<br>shards: 5<br>motes: 3<br>leathers: 6<br>stones: 5 |
| 123 silver 6 shards 8 shards 5 motes<br>9 fangs 75 motes 103 MOTES 8 Shards<br>86 Motes 7 stones 19 silver | Dragonwrath obtained!<br>shards: 22<br>motes: 19<br>fragments: 0<br>fangs: 9<br>silver: 123 |

## 13. \*\* Сръбско Unleashed

Admit it – the СРЪБСКО is your favorite sort of music. You never miss a concert and you have become quite the geek concerning everything involved with СРЪБСКО. You can&#39;t decide between all the singers you know who your favorite one is. One way to find out is to keep a statistics of how much money their concerts make. Write a program that does all the boring calculations for you.

On each input line you&#39;ll be given data in format: **&quot;singer @venue ticketsPrice ticketsCount&quot;**. There will be **no redundant whitespaces anywhere** in the input. Aggregate the data **by venue and by singer**. For each venue, print the singer and the **total amount** of money his/her concerts have made on a separate line. **Venues** should be kept in the **same order** they were entered, the **singers** should be **sorted by how much money** they have made in **descending order**. If two singers have made the same amount of money, keep them **in the order** **in which they were entered.**

Keep in mind that if a line is in **incorrect format**, it should be **skipped** and its data should not be added to the output. Each of the four tokens must be separated by **a space**, everything else is **invalid**. The venue should be denoted with **@** in front of it, such as @Sunny Beach

**SKIP THOSE** : Ceca@Belgrade125 12378, Ceca @Belgrade12312 123

The singer and town name may consist of one to three words.

### Input

- The input data should be read from the console.
- It consists of a variable number of lines and ends when the command &quot;**End**&quot; is received.
- The input data will always be valid and in the format described. There is no need to check it explicitly.

### Output

- The output should be printed on the console.
- Print the aggregated data for each venue and singer in the format shown below.
- Format for singer lines is **#{2\*space}{singer}{space}->{space}{total money}**

### Constraints

- The **number of input lines** will be in the range [2 … 50].
- The **ticket price** will be an integer in the range [0 … 200].
- The **ticket count** will be an integer in the range [0 … 100 000]
- **Singers** and **venues** are case sensitive
- Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.

### Examples

| Input | Output |
|-|-|
| Lepa Brena @Sunny Beach 25 3500<br>Dragana @Sunny Beach 23 3500<br>Ceca @Sunny Beach 28 3500<br>Mile Kitic @Sunny Beach 21 3500<br>Ceca @Sunny Beach 35 3500<br>Ceca @Sunny Beach 70 15000<br>Saban Saolic @Sunny Beach 120 35000<br>End | Sunny Beach<br>#  Saban Saolic -> 4200000<br>#  Ceca -> 1270500<br>#  Lepa Brena -> 87500<br>#  Dragana -> 80500<br>#  Mile Kitic -> 73500 |
| Lepa Brena @Sunny Beach 25 3500<br>Dragana@Belgrade23 3500<br>Ceca @Sunny Beach 28 3500<br>Mile Kitic @Sunny Beach 21 3500<br>Ceca @Belgrade 35 3500<br>Ceca @Sunny Beach 70 15000<br>Saban Saolic @Sunny Beach 120 35000<br>End | Sunny Beach<br>#  Saban Saolic -> 4200000<br>#  Ceca -> 1148000<br>#  Lepa Brena -> 87500<br>#  Mile Kitic -> 73500<br>Belgrade<br>#  Ceca -> 122500 |

## 14. \*\*\* Dragon Army

Heroes III is the best game ever. Everyone loves it and everyone plays it all the time. Stamat is no exclusion to this rule. His favorite units in the game are all **types** of dragons – black, red, gold, azure etc… He likes them so much that he gives them **names** and keeps logs of their **stats** : **damage, health** and **armor**. The process of aggregating all the data is quite tedious, so he would like to have a program doing it. Since he is no programmer, it&#39;s your task to help him

You need to categorize dragons by their **type**. For each dragon, identified by **name,** keep information about his **stats.** Type is **preserved** as in the order of input, but dragons are **sorted** alphabetically by name. For each type, you should also print the average **damage** , **health** and **armor** of the dragons. For each dragon, print his own stats.

There **may** be **missing** stats in the input, though. If a stat is missing you should assign it default values. Default values are as follows: health **250** , damage **45** , and armor **10**. Missing stat will be marked by **null**.

The input is in the following format **{type} {name} {damage} {health} {armor}.** Any of the integers may be assigned null value. See the examples below for better understanding of your task.

If the same dragon is added a second time, the new stats should **overwrite** the previous ones. Two dragons are considered **equal** if they match by **both** name and type.

### Input

- On the first line, you are given number N -> the number of dragons to follow
- On the next N lines you are given input in the above described format. There will be single space separating each element.

### Output

- Print the aggregated data on the console
- For each type, print average stats of its dragons in format **{Type}::({damage}/{health}/{armor})**
- Damage, health and armor should be rounded to two digits after the decimal separator
- For each dragon, print its stats in format **-{Name} -> damage: {damage}, health: {health}, armor: {armor}**

### Constraints

- N is in range [1…100]
- The dragon type and name are one word only, starting with capital letter.
- Damage health and armor are integers in range [0 … 100000] or **null**

### Examples

| Input | Output |
|-|-|
| 5<br>Red Bazgargal 100 2500 25<br>Black Dargonax 200 3500 18<br>Red Obsidion 220 2200 35<br>Blue Kerizsa 60 2100 20<br>Blue Algordox 65 1800 50 | Red::(160.00/2350.00/30.00)<br>-Bazgargal -> damage: 100, health: 2500, armor: 25<br>-Obsidion -> damage: 220, health: 2200, armor: 35<br>Black::(200.00/3500.00/18.00)<br>-Dargonax -> damage: 200, health: 3500, armor: 18<br>Blue::(62.50/1950.00/35.00)<br>-Algordox -> damage: 65, health: 1800, armor: 50<br>-Kerizsa -> damage: 60, health: 2100, armor: 20 |
| 4<br>Gold Zzazx null 1000 10<br>Gold Traxx 500 null 0<br>Gold Xaarxx 250 1000 null<br>Gold Ardrax 100 1055 50 | Gold::(223.75/826.25/17.50)<br>-Ardrax -> damage: 100, health: 1055, armor: 50<br>-Traxx -> damage: 500, health: 250, armor: 0<br>-Xaarxx -> damage: 250, health: 1000, armor: 10<br>-Zzazx -> damage: 45, health: 1000, armor: 10 |
