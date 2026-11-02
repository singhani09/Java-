class Authority extends Exception{
    private String msg ;

Authority(String msg){
    this.msg = msg;
    }
    public String getmsg(){
        return msg;
    }

   
    }


class Agency{
    static int validAge = 16;
    static void yourAge(int age) throws Authority{
        if(age>=validAge){
            System.out.println("your licence will be made ");
        }
        else{
            throw new Authority(" your licence cannot be approved ");
        }
    }
}
class License{
    public static void main(String[] args) {
        try {
            Agency.yourAge(14);
        } catch (Authority a1) {
            System.out.println(a1.getmsg());
        }
    }
}