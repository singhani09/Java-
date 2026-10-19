// Area of Triangle using parameter using Scanner class
import java.util.Scanner;
public class Triangle{
    static double areaTriangle(double base,double height){
        double areaT = 0.5 * base * height;
        return areaT;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System .out.println("Enter base of the Triangle");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the Triangle");
        double height = sc.nextDouble();
        double x = areaTriangle(base,height);
        System.out.println("the Area of the triangle is " + x);
    }
}
