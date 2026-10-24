class Laptop{
    String laNam;
    double laCost;
    String laBrand;
    Laptop(String laName, double laCost, String laBrand){
        this.laNam = laName;
        this.laCost = laCost;
        this.laBrand = laBrand;
    }
    public boolean equals(Object obj){
        Laptop l2 = (Laptop) obj;
        return this.laBrand==l2.laBrand;
    }
    public static void main(String[] args) {
        
    Laptop l1 = new Laptop("lenevo",34000,"apple");
    Laptop l2 = new Laptop("lenevo",34000,"apple");
    if(l1.equals(l2)){
        System.err.println("same");
    }else{
        System.err.println("not same");
    }
    }
}