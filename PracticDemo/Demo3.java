class Demo3 {
    private double balance = 500;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {          // validation
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }
    public static void main(String[] args) {
        Demo3 d1 = new Demo3();
        System.out.println(d1.getBalance());
        
       
    }
}