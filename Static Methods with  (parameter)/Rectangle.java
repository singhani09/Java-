class Rec{
    static void Area(double width, double height){
        double area = width * height;
        System.out.println(area);
    }
}
class Rectangle{


    public static void main(String[] args) {
        Rec.Area(5,9);
    }
}