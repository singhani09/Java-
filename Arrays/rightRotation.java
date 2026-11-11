import java.util.Arrays;
class rightRotation{
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        int k = 1;
        k = k%arr.length;
        for(int i =0; i<k;i++){
            int first = arr[arr.length-1];
            for(int j = arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0]=first;
            System.out.println(Arrays.toString(arr));

            
            

        }
    }
}
       