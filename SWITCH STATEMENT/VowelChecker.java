public class VowelChecker {
    public static void main(String[] args) {
        char ch = 'e';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel");
                break;
            default:
                System.out.println(ch + " is a Consonant");
        }
    }
}