//Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 


public class Profit {
    public static void main(String[] args){

        //storing the cost price
        int cp = 129;

        //stroring the selling price
        int sp = 191;

        //calculating the profit percentage
        int profit = sp - cp;

        //calculating the profit percentage 
        double profitPercentage = ((double) profit / cp) *100;

        //printing the required result
        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR "+ sp);
        System.out.println("The Profit is INR " + profit +" and the Profit Percentage is " + profitPercentage);
    }
}
