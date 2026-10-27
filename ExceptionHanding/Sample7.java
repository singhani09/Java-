
// try and catch(try and catch block)
public class Sample7 {public static void main(String[] args) {
    System.out.println("main starts");
    int [] arr ={10,20,30,40,50};
    try {
        System.out.println(arr[5]);
    } catch (ArrayIndexOutOfBoundsException e1) {
        System.out.println("caught");
        try {
            int i = 1/0;
            
        } catch (ArithmeticException e2) {
            System.out.println("handled");
        }

            }
            System.out.println("main ends ");
        }
    }



