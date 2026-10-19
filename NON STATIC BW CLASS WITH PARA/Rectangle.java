class Rec{
    void area(double width,double height){
        double areaR = width * height;
        System.out.println(areaR);

        
    }
}
class Rectangle{
    public static void main(String[] args){
        Rec r1 = new Rec();
        r1.area(7,8);

    }
}