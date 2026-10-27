
// 1 try block and multiple catch block
public class Sample5 { 
    public static void main(String[] args) {
        System.out.println("main starts");
        try {
            int i= 1/0;
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("caught");
        }
        catch(ArithmeticException e1){
            System.out.println("handled");
        }
        System.out.println("main ends");
    }

}
