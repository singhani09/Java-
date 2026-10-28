
// it will return compile time error because error has been handled so we cannot rehandle again
public class Sample13 {
    public static void main(String[] args) {
        System.out.println("main starts");
        try {
            int x = 1/0;
        } catch (Exception e2) {
            System.out.println("handled");
        }
        catch(ArithmeticException e1){
            System.out.println("handled");
        }
        System.out.println("Main ends");
    }

}
