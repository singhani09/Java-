import java.util.Scanner;
public class Circle{
    public static void areaCircle(double radius){
        final double pie = 3.14;
        double areaC = pie * radius * radius;
        System.out.println(areaC);
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle ");
        double radius = sc.nextDouble();
        areaCircle(radius);
        
    }
}