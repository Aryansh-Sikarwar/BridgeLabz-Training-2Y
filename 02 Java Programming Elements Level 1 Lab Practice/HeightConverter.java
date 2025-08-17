//10. Write a program that takes your height in centimeters and converts it into feet and inches

import java.util.*;

public class HeightConverter {
    public static void main(String[] args){

        // creating scanner object to take input
        Scanner sc = new Scanner(System.in);

        // taking height input in cm
        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();

        // converting cm to inches (1 inch = 2.54 cm)
        double totalInches = heightCm / 2.54;

        // converting inches to feet
        int feet = (int)(totalInches / 12);

        // remaining inches
        double inches = totalInches % 12;

        // displaying result
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}
