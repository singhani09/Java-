class Tester1{
    int x = 10;
    void disp(){
        System.out.println("byee");
    }
}
class Huliyacha extends Tester1{
    void ho(){
        System.out.println("hoho");
    }
    public static void main(String[] args) {
         Tester1 t1 = new Huliyacha(); // upcasting
    System.out.println(t1.x);
    t1.disp();

    Huliyacha h1 = (Huliyacha)t1; // downcasting
    h1.ho();
}
    }