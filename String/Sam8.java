public class Sam8{
    public static void main(String[] args) {
        String s = "goo#8743#d morni@@n778g";
        System.out.println(s);
        System.out.println(s.replaceAll("[0-9 a-z]",""));
        
    }
}