//Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM

public class SamMarks{
    public static void main(String[] args){

        // marks in maths
        int maths = 94;

        //marks in physics
        int phy = 95;

        //marks in chemistry
        int chem = 96;

        //calculating average percentage
        int avgPercentage = (phy + chem + maths) / 3 ;

        //displaying required result
        System.out.println("Sam's average mark in PCM is " + avgPercentage);
    }
}