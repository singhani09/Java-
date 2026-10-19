abstract  class Parallelogram{
    abstract void Para();
}
class Sample extends Parallelogram{
    void Para(){
        double base = 9.8;
        double height = 5.6;
        System.out.println(base * height);

    }
}
class Mainclass5{
    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.Para();
    }
}