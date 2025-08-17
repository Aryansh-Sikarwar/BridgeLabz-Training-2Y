//14. Write a program the find the distance in yards and miles for the distance provided by user in feets

import java.util.*;

public class DistanceConverter {
    public static void main(String[] args){

        // creating scanner object
        Scanner sc = new Scanner(System.in);

        // taking distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceFeet = sc.nextDouble();

        // converting feet to yards (1 yard = 3 feet)
        double yards = distanceFeet / 3;

        // converting feet to miles (1 mile = 5280 feet)
        double miles = distanceFeet / 5280;

        // displaying result
        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
    }
}
