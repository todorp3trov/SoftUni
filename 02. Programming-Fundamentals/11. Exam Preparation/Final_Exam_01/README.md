# Programming Fundamentals Final Exam Retake 15.08.2020

## Problem 1. The Imitation Game

_You are a mathematician during world war 2, who has joined the cryptography team to decipher the enemy&#39;s enigma code. Your job is to create a program to crack the codes._

On the first line of the input you will receive the **encrypted message**. After that, until the **&quot;Decode&quot;** command is given, **you will be receiving strings** with **instructions** for different **operations** that need to be performed upon the **concealed message** to **interpret** it and reveal its true content. There are several types of instructions, split by **&#39;|&#39;**

- **Move {number of letters}**
  - Moves the first n letters to the back of the string.
- **Insert {index} {value}**
  - Inserts the given value before the given index in the string.
- **ChangeAll {substring} {replacement}**
  - Changes all occurrences of the given substring with the replacement text.

### Input / Constraints

- On the first line, you will receive a string with message.
- On the next lines, you will be receiving commands, split by **&#39;|&#39; .**

### Output

- After the **&quot;Decode&quot;** command is received, print this message:
&quot;**The decrypted message is: {message}**&quot;

### Examples

| Input | Output |
|-|-|
| zzHe<br>ChangeAll\|z\|l<br>Insert\|2\|o<br>Move\|3<br>Decode | The decrypted message is: Hello |
| **Comment** |  |
| ChangeAll\|z\|l<br>zzHe → llHe (We replace all occurrences of 'z' with 'l')<br>Insert\|2\|o<br>llHe → lloHe (We add an 'o' before the character on index 2)<br>Move\|3<br>lloHe → Hello (We take the first three characters and move them to the end of the string)<br>Finally, after receiving the "Decode" command, we print the resulting message. |  |
| **Input** | **Output** |
| owyouh<br>Move\|2<br>Move\|3<br>Insert\|3\|are<br>Insert\|9\|?<br>Decode | The decrypted message is: howareyou? |

## Problem 2. Ad Astra

_You are an astronaut who just embarked on a mission across the solar system. Since you will be in space for a long time, you have packed a lot of food with you. Create a program, which helps you identify how much food you have left and gives you information about its expiration date._

On the first line of the input you will be given a **text string**. You must extract the information about the food **and calculate the total calories.**

First you must **extract the food info**. It will always follow the same pattern rules:

- It will be surrounded by **&quot;|&quot;** or **&quot;#&quot;** (only one of the two) in the following pattern:
**#{item name}#{expiration date}#{calories}#** or
**|{item name}|{expiration date}|{calories}|**
- The item name will contain **only lowercase and uppercase letters and whitespace**
- The expiration date will always follow the pattern: **{day}/{month}/{year} , where the day, month and year will be exactly two digits long**
- The calories will be **an integer between 0-10000**

Calculate **the total calories of all food items** and then determine **how many days you can last with the food you have**. Keep in mind that **you need 2000kcal a day**.

### Input / Constraints

- **You will receive a single string**

### Output

- First print **the amount of days** you will be able to last with the food you have:

**&quot;You have food to last you for: {days} days!&quot;**

- **The output for each food item should look like this:**
**&quot;Item: {item name}, Best before: {expiration date}, Nutrition: {calories}&quot;**

### Examples

| Input | Output |
|-|-|
| #Bread#19/03/21#4000#\|Invalid\|03/03.20\|<br>\|Apples\|08/10/20\|200\|\|Carrots\|06/08/20\|500\|\|Not right\|6.8.20\|5\| | You have food to last you for: 2 days!<br>Item: Bread, Best before: 19/03/21, Nutrition: 4000<br>Item: Apples, Best before: 08/10/20, Nutrition: 200<br>Item: Carrots, Best before: 06/08/20, Nutrition: 500 |
| **Comment** |  |
| We have a total of three matches – bread, apples and carrots. <br>The sum of their calories is 4700. Since you need 2000kcal <br>a day, we divide 4700/2000, which means this food will <br>last you for 2 days.<br>We print each item |  |
| **Input** | **Output** |
| $$#@@%^&#Fish#24/12/20#8500#\|#Incorrect#19.03.20#450<br>\|$5*(@!#Ice Cream#03/10/21#9000#^#@aswe\|Milk\|05/09/20\|2000\| | You have food to last you for: 9 days!<br>Item: Fish, Best before: 24/12/20, Nutrition: 8500<br>Item: Ice Cream, Best before: 03/10/21, Nutrition: 9000<br>Item: Milk, Best before: 05/09/20, Nutrition: 2000 |
| **Comment** |  |
| We have three matches. The total calories are <br>8500 + 9000 + 2000 = 19500, which means <br>you have food for a total of 9 days. |  |
| **Input** | **Output** |
| Hello\|#Invalid food#19/03/20#450\|$5*(@ | You have food to last you for: 0 days! |
| **Comment** |  |
| We have no matches, which means we have no food.<br>The colored text is not a match, since it doesn't have a # at the end. |  |

## Problem 3. The Pianist

_You are a pianist and you like to keep a list of your favorite piano pieces. Create a program, to help you organize it and add, change, remove pieces from it!_

On the first line of the standard input you will receive an integer **n** – the **number of pieces** that you will initially have. On the next **n** lines the **pieces themselves** will follow with their **composer** and **key** , separated by **&quot;|&quot;** in the following format:

**{piece}|{composer}|{key}**

Then, you will be receiving different **commands** , each on a new line, separated by **&quot;|&quot;,** until the **&quot;Stop&quot;** command is given:

- **Add|{piece}|{composer}|{key}**
  - You need to **add the given piece** with the information about it to the other pieces
  - If the piece **is already in the collection** , print:
&quot;**{piece} is already in the collection!**&quot;
  - If the piece is **not in the collection** , print:
&quot;**{piece} by {composer} in {key} added to the collection!&quot;**
- **Remove|{piece}**
  - If the piece is in the collection, **remove it** and print:
**&quot;Successfully removed {piece}!&quot;**
  - If the piece is **not in the collection** , print:
**&quot;Invalid operation! {piece} does not exist in the collection.&quot;**

- **ChangeKey|{piece}|{new key}**
   - If the piece is in the collection, **change its key with the given one** and print:
**&quot;Changed the key of {piece} to {new key}!&quot;**
  - If the piece is **not in the collection** , print:
**&quot;Invalid operation! {piece} does not exist in the collection.&quot;**

Upon receiving the **&quot;Stop&quot;** command you need to print all pieces in your collection, sorted by their **name and by the name of their composer in alphabetical order** , in the following format:
&quot;**{Piece} -> Composer: {composer}, Key: {key}**&quot;

### Input/Constraints

- You will receive **a single integer** at first – **the initial number of pieces in the collection**
- For each piece you will receive a single line of text with information about it.
- Then you will receive multiple commands in the way described above, until the command &quot;Stop&quot;.

### Output

- All the output messages with the appropriate formats are described in the problem description.

### Examples

| Input | Output |
|-|-|
| 3<br>Fur Elise\|Beethoven\|A Minor<br>Moonlight Sonata\|Beethoven\|C# Minor<br>Clair de Lune\|Debussy\|C# Minor<br>Add\|Sonata No.2\|Chopin\|B Minor<br>Add\|Hungarian Rhapsody No.2\|Liszt\|C# Minor<br>Add\|Fur Elise\|Beethoven\|C# Minor<br>Remove\|Clair de Lune<br>ChangeKey\|Moonlight Sonata\|C# Major<br>Stop | Sonata No.2 by Chopin in B Minor added to the collection!<br>Hungarian Rhapsody No.2 by Liszt in C# Minor added to the collection!<br>Fur Elise is already in the collection!<br>Successfully removed Clair de Lune!<br>Changed the key of Moonlight Sonata to C# Major!<br>Fur Elise -> Composer: Beethoven, Key: A Minor<br>Hungarian Rhapsody No.2 -> Composer: Liszt, Key: C# Minor<br>Moonlight Sonata -> Composer: Beethoven, Key: C# Major<br>Sonata No.2 -> Composer: Chopin, Key: B Minor |
| **Comment** |  |
| After we receive the initial pieces with their info, we start <br>receiving commands. The first two commands are to add a piece <br>to the collection and since the pieces are not already added, <br>we manage to add them. The third add command, however, attempts <br>to add a piece, which is already in the collection, so we print <br>a special message and don't add the piece. After that we receive <br>the remove command and since the piece is in the collection, we <br>remove it successfully.<br>Finally, the last command says to change the key of a piece. <br>Since the key is present in the collection, we modify its key. <br>We receive the Stop command, print the information about the <br>pieces, sorted in the way described above, and the program ends. |  |
| **Input** | **Output** |
| 4<br>Eine kleine Nachtmusik\|Mozart\|G Major<br>La Campanella\|Liszt\|G# Minor<br>The Marriage of Figaro\|Mozart\|G Major<br>Hungarian Dance No.5\|Brahms\|G Minor<br>Add\|Spring\|Vivaldi\|E Major<br>Remove\|The Marriage of Figaro<br>Remove\|Turkish March<br>ChangeKey\|Spring\|C Major<br>Add\|Nocturne\|Chopin\|C# Minor<br>Stop | Spring by Vivaldi in E Major added to the collection!<br>Successfully removed The Marriage of Figaro!<br>Invalid operation! Turkish March does not exist in the collection.<br>Changed the key of Spring to C Major!<br>Nocturne by Chopin in C# Minor added to the collection!<br>Eine kleine Nachtmusik -> Composer: Mozart, Key: G Major<br>Hungarian Dance No.5 -> Composer: Brahms, Key: G Minor<br>La Campanella -> Composer: Liszt, Key: G# Minor<br>Nocturne -> Composer: Chopin, Key: C# Minor<br>Spring -> Composer: Vivaldi, Key: C Major |
