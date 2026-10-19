class Mac{
    static void lapy(String brandName){
        System.out.println("lapy name is  "+ brandName);
    }
    static void lapy(int price){
        System.out.println("the price of the lapy is  " + price);
    }
    static void lapy(double discount,String comment){
        System.out.println("The discount price is = " + discount + ",The advice for you is " + comment );
    }
    public static void main(String[] args){
        lapy("Macbook m1");
        lapy(850000);
        lapy(15.5," be happy always");
    }
}
