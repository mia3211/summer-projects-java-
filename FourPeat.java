// Name: Mia Alexander
// VUnetID: alexaml1
// Email: mia.l.alexander@vanderbilt.edu
// Class: CS 1101 - Vanderbilt University
// Honor statement: I have neither given nor received unauthorized aid on this assignment.
// Date: 07/18/2019

// Description: This program prompts the user to input a string and then returns the
// first few characters of the characters. It will print at most, the first four characters
// in order four times, without spaces, and all lowercase.

import java.util.*;

public class FourPeat {

    // DO NOT CHANGE ANYTHING IN THE MAIN METHOD
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = keyboard.next();
        keyboard.close();
        String word4 = front4(word);
        System.out.printf("The front4 of " + word + " is " + word4);
    }


    // The method extracts the first letters of a word and then prints it
    // four times on the same line..
    public static String front4(String word) {
        word = word.substring(0, Math.min(word.length(), 4));
        word = word.toLowerCase();
        return word + word + word + word;
    }

}













