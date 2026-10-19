class Rec{
static double Area() {
    double width = 5;
    double height = 4;
    double area = width * height;
    return  (area);
}
}
class Rectangle {
public static void main(String[] args){
    double x = Rec.Area();
    System.out.println(x);
}
}