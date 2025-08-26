import java.util.*;
public class BookManagement {

    void displayBookInfo(String title, String author, String id, boolean isAvailable){

        System.out.println("====BOOK INFO====");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book Id: " + id.toUpperCase());
        if(isAvailable == true){
            System.out.println("Available: Yes");
        } else{
            System.out.println("Available: No");
        }
        
        System.out.println("Author Name Length: "+author.length());
        

    }

    double calculateAverageRatings(int[] ratings){

        
        int sum =0;
        for(int i =0; i < ratings.length; i++){
            
            sum += ratings[i];
        }
        int avg = sum/(ratings.length);
        return avg;
    }

    int calculateTotalRatings(int[] ratings){
        int total = ratings.length;
        return total;
    }

    static void compareAuthorName(String a1, String a2){

        if(a1.equals(a2)){
            System.out.println("comaparing with " + a2 +": same author");
        } else {
            System.out.println("comaparing with " + a2 +": different author");
        }

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //requirements
         System.out.println("enter book title:");
        String bookTitle = sc.nextLine();
        System.out.println("enter authors name:");
        String authorName = sc.nextLine();
        System.out.println("enter book id:");
        String bookId = sc.nextLine();
        System.out.println("available (true/false)");
        boolean isAvailable = sc.nextBoolean();
        

        //ratings
        System.out.println("enter number of ratings");
        int rating = sc.nextInt();
        int[] arr = new int[rating];
        for(int i =0; i<rating; i++){
            System.out.println("enter rating " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        
        BookManagement obj = new BookManagement();
        obj.displayBookInfo(bookTitle , authorName, bookId , isAvailable);
        compareAuthorName(authorName, "Sakespear");

        System.out.println("====Ratings====");
        for(int i =0; i < arr.length; i++){
            System.out.println("Rating "+(i+1)+" : "+ arr[i]);
        }

        

        for(int i =0; i < arr.length; i++){
            if(arr[i] == 1){
                System.out.println("one user gave poor rating");
            }
        }
        double avg = obj.calculateAverageRatings(arr);

        System.out.println();
        int total = obj.calculateTotalRatings(arr);
        System.out.println("Total rating: " + total);
        System.out.println("Average rating : " + avg);
        
        if(rating == 0){
            System.out.println("Book status : no rating availble");
        }else if(avg >= 4){
            System.out.println("Book status : higly rated book");

        }else{
            System.out.println("Book status : Average book");
        }
    }
}
