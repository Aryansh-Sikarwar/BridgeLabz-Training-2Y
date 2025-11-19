import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        
        // order is not maintained
        // duplicates are not allowed
        // hashset is implimented using hashmap, they are stored as key
        // hashmap ---- hashtable
        Set<Integer> set = new HashSet<>();
        set.add(43);
        set.add(null);
        set.add(432);
        set.add(756348);
        set.add(43);
        set.add(null);
        set.add(432);
        set.add(756348);

        System.out.println("set --  " + set);

        // linkedhashset
        // order is maintained
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(43);
        set1.add(null);
        set1.add(432);
        set1.add(756348);
        set1.add(43);
        set1.add(null);
        set1.add(432);
        set1.add(756348);

        System.out.println("sorted hashset " + set1);

        // tree set
        // null values are not allowed
        // sorted elements
        Set<Integer> treeset = new TreeSet<>();
        treeset.add(43);
        
        treeset.add(432);
        treeset.add(756348);
        treeset.add(43);
        
        treeset.add(432);
        treeset.add(21);
        treeset.add(756348);

        System.out.println("tree set  "  + treeset);




    }
}
