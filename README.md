Gmail Validation Program
  This Java program checks the format of a Gmail address entered by the user. It ensures that the email address follows a specific format where it contains only lowercase letters and numbers before the "@gmail.com" domain.

Table of Contents
  1. Introduction
  2. Features
  3. Usage
  4. Code Structure
  5. Example
  6. Notes

Introduction
  This program validates the format of a Gmail address entered by the user. The validation criteria are:

  1. The email must end with @gmail.com.
  2. The part before @gmail.com should consist only of lowercase letters (a-z) and numbers (0-9).

Features
  1. Continuously prompts the user to enter a Gmail address until the correct format is entered.
  2. Provides feedback on incorrect email format.
  3. Ensures only valid characters are used before the domain.

Usage
1. Compile the program using a Java compiler:
  javac Gmail.java
2. Run the compiled program:
  java Gmail
3. Enter a Gmail address when prompted. The program will inform you if the email format is correct or incorrect.

Code Structure
The code consists of the following components:

Imports
  import java.util.*;: Imports the Scanner class for reading user input.
Class Declaration
  class Gmail: The main class containing the email validation logic.
Static Members
  1. static Scanner sc = new Scanner(System.in);: A static Scanner object for reading user input.
  2. static String mail;: A static string to store the user input email.
Methods
  1. static String firstpart(): Validates the email format. Extracts the part before @gmail.com and ensures it contains only valid characters.
  2. public static void main(String[] args): The main method that drives the program. It continuously prompts the user for input until a valid Gmail address is entered.

Example
Here's an example of how the program works:

  1. User runs the program and is prompted to enter a Gmail address.
  2. User enters: example123@gmail.com
  3. Program checks the format:
    If correct: Prints "Entered mail format is correct." and exits.
    If incorrect: Prints an error message and prompts the user to try again.

Example interaction:
  Enter a Gmail address: example123@gmail.com
  Entered mail format is correct.

or

  Enter a Gmail address: Example@Gmail.com
  Entered mail format is correct.
  Use only small letters and numbers and '@gmail.com' at very last.....
  Try again...

Notes
  1. The program assumes that the email domain is always @gmail.com. It does not support other domains.
  2. The email validation is case-sensitive and only accepts lowercase letters and digits before the @gmail.com domain.
  3. The program loops indefinitely until a valid email format is provided.
