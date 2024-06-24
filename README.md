---
title: Project about functions and switch
members: Elian Farinango - Brenda Jacome
date: 14 - 06 - 2024
---
Project Description:
---
The code is a console application written in Java version 17.0.1 that includes a switch control structure to execute different functionalities depending on the option entered by the user.
Use static methods to perform specific operations. The application offers three options (a, b, c), each performing a different task:
Code Details
Imports:
Scanner: for user input from the console.
Math: For mathematical operations (such as cosine calculation).
HelloApplication class:

This class contains several static methods and a main method to run the application.
Methods:

sumNumbers(int numberOne, int numberTwo): This method takes two integers as parameters and returns their sum.
print(String man): This method takes a String and prints it to the console.
cosOfNumber(int cos): This method appears to be designed to perform an operation on a cosine, but currently it only returns the value it receives as a parameter.
main(String[] args) method:

Initializes a Scanner to receive user input.
Prompts the user to enter a letter (a, b, or c) and stores this entry.
It uses a switch control structure to determine which option the user selected and execute the corresponding code block.
Switch options:


Case "a":

Prints "Option selected is: a".
Prompts the user for two integers.
Call the sumNumbers method with these two numbers and store the result.
Call the print method to print the result of the addition.

![1era captura](https://github.com/ElianFarinango/ProjectFunctionsAndSwitch/assets/169933606/93e6b473-a4cc-4ed6-9457-4eef952773b0)


Case "b":

Prints "Option selected is: b".
Prompts the user for a text.
Calls the print method to print the text entered by the user.

![2da captura](https://github.com/ElianFarinango/ProjectFunctionsAndSwitch/assets/169933606/78a9fb70-9658-47aa-8cf0-209139238120)


Case "c":

Prints "Option selected is: c".

Prompts the user for an integer.

Call the cosOfNumber method with this number and store the result.
Convert the number to radians using Math.toRadians.

Calculates the cosine of the angle in radians and stores it in a variable of type float.
Call the print method to print the cosine value.


![3era captura](https://github.com/ElianFarinango/ProjectFunctionsAndSwitch/assets/169933606/87831877-72da-4dbf-943c-be8e09627f19)


Questions:
---
What was your motivation?

The motivation for this project was to practice basic Java concepts and learn how to organize code using methods and control flow.

Why did you build this project?

I built this project to strengthen my Java skills and create a simple application that interacts with the user.

What problem does it solve?

The project allows you to perform basic operations such as adding numbers, displaying messages and calculating the cosine of an angle, facilitating simple mathematical tasks.

You learned?

I learned:

Using Scanner for user input.
Definition and use of methods.
Flow control with switch.
Basic mathematical calculations in Java.

What highlights your project?

It stands out for its simplicity and clarity, making effective use of methods and flow control to solve basic problems.

Characteristics
Sum of two numbers:

Ask for two numbers and show their sum.
Show a text message:

Requests and displays a message entered by the user.
Calculate the cosine of a number:

Converts an angle to radians and shows its cosine.







