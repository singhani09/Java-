class Circle{
    double area(){
        final double pie = 3.14;
        double r = 13;
        double AreaCircle = pie * r * r;
        return (AreaCircle);
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        double x = c1.area();
        System.out.println(x);


    }}
