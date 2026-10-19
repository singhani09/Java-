abstract class Triangle{
    abstract void Tri();
}
class Sample extends Triangle{
    void Tri(){
        double width = 4.5;
        double height = 6.7;
        System.out.println(0.5*width*height);
    }
}
class Mainclass1{
    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.Tri();
    }
}