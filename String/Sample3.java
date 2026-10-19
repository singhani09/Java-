// WAP to covert first character to an uppercase each word in the given sentence;

// Hello How Are You
class Sample3{
    public static void main(String[] args) {
        
   
        String str = "hi hello how are you";
        String[] s = str.split(" ");
        System.out.println(str);
        for (int i=0; i<s.length;i++){
            //hi
            char f = (char)(s[i].charAt(0)+32);
            System.out.println(f+s[i].substring(1)+ " ");
        }
    }
}