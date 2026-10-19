class Reverse1{
    static void reverse(String s){
        char[] ch = s.toCharArray();
        int i=0;int j=ch.length-1;
        while(i<j){
            char temp = ch[i];
            ch [i] = ch[j];
            ch[j] = temp;
            i++; j--;

        }
        System.out.print(new String(ch)+" ");


    }
    public static void main(String[] args){
        String str =" My name is Amangasorous";
        String [] s1 = str.split(" ");
        for(int i = 0;i < s1.length;i++){
            reverse(s1[i]);
        }
    }
}
