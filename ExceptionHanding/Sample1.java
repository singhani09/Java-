public class Sample1 {
    public static void main(String[] args) {
        System.err.println("main starts");
        try {
            int a = Integer.parseInt("dfhdjj");
            System.err.println(a);
        } catch (NumberFormatException e) {
            System.err.println("handled");
        }
        System.err.println("main ends");
    }

}
