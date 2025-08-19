//Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024


public class HarryAge {
    public static void main(String[] args){

        //stroing the year of birth
        int birthYear = 2000;

        //storing the current year
        int currentYear = 2024;

        //calculating the age
        int age = currentYear - birthYear;

        //printing the desired result
        System.out.println("Harry's age in " + currentYear + " is " + age);
    }
}
