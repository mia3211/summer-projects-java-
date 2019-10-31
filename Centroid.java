// Name:  Mia Alexander
// VUnetID: alexaml1
// Email: mia.l.alexander@vanderbilt.edu
// Class: CS 1101 - Vanderbilt University
// Section: 003 (TTh 11:00-12:15)
// Honor statement: I have not given or received unauthorized aid on this assignment.
// Date: 08/08/2019
// Description: This program reads data from a file and then prints the data.
//

import java.util.*;
import java.io.*;


public class Centroid {
    public static void main(String[] args)
    throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        Scanner input = getInput(console);
        computeCentroid(input);




        }







    public static Scanner getInput(Scanner console)
        throws FileNotFoundException{
        System.out.print("Enter the name of the data file: ");
        File centroid = new File(console.nextLine());
        while(!centroid.canRead()){
            System.out.println("File does not exist. Try again.");
            System.out.print("Enter the name of the data file: ");
            centroid = new File(console.nextLine());
        }
     return new Scanner(centroid);
    }

public static void computeCentroid(Scanner input){
        double centroidX = 0.0;
        double centroidY = 0.0;
        double centroidM = 0.0;
        while (input.hasNextLine()){
            double x = input.nextDouble();
            double y = input.nextDouble();
            double m = input.nextDouble();
            centroidM += m;
            centroidX += x * m;
            centroidY += y * m;


        }


        System.out.println("The centroid of the objects");
}

}
