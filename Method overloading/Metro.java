class Metro{
    void ride(String departure, String destination){
        System.out.println(departure +"  "+" " + destination);
    }
    void ride(int price){
    System.out.println("The price of the ticket is " + price);
}
void ride(String text){
    System.out.println(text);
}
public static void main(String[] args) {
    Metro m1 = new Metro();
    m1.ride("Seetharampallya","Magadi road");
    m1.ride(72);
    m1.ride("Have a safe and healthy journey !!");

    
}
}