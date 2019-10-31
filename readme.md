> **The Academic Honor Policy (see Brightspace) is applicable to all work you do in CS 1101.**

# CS 1101: Programming and Problem Solving
## Homework 7

File input; array processing.

## Aim

The purpose of this assignment is to:
* Strengthen your skills with methods. Practice advanced loop processing and conditional execution.
* Introduce you to reading data from a file. Both token-based input and line-based input.
* Introduce you to very simple processing with arrays.

It is recommended that you read and understand all the instructions below before starting this assignment.

## GitHub notes

**Clone** your unique repository for this assignment from GitHub to your local computer (see Homework 1 instructions). **Commit** your changes frequently (also see Homework 1 for instructions). Remember that when you commit, your repository on GitHub doesn't change. The commit action only changes the local repository on your computer. You will need to **push** your commits to the repository on GitHub (see Homework 1 for instructions).

## Files needed

In your GitHub repository, you are not be provided with any starter files for this assignment. For each exercise below, create a Java class with the appropriate name. Be sure to include the standard header comments at the top of each file. Make sure you name the class exactly as specified and the files are placed in the **src** folder. Don't forget to select **Yes** when asked if you want to include the new file to Git.

Note: There is a **HelloWorld.java** file in the **src** folder. This is a "dummy" file that is needed to force IntelliJ IDEA to generate a Java project when the repoistory is cloned. You may simply ignore this file.

## To be handed in (via GitHub)

You will submit the following files for grading, after you have completed all the steps below:
* **Centroid.java**
* **Capitalization.java**
* **BirthdayProblem.java**

## Exercises

### Important notes

Exercises 1 and 2 (**Centroid.java** and **Capitalization.java**) are to be completed using only material from chapters 1-6 of the class text. For Exercise 3 (**BirthdayProblem.java**), you can use material from chapter 7 and arrays.

### Exercise 1: Centroid.java

Complete the following exercise by writing appropriate Java code in the file **Centroid.java**.

In physics, the center of mass (or centroid) is the weighted average location of all the mass in a body or group of bodies. In this program we will read a data file containing information on a group of bodies and then compute their center of mass.

The centroid is the average position of the *N* objects, weighted by mass. If the positions and masses are given by the tuple (x<sub>i</sub>, y<sub>i</sub>, m<sub>i</sub>) where x<sub>i</sub> is the x-coordinate, y<sub>i</sub> is the y-coordinate, and m<sub>i</sub> is the mass of the i-th object, then the centroid (x, y, m) is given by:

<img src="images/formula.png" height="50">

You will read data from a file, where each line in the file contains three values: the x-coordinate, y-coordinate, and mass of an object. You may assume the file contains exactly three values per line. Your task is to compute the centroid of all the objects in the file.

Prompt the user for an input file name. If the file name entered by the user does not exist continue prompting the user until they enter a valid file name (i.e., a name for a file that does exist). You can assume that this file contains data for at least one object. All data values are to be treated as floating point values. After processing all data from the file, report the centroid in a useful manner to the user. You should modularize your program as you find suitable (i.e., the work to actually process the contents of the file should be done in a separate method).

The provided file **particles1.txt** contains the following:

```
0.5 2.5 3
3.5 2.5 3
2.0 0.5 4
```

#### Example execution (user input are `particles` and `particles1.txt`)

```
Enter the name of the data file: particles
File does not exist. Try again.
Enter the name of the data file: particles1.txt
The centroid of the objects is (2.0, 1.7, 10.0).
```

### Exercise 2: Capitalization.java

Complete the following exercise by writing appropriate Java code in the file **Capitalization.java**.

In this program, you will read a file line-by-line. For each line of data (a string), you will process the words (or tokens) of that line one at a time. Your program will capitalize each word and print them to the screen separated by a single space. You will then print a single linefeed (i.e., newline character) after processing each line – thus your program will maintain the same line breaks as the input file.

Your program should prompt the user for the name of the file to be processed and continue prompting until a valid (existing) file name is entered. Once a valid file name is entered, you should open it and process it line-by-line. Allow the user to run the program repeatedly with different files until they signal that they are done by entering the word "exit".

#### Requirements:

1.  You are required to check if the file associated to the file name that the user entered exists.

2.  The user may enter the word "exit" in upper or lowercase to exit the program.

3.  Just as with all your programs, you should define additional helper methods to simplify your program and/or to eliminate redundancy. All methods must be documented with Javadoc comments. At a minimum, you should have a method that processes the file line-by-line and a separate method that capitalizes a single word.

4.  You should define a method to capitalize a word. This method should accept a string parameter and return a capitalized string as its return value. Capitalizing a word means to change the first character to uppercase and all others to lower case. Note that capitalizing a word does not affect non-alphabetic data (such as numbers). Also, note that we are capitalizing tokens, which misses capitalizing words that are not white-space delimited (e.g., the capitalization of `"ta-nehisi"` is `"Ta-nehisi"`, and not `"Ta-Nehisi"`).

5.  The output lines must be left justified. It is okay to have an extra space character at the end of each line. The capitalized words are separated by a single space in the output regardless of the number of white spaces that separated the words in the input file.

[Example execution of **Capitalization.java**](pdf/Capitalization-output.pdf)

### Exercise 3: BirthdayProblem.java

In probability theory, the [birthday problem](http://en.wikipedia.org/wiki/Birthday_problem) concerns the probability that, in a set of *n* randomly chosen people, some pair of them will have the same birthday. By the [pigeonhole principle](http://en.wikipedia.org/wiki/Pigeonhole_principle), the probability reaches 100% when the number of people reaches 366 (since there are 365 possible birthdays, excluding February 29th). It would seem that we would need 183 people (half of 365) to reach a 50% probability. However, 99% probability is reached with just 57 people, and 50% probability with just 23 people. These conclusions are based on the assumption that each day of the year (except February 29) is equally probable for a birthday.

You are to write a program, **BirthdayProblem.java**, which will simulate the probability that, in a set of *n* randomly chosen people, some pair of them will have the same birthday. The program should begin by giving an introduction. After that it should prompt the user for the value of the group size or n, and for the number of simulations they want to run. For a single simulation, the program should generate a random birthday for each person in the group and determine whether or not there are two birthdays that hit the same day. This simulation should be repeated the desired number of times. Once all simulations have been done, the data produced should be displayed to the user (see the example executions below). The user should then be given the option of running another experiment with a different group size.

#### Additional details for this simulation:

* To simplify the problem, we make the assumption that each day of the year (except February 29) is equally likely for a birthday.

* By the pigeonhole principle, the probability reaches 100% when the number of people reaches 366 (since there are 365 possible birthdays, excluding February 29th). Thus we will keep our group size between a lower bound of 2 people and an upper bound of 365, inclusive. Continue prompting the user to enter the size of the group until a value in the given range is entered.

* Then you prompt the user to enter the number of simulations to run, make sure the value they enter is positive (>0). Continue prompting until such a value is entered.

* When generating a random birthday for a person, generate a random integer in the range 0-364, each number will represent an individual day in a year (0 for January 1st, and 364 for December 31st). We will use zero-based numbers to match array indexing. You should use an array to keep track of which days have birthdays and which days do not.

* When performing a single simulation, remember we only need to find one pair of matching birthdays to make the simulation count. That is, as soon as we determine that two people have the same birthday we can stop the current simulation and start a new simulation.

* When displaying the final statistics, print the percentages to two decimal digits.

* Remember to use good program structure. Defining many small, specialized helper methods will help you manage the complexity and make this program easier to write. As with all our more complex programs, the code that does all the real work should be in its own method, separate from the `main` method. Since this code will generate random numbers, it will need a `Random` object. This object should be created just once in the `main` method, and passed to the simulation method as a parameter. Remember that you need the following at the top of your program: `import java.util.*;`

[Example execution of **BirthdayProblem.java**](pdf/BirthdayProblem-output.pdf)

## Additional requirements

* Add comments at the top of all your programs giving your name, email address, etc. This will be required in all your programs this semester. The honor statement that you are to type in is "I have neither given nor received unauthorized help on this assignment", or something to that extent. See the academic honesty policy on Brightspace for description of what help is allowed and what help is not allowed.

* **Each method that you write (except `main`), should be preceded by a block of Javadoc comments which describe what the method does, what the parameters are, and what it returns. Any required preconditions should also be clearly stated.**

* You should use a consistent programming style. This should include the following.
  * Meaningful variable and method names
  * Consistent indenting
  * Use of "white-space" and blank lines to make the code more readable
  * Use of comments to explain pieces of tricky code
  * Lines that do not extend beyond column 100 (or column 80 is even better)

  See the code examples in the class text for a good formatting style.

* Do not alter any files other than the Java files that you are tasked to complete.

## Grading

This assignment is worth 40 points, 10 points for **Centroid.java**, and 15 points each for **Capitalization.java** and **BirthdayProblem.java**. Your grade will be based on whether your solution is correct or not, and on how closely you followed the directions above. Remember that programming style is part of your grade.

## Reminder

**All files must be committed (and pushed) to your repository on GitHub before the deadline for grading. Any submissions after the deadline will be considered late. Hence, your last commit (and push) determines the date/time that you submitted. Submitting files for two exercises before the deadline and one of the exercises after the deadline will make your entire submission late.**
