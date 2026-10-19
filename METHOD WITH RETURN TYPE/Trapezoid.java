class Trapezoid{
    static double Area(){
        double ParallelSidea = 23;
        double ParallelSideb = 12;
        double height = 5;
        double area = 0.5*(ParallelSidea + ParallelSideb) * height;
        return (area);
    }
    public static void main(String[] args) {
       double x = Area();
       System.out.println(x);
    }
}