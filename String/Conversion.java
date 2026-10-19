class Conversion {
    static String check(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        System.out.println(check("JAva"));    
        System.out.println(check("MeTHod"));  
    }
}