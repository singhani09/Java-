class Elli
{
    static double Area()
    {
        final double pie = 3.14;
        double minorAxis = 5;
        double majorAxis = 7;
        double area = pie * minorAxis * majorAxis;
        return  area;
    }
}
class Ellipse{
    public static void main(String[] args){
       double x = Elli.Area();
       System.out.println(x);
    }
}
        
