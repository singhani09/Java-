class Court extends Exception{
    private String msg;
    Court(String msg){
        this.msg = msg;
    }
    public String getmsg(){
        return msg;
    }
}
class Eligibility{
    static int validAge = 22;
    static void Eligible(int age) throws Court{
        if(age>=validAge){
            System.out.println("you are free to marry");
        }
        else{
            throw new Court("you are underage go and study");
        }
    }
}
class Marriage{
    public static void main(String[] args) {
        try{
            Eligibility.Eligible(21);
        }
        catch(Court c1){
            System.out.println(c1.getmsg());
        }

        }
    }
