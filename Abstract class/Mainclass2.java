abstract class Square{
    abstract void Squ();
}
class Demo extends Square{
    void Squ(){
        double r = 5.5;
        System.out.println(r*r);
    }
}
class Mainclass2{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.Squ();
    }
}
