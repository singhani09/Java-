// sorting the array without using the built in function
import java.util.Arrays;
class Array2{
    public static void main(String[] args) {
        int[] arr1={5,6,7,8};
        int[] arr2 = {1,4,3,5};
        int[] temp = new int[arr1.length+arr2.length];
        int j = 0;
        for(int i = 0; i<arr1.length;i++){
            temp[j++]=arr1[i];
        }
        for(int i = 0; i<arr2.length;i++){
            temp[j++]=arr2[i];

    }
    Arrays.sort(temp);
    System.out.println(Arrays.toString(temp));
}
}