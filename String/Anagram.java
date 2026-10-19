class Anagram{
    public static void main(String[] args) {
  
   String s1 ="acting";
   String s2 ="according";
   int[] arr = new int[127];


        //traversal of String s1
    for(int i = 0;i<s1.length();i++){
        char ch = s1.charAt(i);
    arr[ch]++;
    }
        // traversal of String s2
        for(int i = 0;i<s2.length();i++){
            char ch = s2.charAt(i);
        arr[ch]--;
        }

        //traversal of Array

        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.println("not a anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
        