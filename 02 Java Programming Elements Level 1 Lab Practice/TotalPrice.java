//15. Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.

import java.util.*;

public class TotalPrice {
    public static void main(String[] args){

        // creating scanner object
        Scanner sc = new Scanner(System.in);

        // taking unit price as input
        System.out.print("Enter the unit price: ");
        double unitPrice = sc.nextDouble();

        // taking quantity as input
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        // calculating total price
        double totalPrice = unitPrice * quantity;

        // displaying result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
