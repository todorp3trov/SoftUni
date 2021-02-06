# Exercise: Objects and Classes

Problems for exercises and homework for the [&quot;Technology Fundamentals&quot; course @ SoftUni](https://softuni.bg/courses/programming-fundamentals).

You can check your solutions in [Judge.](https://judge.softuni.bg/Contests/1327)

## 1. Advertisement Message

Write a program that **generates random fake advertisement message** to extol some product. The messages must consist of 4 parts: **laudatory phrase + event + author + city**. Use the following predefined parts:

- **Phrases** – {&quot;Excellent product.&quot;, &quot;Such a great product.&quot;, &quot;I always use that product.&quot;, &quot;Best product of its category.&quot;, &quot;Exceptional product.&quot;, &quot;I can&#39;t live without this product.&quot;}
- **Events** – {&quot;Now I feel good.&quot;, &quot;I have succeeded with this product.&quot;, &quot;Makes miracles. I am happy of the results!&quot;, &quot;I cannot believe but now I feel awesome.&quot;, &quot;Try it yourself, I am very satisfied.&quot;, &quot;I feel great!&quot;}
- **Authors** – {&quot;Diana&quot;, &quot;Petya&quot;, &quot;Stella&quot;, &quot;Elena&quot;, &quot;Katya&quot;, &quot;Iva&quot;, &quot;Annie&quot;, &quot;Eva&quot;}
- **Cities** – {&quot;Burgas&quot;, &quot;Sofia&quot;, &quot;Plovdiv&quot;, &quot;Varna&quot;, &quot;Ruse&quot;}

The format of the output message is: **{phrase} {event} {author} – {city}**.

As an input, you take the **number of messages** to be generated. Print each random message on a separate line.

### Examples

| Input | Output |
|-|-|
| 3 | Such a great product. Now I feel good. Elena – Ruse<br>Excelent product. Makes miracles. I am happy of the results! Katya – Varna<br>Best product of its category. That makes miracles. Eva - Sofia |

## 2. Articles

Create an article class with the following properties:

- **Title** – a string
- **Content** – a string
- **Author** – a string

The class should have a constructor and the following methods:

- **Edit (new content**) – change the old content with the new one
- **ChangeAuthor (new author)** – change the author
- **Rename (new title)** – change the title of the article
- verride **ToString** – print the article in the following format:

**&quot;{title} - {content}:{author}&quot;**

Write a program that reads an article in the following format **&quot;{title}, {content}, {author}&quot;**. On the next line, you will get a number **n**. On the next **n lines,** you will get one of the following commands: **&quot;Edit: {new content}&quot;** ; **&quot;ChangeAuthor: {new author}&quot;** ; **&quot;Rename: {new title}&quot;**. At the end, print the final article.

### Example

| Input | Output |
|-|-|
| some title, some content, some author<br>3<br>Edit: better content<br>ChangeAuthor:  better author<br>Rename: better title | better title - better content: better author |

## 3. Opinion Poll

Using the Person class, write a program that reads from the console **N** lines of personal information and then prints all people whose **age** is **more than 30** years, **sorted in alphabetical order**.

**Note** : you can use **stream()** to filter people.

### Examples

| Input                                                                | Output                                    |
|----------------------------------------------------------------------|-------------------------------------------|
| 3<br>Pesho 12<br>Stamat 31<br>Ivan 48                                | Ivan - 48<br>Stamat – 31                  |
| 5<br>Nikolai 33<br>Yordan 88<br>Tosho 22<br>Lyubo 44<br>Stanislav 11 | Lyubo - 44<br>Nikolai - 33<br>Yordan – 88 |

## 4. Articles 2.0

Change the program from the second problem, so you can store a **list of articles**. You will not need the methods anymore ( **except the ToString method** ). On the **first line** , you will get a number **n**. On the **next n lines** , you will get some **articles in the same format** as the previous task ( **&quot;{title}, {content}, {author}&quot;** ). Finally, you will get **one** of the **three inputs** : **&quot;title&quot;, &quot;content&quot;, &quot;author&quot;**. You need to **order the articles** alphabetically based on the command and **print them sorted by the given criteria**.

### Example

| Input                                                                          | Output                                                            |
|--------------------------------------------------------------------------------|-------------------------------------------------------------------|
| 2<br>Science, planets, Bill<br>Article, content, Johnny<br>title               | Article - content: Johnny<br>Science - planets: Bill              |
| 3<br>title1, C, author1<br>title2, B, author2<br>title3, A, author3<br>content | title3 – A: author3<br>title2 – B: author2<br>title1 – C: author1 |

## 5. Students

Write a program that receives **n count of students** and **orders them by grade** (in **descending** ). Each student should have **first name** (string), **last name** (string) and **grade** (floating-point number).

### Input

- First line will be a number **n**
- Next **n** lines you will get a student info in the format **&quot;{first name} {second name} {grade}&quot;**

### Output

- Print each student in the following format **&quot;{first name} {second name}: {grade}&quot;**

### Example

| Input                                                                                 | Output                                                                               |
|---------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------|
| 4<br>Lakia Eason 3.90<br>Prince Messing 5.49<br>Akiko Segers 4.85<br>Rocco Erben 6.00 | Rocco Erben: 6.00<br>Prince Messing: 5.49<br>Akiko Segers: 4.85<br>Lakia Eason: 3.90 |

## 6. Vehicle Catalogue

You have to make a catalogue for vehicles. You will receive two types of vehicle - **car** or **truck**.

Until you receive the command &quot; **End**&quot; you will receive **lines** of **input** in the format:

**{typeOfVehicle} {model} {color} {horsepower}**

After the &quot; **End**&quot; command, you will start receiving **models** of **vehicles**. Print for every received vehicle its **data** in the format:

**Type: {typeOfVehicle} 
Model: {modelOfVehicle} 
Color: {colorOfVehicle} 
Horsepower: {horsepowerOfVehicle}**

When you receive the command &quot; **Close the Catalogue**&quot;, stop receiving input and print the **average horsepower** for the **cars** and for the **trucks** in the format:

**&quot;{typeOfVehicles} have average horsepower of {averageHorsepower}.&quot;**

The **average horsepower** is calculated by **dividing** the **sum** of **horsepower** for **all** vehicles of the type by the **total count** of **vehicles** from the **same type**.

Format the answer to the **2nd decimal point**.

### Constraints

- The type of vehicle will always be **car** or **truck**
- You will not receive the **same model twice**
- The received horsepower will be integer in the interval **[1…1000]**
- You will receive at most **50** vehicles
- **Single** whitespace will be used for **separator**

### Examples

| Input | Output |
|-|-|
| truck Man red 200<br>truck Mercedes blue 300<br>car Ford green 120<br>car Ferrari red 550<br>car Lamborghini orange 570<br>End<br>Ferrari<br>Ford<br>Man<br>Close the Catalogue | Type: Car<br>Model: Ferrari<br>Color: red<br>Horsepower: 550<br>Type: Car<br>Model: Ford<br>Color: green<br>Horsepower: 120<br>Type: Truck<br>Model: Man<br>Color: red<br>Horsepower: 200<br>Cars have average horsepower of: 413.33.<br>Trucks have average horsepower of: 250.00. |

## 7. Order by Age

You will receive an **unknown** number of lines. On each line, you will receive an array with **3** elements. **The first** element will be **string** and represents the **name** of the person. **The second** element will be a **string** and will represent the **ID** of the person. **The last** element will be an **integer** which represents the **age** of the person.

When you receive the command &quot; **End**&quot;, stop taking input and print **all the people, ordered by age**.

### Examples

| Input | Output |
|-|-|
| Georgi 123456 20<br>Pesho 78911 15<br>Stefan 524244 10<br>End | Stefan with ID: 524244 is 10 years old.<br>Pesho with ID: 78911 is 15 years old.<br>Georgi with ID: 123456 is 20 years old. |
