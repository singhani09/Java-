
// try - catch and finally blocl
public class Sample8 {

    public static void main(String[] args) {
        System.out.println("main starts");
        try {
            int i = 1/0;
        } catch (ArithmeticException e1) {
            System.err.println("handled");
        }
        finally{
            System.out.println("heyyy i am finally block");
        }
        
    }
}
