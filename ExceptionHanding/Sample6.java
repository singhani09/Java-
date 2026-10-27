// nested try block
public class Sample6 {
    public static void main(String[] args) {
        System.out.println("main starts");
        int [] arr = {1,2,3,4,5};
        try {
            System.out.println(arr[5]);
        
       try{
        int i = 1/0;
       }
       catch(ArithmeticException e2){
        System.out.println("handled");
       }
    }
       catch(ArrayIndexOutOfBoundsException e1){
        System.out.println("handled");
       }
       System.out.println("main ends");
    

}
}
