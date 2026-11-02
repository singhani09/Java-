class Minimum2{
    public static void main(String[] args) {
        int [] a = {3,2,4,7,9,11};
        int fmin = Integer.MAX_VALUE,
        smin = Integer.MAX_VALUE;
       
        for(int x : a){
            if(x < fmin){
                
                smin = fmin;
                fmin = x;
            }
            else if(x < smin){
                
                smin = x;
            }
           

        }
        System.out.println("First min is " + " " + fmin);
        System.out.println("Second  min is " + " " + smin);
        
    }
}