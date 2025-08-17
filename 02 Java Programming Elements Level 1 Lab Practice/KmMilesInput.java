//8. Create a program to convert distance in kilometers to miles.

import java.util.*;

public class KmMilesInput {
    public static void main(String[] args){

        // creating scanner object to take input
        Scanner input = new Scanner(System.in);

        // taking distance input in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // converting kilometers to miles
        double miles = km * 1.6;

        // displaying result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
