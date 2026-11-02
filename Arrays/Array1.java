// sorting the  two unsorted array using built in func
import java.util.Arrays;
class Array1{
    public static void main(String[] args) {
        int[] arr1 = {3,5,4,8};
        int [] arr2 = {4,7,3};
        int [] temp = new int[arr1.length+arr2.length];
         System.arraycopy(arr1, 0, temp, 0, arr1.length);
         System.arraycopy(arr2, 0, temp, arr1.length, arr2.length);
        Arrays.sort(temp);
          System.out.println(Arrays.toString(temp));
          
        
     
    
}
}