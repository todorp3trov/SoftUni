# Programming Fundamentals Final Exam 09.08.2020

## Problem 1. World Tour

_You are a world traveller and_ _your next goal is to make a world tour. In order to do that, you have to plan out everything first. To start with, you would like to plan out all of your stops where you will have a break._

On the **first line** you will be given a string containing all of your **stops**. Until you receive the command **&quot;Travel&quot;** , you will be given some commands to **manipulate** that initial string. The **commands can be** :

- **Add Stop:{index}:{string}** – **insert** the given **string** at that **index** only if the index **is valid**
- **Remove Stop:{start\_index}:{end\_index}** – **remove** the elements of the string from the **starting index** to the **end index** ( **inclusive** ) if **both** indices are **valid**
- **Switch:{old\_string}:{new\_string}** – if the **old string** is in the initial string, **replace** it with the **new one**. (all **occurrences** )

_**Note: After each command print the current state of the string**_

After the **&quot;Travel&quot;** command, print the following: **&quot;Ready for world tour! Planned stops: {string}&quot;**

### Input / Constraints

- **JavaScript: you will receive a list of strings**

### Output

- Print the proper output messages in the proper cases as described in the problem description

### Examples

| Input | Output |
|-|-|
| Hawai::Cyprys-Greece<br>Add Stop:7:Rome<br>Remove Stop:11:16<br>Switch:Hawai:Bulgaria<br>Travel | Hawai::RomeCyprys-Greece<br>Hawai::Rome-Greece<br>Bulgaria::Rome-Greece<br>Ready for world tour! Planned stops: Bulgaria::Rome-Greece |

## Problem 2. Destination Mapper

_Now that you have planned out your tour, you are ready to go! Your next task is to mark all the points on the map that you are going to visit._

You will be given a **string** representing some **places** on the map. You have to **filter** only the **valid ones**. A valid location is:

- Surrounded by **&quot;=&quot;** or **&quot;/&quot;** on **both sides** (the **first** and the **last** symbols must **match** )
- After the **first**  **&quot;=&quot;** or **&quot;/&quot;** there should be **only letters** (the **first** must be **upper-case** )
- The **letters** must be **at least 3**

**Example** : In the string **&quot;=Hawai=/Cyprus/=Invalid/invalid==i5valid=/I5valid/=i=&quot;** only the **first two** locations are valid.

After you have **matched** all the **valid locations** , you have to **calculate travel points**. They are calculated by **summing** the **lengths** of all the **valid destinations** that you have found on the map. At the end, on the **first line** print the following: **&quot;Destinations: {destinations joined by &#39;, &#39;**. On the **second line** print **&quot;Travel Points: {travel\_points}&quot;**.

### Input / Constraints

- **You will recive a string representing the locations on the map**
- **JavaScript: you will receive a single parameter: string**

### Output

- Print the **messages described above**

### Examples

| Input                                                 | Output                                           |
|-------------------------------------------------------|--------------------------------------------------|
| =Hawai=/Cyprus/=Invalid/invalid==i5valid=/I5valid/=i= | Destinations: Hawai, Cyprus<br>Travel Points: 11 |
| ThisIs some InvalidInput                              | Destinations:<br>Travel Points: 0                |

## Problem 3. Plant Discovery

_You have now returned from your world tour. On your way you have discovered some new plants and you want to gather some information about them and create an exhibition to see which plant is highest rated._

On the **first line** you will receive a number **n**. On the next **n**  **lines** , you will be given some information about the plants that you have discovered in the format: **&quot;{plant}<->{rarity}&quot;**. **Store** that **information** , because you will need it later. If you receive a plant **more than once** , **update** its rarity.

After that until you receive the **command** **&quot;Exhibition&quot;** you will be given some of these **commands**:

- **Rate: {plant} - {rating}** – **add** the given **rating** to the plant ( **store all ratings** )
- **Update: {plant} - {new\_rarity}** – **update** the **rarity** of the plant with the **new one**
- **Reset: {plant}** – **remove all** the **ratings** of the given plant

_**Note: If any of the command is invalid, print &quot;error&quot;**_

After the command **&quot;Exhibition&quot;** print the information that you have about the plants in the following format:
**Plants for the exhibition:**
- **{plant\_name}; Rarity: {rarity}; Rating: {average\_rating formatted to the 2nd digit}
 …**

The plants should be **sorted** by **rarity descending** , then by **average rating descending**

### Input / Constraints

- **You will recive the input as described above**
- **JavaScript: you will receive a list of strings**

### Output

- Print the **information** about all plants as **described above**

### Examples

| Input | Output |
|-|-|
| 3<br>Arnoldii<->4<br>Woodii<->7<br>Welwitschia<->2<br>Rate: Woodii - 10<br>Rate: Welwitschia - 7<br>Rate: Arnoldii - 3<br>Rate: Woodii - 5<br>Update: Woodii - 5<br>Reset: Arnoldii<br>Exhibition | Plants for the exhibition:<br>- Woodii; Rarity: 5; Rating: 7.50<br>- Arnoldii; Rarity: 4; Rating: 0.00<br>- Welwitschia; Rarity: 2; Rating: 7.00 |
| 2<br>Candelabra<->10<br>Oahu<->10<br>Rate: Oahu - 7<br>Rate: Candelabra - 6<br>Exhibition | Plants for the exhibition:<br>- Oahu; Rarity: 10; Rating: 7.00<br>- Candelabra; Rarity: 10; Rating: 6.00 |
