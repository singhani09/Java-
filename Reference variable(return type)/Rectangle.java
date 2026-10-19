class Rectangle{
    double area(){
        double width = 43;
        double height = 32;
        double areaRectangle = width * height;
        return areaRectangle;
    }
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        double x = r1.area();
        System.out.println(x);
    }

    
}