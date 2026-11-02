// sorting the  three unsorted array using built in function(System.arraycopy)
import java.util.Arrays;
class Array4{
    public static void main(String[] args) {
        int[] arr1 = {3,5,4,8};
        int [] arr2 = {4,7,3};
        int [] arr3 = {7,54,65};
        int [] temp = new int[arr1.length+arr2.length+arr3.length];
         System.arraycopy(arr1, 0, temp, 0, arr1.length);
         System.arraycopy(arr2, 0, temp, arr1.length, arr2.length);
         System.arraycopy(arr3, 0, temp, arr1.length+arr2.length, arr3.length);
        Arrays.sort(temp);
          System.out.println(Arrays.toString(temp));
          
        
     
    
}
}