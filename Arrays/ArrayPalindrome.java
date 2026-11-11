public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = {1,1};
        int i = 0 , j = arr.length-1;
        while(i<j){
            if(arr[i]!= arr[j]){
                System.err.println("not a palindrome");
                return;
            }
            i++;j--;
        }
        System.err.println("palindrome");
    }

}
