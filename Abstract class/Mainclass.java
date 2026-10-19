abstract class Circle{
    abstract void Cir();
}
class Sample extends Circle{
    
    void Cir(){
        double r = 4.5;
        double pie = 3.142;
        System.out.println(pie*r*r);
    }
}
class Mainclass{
    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.Cir();
    }
}