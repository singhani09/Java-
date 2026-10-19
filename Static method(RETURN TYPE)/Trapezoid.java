class Trape {
    static double Area(){
        double ParallelSidea = 23;
        double ParallelSideb = 12;
        double height = 5;
        double area = 0.5*(ParallelSidea + ParallelSideb) * height;
        return (area);
    }
    }
    class Trapezoid {
    public static void main(String[] args) {
       double x = Trape.Area();
       System.out.println(x);
    }
}