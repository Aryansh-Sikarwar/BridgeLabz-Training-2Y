import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        
        Map<Integer , Integer> map = new HashMap<>();

        map.put(1,2);
        map.put(2,4);
        map.put(3,9);
        map.put(4,16);
        System.out.println(map);

        map.put(3,1);
        System.out.println(map);
    }
}
