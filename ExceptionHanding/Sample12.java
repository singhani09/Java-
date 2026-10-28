// if the exception has handled first it will show handled there is no need to check in the exception class , it will not throw error
public class Sample12 {
public static void main(String[] args) {
    System.out.println("main starts");
    try {
        int x = 1/0;
    } catch (ArithmeticException e1) {
        System.out.println("handled");
    }
    catch(Exception e2){
        System.out.println("caught");
    }
    System.out.println("main ends");
}
}
