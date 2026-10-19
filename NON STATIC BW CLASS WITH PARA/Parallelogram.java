class Parallel{
    void area(double base , double height){
        double areaP = base * height;
        System.out.println(areaP);

    }
}
class Parallelogram{
    public static void main(String[] args){
        Parallel p1 = new Parallel();
        p1.area(5,6);
    }
}