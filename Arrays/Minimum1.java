class Minimum1{
    public static void main(String[] args) {
        int [] a = {4,3,7,2,1};
        int MinF = Integer.MAX_VALUE;
        for(int x : a){
            if(x<MinF){
                MinF = x;
            }
        }
        System.out.println("First min" + " " + MinF);
    }
}