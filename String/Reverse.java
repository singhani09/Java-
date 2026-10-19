class Reverse{
    public static void main(String[] args) {
        String s = "METHOD";
        System.out.println(s);
        char[] ch = s.toCharArray();
        int i =0,j=ch.length-1;
        while(i<j) {
            char t =ch[i];
            ch[i] = ch[j];
            ch[j] = t;
            i++;j--;
        }
        System.out.println(new String (ch));
    }
}