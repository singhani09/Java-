class University extends Exception{
    private String msg;
   University(String msg){
        this.msg = msg;
   }
    public String geteligible(){
            return msg;
        }
    
    }



class College{
    static boolean criteria = true;
    static void passedAll(boolean s) throws University{
        if(s == criteria){
            System.out.println("you are eligile for the degree Congratulation!!");
        } else{
             throw  new University("you have pass all the subject again than only");
        }
    }
}
class Degree{
    public static void main(String[] args) {
        try {
            College.passedAll(true);
        } catch (University u1) {
            System.out.println(u1.geteligible());
        }
    }
}