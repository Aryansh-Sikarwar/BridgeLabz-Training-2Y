//13. Write a program to find the side of the square whose parameter you read from user 

import java.util.*;

public class SquareSide {
    public static void main(String[] args){

        // creating scanner object
        Scanner sc = new Scanner(System.in);

        // taking perimeter as input
        System.out.print("Enter the perimeter of square: ");
        double perimeter = sc.nextDouble();

        // calculating side (perimeter = 4 * side)
        double side = perimeter / 4;

        // displaying result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
