class Rec{
    double area(){
        double width = 5;
        double height = 4;
        double areaR = width * height;
        return areaR;
    }
}
class Rectangle{
    Rec r1 = new Rec();
    double x = r1.area();
}