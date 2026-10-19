class Substring1{
    static String hy(String s){
        char [] ch = s.toCharArray();
        int i = 0; int j = ch.length-1;
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;j--;
        }
        return new String(ch);
        

    }
    public static void main(String[] args) {
        
        String s = "METHODOVERLOADING";
        System.out.println(s);
        String first = s.substring(0,6);
        System.out.println(first);
        String last = s.substring(6);
        System.out.println(last);
        System.out.println(hy(first)+" "+ last);
        System.out.println(first +" "+ hy(last));

    }
}