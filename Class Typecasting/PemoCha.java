class Demo{
    int x =10;
}
class PemoCha extends Demo{
    void ho(){
        System.out.println("Heyyy");
    }
    public static void main(String[] args) {
        Demo d1 = new PemoCha(); //upcasting
        System.out.println(d1.x);
        PemoCha p1 = (PemoCha)d1; //Downcasting
        p1.ho();
        System.out.println(p1.x);
    }

}