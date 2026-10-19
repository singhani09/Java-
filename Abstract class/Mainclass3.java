abstract class Rectangle{
    abstract void Rec();
}
class Demo extends Rectangle{
    void Rec(){
        double base = 7.9;
        double height = 9.7;
        System.out.println(base*height);
    }
}
class Mainclass3{
    public static void main(String[] args) {
        
    
        Demo d1 = new Demo();
        d1.Rec();
    }
}