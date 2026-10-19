class Trapezoid{
    static void Area(){
        double ParallelSidea = 23;
        double ParallelSideb = 12;
        double height = 5;
        double area = 0.5*(ParallelSidea + ParallelSideb) * height;
        System.out.println(area);
    }
    public static void main(String[] args) {
        Area();
    }
}