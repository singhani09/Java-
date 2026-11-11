import java.util.Arrays;
class MoveZeroesBack{
    public static void main(String[] args) {
        int [] arr = {0,2,0,3,0,4,6,0,9};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
            
        }
        while(j<arr.length){
            arr[j++]=0;
        }
        System.out.println(Arrays.toString(arr));
        
    }
}