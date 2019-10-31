// Name:  Mia Alexander
// VUnetID: alexaml1
// Email: mia.l.alexander@vanderbilt.edu
// Class: CS 1101 - Vanderbilt University
// Honor statement: I have not given or received unauthorized aid on this assignment.
// Date: 07/17/2019
// Description: This program will print a table of Fibonacci terms starting a specific poiint and
// ending at a particular point.

public class Fibonacci {
    public static final double GOLDEN_RATIO = (1 + Math.sqrt(5)) / 2;
    public static final double SQRT = Math.sqrt(5);

    public static void main(String[] args) {

        int start = 4, limit = 40, step = 3;

        System.out.print("This program will print Fibonacci terms from ");
        System.out.println(start + " to " + limit + " in steps of " + step + ".");
        System.out.println(" ");
        System.out.println("Term\tFibonacci");
        System.out.println(start + "\t\t" + fibTerm(start));


        for (int i = start; i <= limit - step; i += step) {
            System.out.print((i + step) + "\t\t");
            System.out.print(fibTerm((i + step)));
            System.out.println(" ");
        }

    }


    // This method computes the Fibonacci number for a single term.
    public static int fibTerm(int termNumber) {
        int term = (int) ((Math.pow( GOLDEN_RATIO, termNumber) -
                Math.pow( (1 - GOLDEN_RATIO), termNumber)) / SQRT);

        return term;
    }
}
