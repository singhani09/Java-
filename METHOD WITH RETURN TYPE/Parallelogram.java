class Parallelogram
{
    static double Area(){
        double base = 23;
        double verticalHeight = 12;
        double area = base * verticalHeight;
        return area;
    }
    public static void main(String[] args) {
       double x = Area();
       System.out.println(x);
    }
}