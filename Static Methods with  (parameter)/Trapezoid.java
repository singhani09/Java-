class Trape{
    static void Area(double verticalHeight, double parallelSidea, double parallelSideb){
        double area = 0.5 * (parallelSidea + parallelSideb) * verticalHeight;
        System.out.println(area);

    }
}
class Trapezoid{
    public static void main(String[] args) {
        Trape.Area(5,7,8);
    }}