public class Sample3 {
    public static void main(String[] args) {
        System.out.println("main starts");
        int [] arr ={10,20,30,40};
        try {
            System.out.println(arr[9]);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("caught");
        }
        System.out.println("main ends");
    }

}
