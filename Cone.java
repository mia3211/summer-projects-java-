// Name: Mia Alexander
// VUnetID: alexaml1
// Email: mia.l.alexander@vanderbilt.edu
// Class: CS 1101 - Vanderbilt University
// Honor statement: I have neither given nor received unauthorized aid on this assignment.
// Date:m 07/15/19

// Description: This program prompts a user to enter a radius and height of a right
// circular cone and then reads the data and computes the volume and area.

import java.util.*;

public class Cone {

    // DO NOT CHANGE ANYTHING IN THE MAIN METHOD
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program will ask you for the radius & height of " +
                "a cone.");
        System.out.println("It will then calculate & print its volume " +
                "and surface area.\n");

        System.out.print("Please enter the radius of the cone: ");
        double radius = keyboard.nextDouble();

        System.out.print("Please enter the height of the cone: ");
        double height = keyboard.nextDouble();
        keyboard.close();

        System.out.print("\nA right circular cone with a radius of " + radius);
        System.out.print(" cm and a height of " + height + " cm \nwill have a volume of ");
        System.out.printf("%.5f cm^3 and a surface area of ", coneVolume(radius, height));
        System.out.printf("%.5f cm^2.", coneArea(radius, height));
    }

    // Please write the methods coneVolume and coneArea below. Each receives two double parameters:
    // the first representing the cone's radius & the second representing the cone's height,
    // and each method should return a double value.

// This method computes the volume and then returns the value to the main method.
    public static double coneVolume(double radius, double height) {
        double volume = 1.0 / 3.0 * Math.PI * radius * radius * height;
        return volume;
    }


// This method computes the surface area of the cone and returns that value to main.
    public static double coneArea(double radius, double height) {
        double area = Math.PI * radius * Math.sqrt(height * height + radius
                * radius) + Math.PI * radius * radius;
        return area;
    }
}