class Parallel
{
    static double Area(){
        double base = 23;
        double verticalHeight = 12;
        double area = base * verticalHeight;
        return area;
    }
}
class Parallelogram{
    public static void main(String[] args) {
       double x = Parallel.Area();
       System.out.println(x);
    }
}
