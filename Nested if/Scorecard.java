class Scorecard{
    public static void main(String[] args){
        int marks = 75;
        if(marks>=35){
            if(marks>=85){
                System.out.println("Distinction");
            }else{
                System.out.println("passed but not with distinction");
            }
        }
        else{
            System.out.println("Failed");
        }
    }
}