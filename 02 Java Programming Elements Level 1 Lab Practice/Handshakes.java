//16. Create a program to find the maximum number of handshakes among N number of students.

import java.util.*;

public class Handshakes {
    public static void main(String[] args){

        // creating scanner object
        Scanner sc = new Scanner(System.in);

        // taking number of students as input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // calculating maximum number of handshakes using formula n*(n-1)/2
        int handshakes = (n * (n - 1)) / 2;

        // displaying result
        System.out.println("The maximum number of handshakes among " + n + " students is " + handshakes);
    }
}
