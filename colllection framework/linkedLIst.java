import java.util.Iterator;
import java.util.LinkedList;

public class linkedLIst {
    public static void main(String[] args) {
        
        // data is not stored continous in memory

        LinkedList<Integer>  linkedList1= new LinkedList<>();
        linkedList1.add(34);
        linkedList1.add(21);
        linkedList1.add(76);
        linkedList1.add(656);
        linkedList1.add(34);
        linkedList1.add(21);
        linkedList1.add(76);
        linkedList1.add(656);
        System.out.println(linkedList1);

        System.out.println(linkedList1.contains(656));

        System.out.println("get first:  " + linkedList1.getFirst());
        System.out.println("get last:  " + linkedList1.getLast());
        System.out.println("get :  " + linkedList1.get(5));

        linkedList1.set(0,null);
        System.out.println(linkedList1);

        linkedList1.remove(4);
        System.out.println(linkedList1);

        linkedList1.removeFirst();
        System.out.println(linkedList1);

        linkedList1.removeLast();
        System.out.println(linkedList1);

        System.out.println(linkedList1.poll());
        System.out.println(linkedList1);

        System.out.println(linkedList1.peek());
        System.out.println(linkedList1);

        // iterator
        Iterator<Integer> itr = linkedList1.iterator();
        while(itr.hasNext()){ //checks weather element exist
            System.out.println(itr.next()); //gives current element and move cursor to next elemnt 
        }

        linkedList1.clear();
        System.out.println(linkedList1);
        System.out.println(linkedList1.isEmpty());


    }
}
