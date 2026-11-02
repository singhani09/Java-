class Bank extends Exception{

}
class Atm{
    static int bal = 1000;
    static void withDraw(int usamt) throws Bank{
        if (usamt<=bal){
            System.out.println("happy transaction");
            
        }
        else{
            throw new Bank();
        }
    }
}
class Customer1{
    public static void main(String[] args) {
        try {
            Atm.withDraw(1500);
        } catch (Bank b) {
            System.out.println("low balance");
        }
    }
}
