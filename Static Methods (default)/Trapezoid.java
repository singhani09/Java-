class Trape{
    static void Area(){
        double ParallelSidea = 23;
        double ParallelSideb = 12;
        double height = 5;
        double area = 0.5*(ParallelSidea + ParallelSideb) * height;
        System.out.println(area);
    }
}
class Trapezoid{


    public static void main(String[] args) {
        Trape.Area();
    }
}
