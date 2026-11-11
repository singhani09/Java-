import java.util.Arrays;
public class ArrayReverse {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
        int i = 0 , j = a.length-1;
        while(i<j){
            int t = a[j];
            a[j] = a[i];
            a[i] = t;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }

}
