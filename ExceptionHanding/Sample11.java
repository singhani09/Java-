// we can use bitwise or (|) operator to write multiple exception inside the catch block
public class Sample11 {
    public static void main(String[] args) {
        System.out.println("Main starts");
        try {
            int x = 1/0;
            
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e1) {
            System.out.println("caught");
        }
        System.out.println("Main ends");
    }

}
