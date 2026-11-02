// WAP to create a user defined exception or compile time exception or checked exception --> Advanced level
class Bank extends Exception{
    private String msg;
    Bank(String msg){
        this.msg=msg;
    }
    public String getmsg(){
        return msg;
    }
}
class Atm{
    static int bal = 1000;
    static void withDraw(int usamt)throws Bank{
        if(usamt<=bal){
            System.out.println("happy transaction");
        } else{
            throw new Bank("low balance");
        }
    }
}
class Customer{
    public static void main(String[] args){
        try{
            Atm.withDraw(1500);
        }
        catch(Bank b){
System.out.println(b.getmsg());
        }

        
    
}
}
    
