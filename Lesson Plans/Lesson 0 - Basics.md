
# Programming Crash Course Lesson 0: Basics


## Goals

At the end of this lesson, participants should...

- Understand programing as the art of solving problems.
- Have a fundamental understanding of variables and types (int, double, boolean, array, string)
- Be able to create simple programs independently when given syntax help (without the use of functions)
- Understand how to import libraries and do basic I/O


## Table of Contents

{{TOC}}


## Part 0: Course Overview

Hello, World!

Welcome to the course! I wanted to give a really fundamental course on programming, so with help from Andrew, Mr. Edins and a bunch of academic literature on how to learn how to code, I present to you this crash corse in programming. 

The goal here is to go from being able to read code, at least a bit, to having the fundamentals you need to make any thing. Don't worry, it's not gonna be that much knowledge. You only need to know the basics, once you have that part down, we'll teach you the tricks to Google and find out how to do more complicated things, but really, it's only that first "getting-started" bit that's difficult.

We have about a month to do this, and, while that's not a ton of time, we've developed a framework and lesson plans to get it done. It's gonna be intense, but I hope it'll also be pretty fun. We'll meet for 2 hours each week and you'll have about 2-4 hours of encouraged but optional activities to complete. 

So one important thing: Programming isn't about writing lines of code, it's about solving problems and making things. And that's what the class will focus on. 

Feel free to ask me a question at any time if you're not understanding what I'm saying. Chances are that other people probably have the same question/misunderstanding.

And finally, what you know from Lua won't directly translate to this course. We'll be using Java, a more common language that will better teach you programming concepts. Be ready for the things you thought you knew to be either wrong or not apply to Java. We're going to start by expecting you guys to have almost no knowledge and work up.

This is part 0 of the lesson. Why zero? That's a bit of a programming joke: unlike in Lua, in most programming languages, you start counting there.

You won't need your computers right now, so, as I start out, Em and Andrew will install the tools you need to start programming, Eclipse and the JDK (Java Development Kit), onto your computers.

## Part 1: Eclipse

When you first start out in development, you'll use IDEs (Integrated Development Environments). They'll help you out by making it super easy to run your code and give you hints as you write. Unlike Sublime, IDEs are often deeply integrated into the languages you use, so they can help you catch syntax errors even before you run your code.

So let's start out by making a project. Open Eclipse, then go to File > New Java Project. The Project Name can be anything you want.

Similar to Sublime, on the left of your IDE window, you'll a list of files in your workspace. On top, you'll see a green save icon. That does what you'd expect. Next to it, you'll see a play button. Once you write some code, this will allow you to run your code. When you start writing code, it will appear in the center of your screen. Below that, you'll see a console. This will show the output of your code. 

## Part 2: Hello World

That's the extreme basics of the IDE. Let's move on to actually starting with your first program. 

In Java, your code lives in things called `class`es. We won't dive deeper into them just yet, just know that they exist and what they're called.

Our first program will be extremely simple. It's a pretty common paradigm to start with a Hello World program. All it will do is print the text "Hello, World!" to the console. 

Click the small arrow, called a caret, next to your project in the list to open it. Then, open the source (spelled src) folder inside of your project. Right click on the `default package` and select New Class. Name it whatever you'd like, we're going to go with `HelloWorld`. Just don't use spaces and capitalize the first letter of each word. Choose to create the method stud `public static void main(String[] args)` .

In Java, your code goes in the main function, inside the brackets of the line stating `public static void main(String[] args)`. You don't have to understand the rest of the boilerplate code right now, we'll come back to it next week.

You print to the console by using `System.out.println("Your message goes here.");` - System dot out dot print l-n (meaning, print line). Make sure to add a semicolon.

```java

public class HelloWorld {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World");

	}

}
```

##  Part 3: Variables and Data

Now, let's talk about data. You're not going to need your computers for this part, just look at the whiteboard. 

First, it's important to talk about primitive types. Those are the very basic pieces of data your code works with. List basic types, ask for an example of each type and write it on the board. Leave space to name the variables and write an equals sign. Don't forget to explain why we write strings with quotes.

```
boolean         true
int             0
double          3.14
String          "Hello, world"
```

I'm going to turn this into real Java code, here.

```java
boolean myNameIsBen   = true;
int numberOfFriends   = 0;
double pi             = 3.14;
String ourText        = "Hello, world";
```

You don't have to understand this right now. We're gonna break it down. Unlike in Lua, Java requires you to specify the type of data in each variable. We do that by literally naming the type. Next, we specify the variable name and state it's equal to the value. Finally, we put a semicolon so Java knows when our line ends. We can later change our variables without defining their types:

```java
pi = 3.1415;
```

This will make the value of pi different for every statement that goes after it.

## Part 4: Arrays

Let's say you want to have a bunch of data of the same type. You'll use an array for this. You can make an array of any type of data. But, I'm kinda hungry, so we'll create a list of snacks. By the end of class, this will actually become our first project, a vending machine.

Notice how the brackets `[]` indicate that we're creating a list. We'll say we're creating new list and indicate how many objects will be inside of it.

```java
String snacks[] = new String[5];
```

What snacks should we add? Write in each one. Remember, we start counting at zero. Because we have an array with 5 elements, we'll stop counting when we get to 4 (5 elements).

```java
String snacks[] = new String[5];

snacks[0] = "Apple";
snacks[1] = "Oreo";
snacks[2] = "Fruit Roll-up";
snacks[3] = "Cheeze-its";
snacks[4] = "Cake";
```

I just wanted to get you guys comfortable with that way of seeing an array being defined. Java makes it slightly easier to write an array all at once:

```java
String snacks[] = {"Apple", "Oreo", "Fruit Roll-up", "Cheese-its", "Cake"};
```

That's the basics of data, variables and arrays in Java.

## Part 5: Lines of Code

Now, let's start writing some code that does stuff. Move to my computer, projected on board. Start in `VendingMachince.java`.

`VendingMachince.java`:

```java
public class VendingMachine {

	public VendingMachine() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String snacks[] = {"Apple", "Oreo", "Fruit Roll-up", "Cheeze-its", "Cake"};
	}

}
```

So let's print out that first snack. Who remembers how to print a string? Cool, so let's get the first element of our array, remember it's at index 0. 

```java
System.out.println(snacks[0]);
```

Look! It prints "Apple." Let's show all of the items in our vending machine. Copy and paste, then ask how to do the rest.

 ```java
String snacks[] = {"Apple", "Oreo", "Fruit Roll-up", "Cheeze-its", "Cake"};

System.out.println(snacks[0]);
System.out.println(snacks[1]);
System.out.println(snacks[2]);
System.out.println(snacks[3]);
System.out.println(snacks[4]);
```

Let's clean it up *just a little* bit more. Talk about how string compilation works.

 ```java
String snacks[] = {"Apple", "Oreo", "Fruit Roll-up", "Cheeze-its", "Cake"};

System.out.println("Welcome to the vending machine. We have: ");

System.out.println(" - " + snacks[0]);
System.out.println(" - " + snacks[1]);
System.out.println(" - " + snacks[2]);
System.out.println(" - " + snacks[3]);
System.out.println(" - " + snacks[4]);
```

That's a very basic program, but it does stuff. 

Let's say we want to change the name of snack number 4. Let's write a bit more code:

```java
snacks[4] = "test";

System.out.println("Actually, that last one is now called: " snacks[4])
```

And that's how code kinda works. The computer runs each line - or, statement - one after another. If a statement changes a variable, it affects all lines after it. 

## Part 6: Loops and Ifs

That code's starting to look pretty repetitive. Java provides a cool thing, loops. Talk about what each part of the loop means. Explain each is a separate statement.

```java
for (int i = 0; i < snacks.length; i++) {
	System.out.println(" - " + snacks[i]);
}
```

Our code's starting to look a lot cleaner.

Now, let's make sure we don't offer any snacks we don't have in stock. 

```java

public class VendingMachine {
  ...

	public static void main(String[] args) {
		String snacks[] = {"Apple", "Oreo", "Fruit Roll-up", "Cheeze-its", "Cake"};
		// Add this line
		int snacksStock[] = {5, 0, 12, 18, 2};
		
		System.out.println("Welcome to the vending machine. We have: ");
		
		for (int i = 0; i < snacks.length; i++) {
			// add these lines
			int stock = snacksStock[i];
			if (stock > 0) {
				System.out.println(" - " + snacks[i]);
			}
		}
	
	}
}

```

Add else to show snacks not in stock.

```java
...
if (stock > 0) {
} else {
	System.out.println(" - " + snacks[i] + " (out of stock)");
}
...
```

## Part 7: Libraries, Imports and Input

Explain libraries and imports

```java
import java.util.Scanner;
```

In Java, you can allow the user to write things into the console and access the value in code. 

Ask without a new line:

```java
System.out.print("Which would you like? ");
```

Input is passed as a stream of data to `System.in`. You use a `Scanner` to interpret that stream of input as the type of data you're requesting.

Create a new scanner with `System.in` and wait for the next integer;


```java
Scanner scanner = new Scanner(System.in);	
int selectionIndex =  scanner.nextInt();
```

And print out the result (ask the class how):

```java
System.out.println("Enjoy your " + snacks[selectionIndex]);
```

Now, use introduce while loops to allow infinite snacking:

```java
while true {
	System.out.println("Welcome to the vending machine. We have: ");
	...
}
```


## Part 8: Inequalities

Next, we'll make sure people can't get out of stock items:

```java

if (stock > 0) {
	System.out.println(" - " + snacks[i]);
} else {
	System.out.println(" - " + snacks[i] + " (out of stock)");
}
```

Stall until Eclipse is installed on all computers by ask what else needs to be done?

- allow breaking
- money?
- showing index in line

Leave the code we wrote for the vending machine on the board during the activities. Explain that it can be used as a reference as participants write their programs. 

+++

## Activities

You may (and are recommended to) work in a pair for your first activity, then attempt to solve the rest individually.

### Activity 0: Number Guesser
  
Create a high/low number guesser. A user of the program should think of a number between 1 and 100. By asking a series of yes or no questions, guess the user's number. The user gives the program a hint or higher or lower.

#### Bonus Challenges
0. Allow the user to configure the range of numbers
1. Use the shortest number of lines possible
2. Make the least number of guesses possible

### Activity 1: Calculator

Create a basic four-function calculator. Users enter a number, select an operation, then type another number. The program displays the result. Users can then choose another operator to apply to the result and type another number.

#### Bonus Challenges

0. Allow the user to change the program
1. After completing challenge 0, automatically decide if the user is entering a number or an operation. Hint: `scanner.hasNextInt()`
2. Allow the user to enter in decimal numbers.

### Activity 2: FizzBuzz

A common game turned into an extremely common programming interview question. 

Starting from 1, count to one hundred following the following rules:

- Normally, print out the number
- If a number is divisible by 3, only print `Fizz`
- If a number is divisible by 5, only print `Buzz`
- If a number is divisible by both 3 and 5, only print `FizzBuzz`

#### Example Output

```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
```

#### Hint

Try running this code

```java
System.out.println(5 % 3);
System.out.println(13 % 7);
System.out.println(5 % 4);
```

### Activity 3: Roulette

Users bet on a number between 0 and 8. If they select the same number as the computer, they win. If they don't, let them know how far away they were to hook them in.

#### Hint


```java
import java.util.Random;
```

```java
Random rand = new Random();
System.out.println(rand.nextInt(3));
```

#### Bonus Challenges
0. Instead of starting the range of random numbers at 0, start at 1.
1. Allow the user to change the upper and lower bounds of the numbers.
2. Create a credit tracking system. The user starts with a certain number of credits and can "bet" on their number. If they pick the right number, they get a certain number of credits. If they pick the wrong number, they lose their "bet". If they run out of credits, they lose the game and it should restart.