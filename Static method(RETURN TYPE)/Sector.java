class Sec
{
    static double Area(){
        double Radius = 5;
        double theta = Math.PI/2;
        double area = 0.5 * Radius * Radius * theta;
        return (area);
    }
}
class Sector{
    public static void main(String[] args) {
       double x = Sec.Area(); 
       System.out.println(x);
    }
}