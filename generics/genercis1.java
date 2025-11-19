public class genercis1 {
    // generics - typeSafety
    // only for non primitive(Wrapper class)


    // MEthod-level gneric
    public static<T> void printArr(T arr[]){
        for(T x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] iarr = {1,2,4,34,3,2};
        Boolean[] barr = {true,true,false,true,false};

        printArr(iarr);
        printArr(barr);

        // class level genric
        classLevelGenric<Integer> obj = new classLevelGenric<>();
        System.out.println(obj.ref);
    }
}
