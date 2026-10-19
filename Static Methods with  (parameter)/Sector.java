class Sec{
    static void area(double radius){
        double theta = Math.PI/2;
        double area = 0.5 * radius * radius * theta;
        System.out.println(area);
    }
}
class Sector{

    public static void main(String[] args) {
        Sec.area(7);
        
    }}
        