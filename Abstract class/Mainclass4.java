abstract class Trapezoid{
    abstract void Trap();
}
class Demo extends Trapezoid{
    void Trap(){
        double a = 9.5;
        double b = 7.8;
        double height = 7.89;
        System.out.println(0.5*(a+b)*height);
    }
}
class Mainclass4{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.Trap();
    }
}