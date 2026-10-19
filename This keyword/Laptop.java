class Laptop{
    String laNam;
    double laCost;
    String laBrand;
    Laptop(String laName, double laCost, String laBrand){
        this.laNam = laName;
        this.laCost = laCost;
        this.laBrand = laBrand;
    }
    public static void main(String[] args) {
        
    Laptop l1 = new Laptop("lenevo",34000,"apple");
    System.out.println(l1.laNam);
    System.out.println(l1.laCost);
    System.out.println(l1.laBrand);
    }
}