public class tryCAtchAndThrow{
    // unchecked - at runtime , solved only by try catch 
    // checked exception - complier check this exception , by try catch and throws - throw the excetion to the calling part , have to solve it by try catch there
    // diff between throws and throw
    // finally is used to close the resources
    // printStackTrace()
    public static void main(String[] args) {

        divideZero();
        // checkAge(15);
        nullPointer();
        outOfBond(16);
    
    }

    public static void divideZero(){
        try{
            int result = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("get  message");
        }
    }


     public static void checkAge(int age) {
        if(age < 18){
            throw new ArithmeticException("Not eligible to vote");
        } else{
            System.out.println("elogoble to vote");
        }
     }

     public static void nullPointer(){
        String s = null;
        try{
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println("null pointer exception");
        }
     }

    public static void outOfBond(int len){
        int arr[] =new int[len];
        try{
            System.out.println(arr[len]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of bound error");
        }
    }
}