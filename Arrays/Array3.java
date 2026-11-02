// sorting the  three unorted array without using the built in function(System.arraycopy)
import java.util.Arrays;
class Array3{
    public static void main(String[] args) {
        int[] arr1={5,6,7,8};
        int[] arr2 = {1,4,3,5};
        int[] arr3 = {7,54,67,56};
        int[] temp = new int[arr1.length+arr2.length+arr3.length];
        int j = 0;
        for(int i = 0; i<arr1.length;i++){
            temp[j++]=arr1[i];
        }
        for(int i = 0; i<arr2.length;i++){
            temp[j++]=arr2[i];
    }
    for(int i = 0; i<arr3.length;i++){
        temp[j++]=arr3[i];
}

    
    
    Arrays.sort(temp);
    System.out.println(Arrays.toString(temp));
}
}
