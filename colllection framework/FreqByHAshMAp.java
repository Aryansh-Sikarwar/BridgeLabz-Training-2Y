import java.util.HashMap;
import java.util.Map;

public class FreqByHAshMAp {
    public static void main(String[] args) {

        Map<Integer, Integer> freqMap = new HashMap<>();
        int arr[] = {3,2,4,2,3,4,4,4,4,3,7,5};


        for(int i =0; i<arr.length; i++){
            int val = 0;
            if(freqMap.containsKey(arr[i])){
                val = freqMap.get(arr[i]);
            }

            freqMap.put(arr[i], val+1);
        }

        System.out.println(freqMap);
    }
}
