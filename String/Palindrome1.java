class Palindrome1 {
    static void palindrome(String s) {
        // keep only letters/digits, lowercase everything
        String clean = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        char[] ch = clean.toCharArray();
        int i = 0, j = ch.length - 1;
        while (i < j) {
            if (ch[i] != ch[j]) {
                System.out.println("\"" + s + "\" is not a palindrome");
                return;
            }
            i++; j--;
        }
        System.out.println("\"" + s + "\" is a palindrome");
    }

    public static void main(String[] args) {
        palindrome("My mom knows malayalam");      // not a palindrome
        palindrome("A man a plan a canal Panama"); // palindrome
        palindrome("Was it a car or a cat I saw"); // palindrome
    }
}