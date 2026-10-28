
// printStackTrace method which belongs to throwable class which shows the backtrace of the exception occured 
public class Sample14{
    static void disp1(){
        int x = 1/0;
    }
    static void disp2(){
        disp1();
    }
    static void disp3(){
        disp2();

    }
    public static void main(String[] args) {
        System.out.println("main starts");
        try {
            disp3();
        } catch (ArithmeticException e1) {
            e1.printStackTrace();
            System.out.println("Handled");


        }
        
    }
}
    

   