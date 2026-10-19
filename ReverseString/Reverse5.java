public class Reverse5 {
    public static void main(String[] args) {
        String s = "Java Is Easy";
        String[] s1 = s.split(" ");

        String res = "";
        for (int i = s1[2].length() - 1; i >= 0; i--) {
            res = res + s1[2].charAt(i);
        }
        s1[2] = res;

        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i] + " ");
        }
    }
}