class Square{
    double area(){
        double lengthSide = 32;
        double area = lengthSide * lengthSide;
        return area;
    }
    public static void main(String[] args){
        Square s1 = new Square();
        double x = s1.area();
    }
}