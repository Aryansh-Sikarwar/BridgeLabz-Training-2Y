import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkedException {

    public static void checked(){
        System.out.println("method start");
        try{
        FileReader fr = new FileReader("src\\Desktop\\java\\anagram.java");
         System.out.println("try ends");
        }catch(FileNotFoundException ex){
            System.out.println("Checked exception : " + ex);
        }
        System.out.println("method end");
    }


    public static void checkedbythows() throws FileNotFoundException{
        System.out.println("method start");
        FileReader fr = new FileReader("src\\Desktop\\java\\anagram.java");
        System.out.println("method end");
    }
    public static void main(String[] args) {

        checked();

        try{
            checkedbythows();
        } catch(FileNotFoundException ex){
            System.out.println("Checked exception : " + ex);
        } 
    }
}
