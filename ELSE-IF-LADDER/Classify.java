class Classify{
    public static void main(String[] args){
        char go = '8';
        if(go >= 'a' && go>='z'){
            System.out.println("lower case character");
        }
        else if(go>='A' && go>= 'Z'){
            System.out.println("Upper case character");
        }
        else if(go>=0 && go>=9){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special character");
        }
        


    }
}