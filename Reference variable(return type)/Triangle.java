class Triangle{
    double area(){
        double base = 21;
        double height = 12;
        double areaTriangle = 0.5 * base * height;
        return areaTriangle;
    }
    public static void main (String[] args){
        Triangle t1 = new Triangle();
        double x = t1.area();
        System.out.println(x);
    }
}