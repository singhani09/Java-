abstract class Ellipse{
    abstract void Elli();

    }
class Sample extends Ellipse{
    void Elli(){
        double a = 8.9;
        double b = 7.8;
        double pie = 3.142;
        System.out.println(pie*a*b);
    }
}
class Mainclass7{
    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.Elli();
    }
}