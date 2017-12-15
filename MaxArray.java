/* created by jenny trac
created on dec 12 2017
program finds the maximum value in an array */

import java.util.Scanner;

public class MaxArray {
    
    public static int MaximumInArray (String[] AnArray) {
    
    int MaxOfArray = 0;
    
    for (int counter = 0; counter < AnArray.length; counter++) {
        if (MaxOfArray < Integer.valueOf(AnArray[counter])) {
            MaxOfArray = Integer.valueOf(AnArray[counter]);
            }
        }
    
    return MaxOfArray;
    }
    
    public static void main(String[] args) {
    // input
    Scanner problem = new Scanner(System.in);
    System.out.println("Enter your numbers separated by a space:");
    String[] TheNumbers = (problem.nextLine()).split(" ");
    //System.out.println(TheNumbersString);
    
    // process
    int maximum = MaxArray.MaximumInArray(TheNumbers);
    
    // output
    System.out.println("The largest number is: " + maximum);
    }
}
