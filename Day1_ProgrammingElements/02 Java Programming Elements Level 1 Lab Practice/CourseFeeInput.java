//9. Write a new program similar to the program # 6 but take user input for Student Fee and University Discount

import java.util.*;

public class CourseFeeInput {
    public static void main(String[] args){

        // creating scanner object to take input
        Scanner sc = new Scanner(System.in);

        // taking fee as input
        System.out.print("Enter the course fee: ");
        int fee = sc.nextInt();

        // taking discount percent as input
        System.out.print("Enter discount percentage: ");
        int discountPercent = sc.nextInt();

        // calculating discount amount
        double discount = (fee * discountPercent) / 100.0;

        // calculating final fee after discount
        double finalFee = fee - discount;

        // displaying required result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
