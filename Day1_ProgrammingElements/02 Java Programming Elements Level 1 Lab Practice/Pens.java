//Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.

public class Pens {
    public static void main (String[] args){
        
        //storing the number of pens
        int pen = 14;

        //number of students
        int students = 3;

        //number of pens each student will get
        int studentPens = pen / students;

        //number of pen remaining 
        int remaining = pen % students;

        System.out.println("The Pen Per Student is " + studentPens +" and the remaining pen not distributed is " + remaining);
    }
}
