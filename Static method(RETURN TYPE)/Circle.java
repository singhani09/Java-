class Circ{
    static double area(){
        final double pie = 3.14;
        double radius = 4.5;
        double areaCircle = pie * radius * radius;
        return areaCircle;
    }
}
class Circle{

    public static void main(String[] args) {
      double x = Circ.area();
        System.out.println(x);
    }
}