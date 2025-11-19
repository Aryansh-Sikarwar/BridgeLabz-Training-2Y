import java.util.ArrayList;
import java.util.List;

public class arrayList extends linkedLIst{
    public static void main(String[] args) {
        
        //default capacity 10 
        // size grows by 1.5x
        // order is mainted and duplicate values are allowed
        List<Integer> ref = new ArrayList<>();
        ref.add(2);
        ref.add(5);
        ref.add(10);
        ref.add(2);
        ref.add(5);
        ref.add(10);
        ref.add(null);

        System.out.println("get :-  " + ref.get(3));

        System.out.println(ref);


        //function for arrayList
        ref.set(3, null);
        System.out.println(ref);

        ref.remove(2);
        System.out.println(ref);

        int size = ref.size();
        System.out.println(size);

        //checking for a number
        System.out.println(ref.contains(10));

        ref.clear();
        System.out.println(ref);


        
    }
}
