// bounded type generic
// upper bound - <t extends class name>
public class bounded<T extends Number> {
    
    T ref;

    public static void main(String[] args) {
        bounded<Integer> obj1 = new bounded<>();
        bounded<Float> obj2 = new bounded<>();
        // bounded<Boolean> obj3 = new bounded<>();

    }
}

// lower bouund - <T super class name>
