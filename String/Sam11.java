public class Sam11{
    public static void main(String[] args) {
        String s = "good morning";
        System.out.println(s);
        System.out.println("Consonents :" + s.replaceAll("[aeiou ]","").length());
        
    }
}