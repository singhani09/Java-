class Trapezoid{
    static void Area(double verticalHeight, double parallelSidea, double parallelSideb){
        double area = 0.5 * (parallelSidea + parallelSideb) * verticalHeight;
        System.out.println(area);

    }
    public static void main(String[] args) {
        Area(5,7,8);
    }}
