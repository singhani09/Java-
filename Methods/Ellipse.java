class Ellipse
{
    static void Area()
    {
        final double pie = 3.14;
        double minorAxis = 5;
        double majorAxis = 7;
        double area = pie * minorAxis * majorAxis;
        System.out.println(area);
    }
    public static void main(String[] args){
        Area();
    }
}