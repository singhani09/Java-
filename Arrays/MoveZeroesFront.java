import java.util.Arrays;
class MoveZeroesFront{
    public static void main(String[] args) {
        int[] arr = {2,3,0,5,6,0,4,0};
        int i = 0 ; int j = arr.length-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            else if(arr[j]!=0){
                j--;
            }
              else{
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
              }
    }
    System.out.println(Arrays.toString(arr));

}
}