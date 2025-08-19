//12. Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 

import java.util.*;

public class TriangleArea {
    public static void main(String[] args){

        // creating scanner object
        Scanner sc = new Scanner(System.in);

        // taking base and height as input
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        // calculating area
        double area = 0.5 * base * height;

        // displaying result
        System.out.println("The area of triangle is " + area + " square units");
    }
}
