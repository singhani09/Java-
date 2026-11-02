class Minimum3{
    public static void main(String[] args) {
        int [] a = {3,2,4,7,9,11};
        int fmin = Integer.MAX_VALUE,
        smin = Integer.MAX_VALUE,
        tmin = Integer.MAX_VALUE;
        for(int x : a){
            if(x < fmin){
                tmin = smin;
                smin = fmin;
                fmin = x;
            }
            else if(x < smin){
                tmin = smin;
                smin = x;
            }
            else if(x < tmin){
                tmin = x;
            }

        }
        System.out.println("First min is " + " " + fmin);
        System.out.println("Second  min is " + " " + smin);
        System.out.println("Third min  is " + " " + tmin);
    }
}