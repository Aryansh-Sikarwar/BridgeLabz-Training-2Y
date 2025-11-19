import java.io.FileNotFoundException;
import java.io.FileReader;

public class emplyee {
    static String name;
    static String id;
    static int hours;
    static int salaryPerHours;
    static int salary;

    emplyee(String name, String id, int h, int sph){
        this.name = name;
        this.id = id;
        this.hours = 0;
        this.salaryPerHours = sph; 
    }

    public static void calcate() throws employeeException{
        try{
            FileReader fr = new FileReader("");
            
        }catch(FileNotFoundException e){
            throw new employeeException(e.getMessage());
        }
    }
    public static void main(String[] args) {
        try{
            calcate();
        } catch(employeeException e){
            e.printStackTrace();
        }
    }
}
