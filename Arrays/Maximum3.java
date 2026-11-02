class Maximum3{
    public static void main(String[] args) {
        int [] a = {3,2,4,7,9,11};
        int fmax = Integer.MIN_VALUE,
        smax = Integer.MIN_VALUE,
        tmax = Integer.MIN_VALUE;
        for(int x : a){
            if(x > fmax){
                tmax = smax;
                smax = fmax;
                fmax = x;
            }
            else if(x> smax){
                tmax = smax;
                smax = x;
            }
            else if(x > tmax){
                tmax = x;
            }

        }
        System.out.println("First max is " + " " + fmax);
        System.out.println("Second  max is " + " " + smax);
        System.out.println("Third max is " + " " + tmax);
    }
}