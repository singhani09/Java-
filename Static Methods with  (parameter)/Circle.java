class Cool{
    static void area(double radiusCircle){
        final double pie = 3.14;
        double areaCircle = pie * radiusCircle * radiusCircle;
        System.out.println(areaCircle);
    }
}
class Circle{

    public static void main(String[] args) {
     Cool.area(7);
    }
}