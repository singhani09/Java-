public class Sample4 {
    public static void main(String[] args) {
        System.out.println("nain starts");
        try {
        Sample4 s1 = null;
        System.err.println(s1.hashCode());
        } catch (Exception e) {
            System.out.println("handled");
        }
        System.out.println("main ends");
    }

}
