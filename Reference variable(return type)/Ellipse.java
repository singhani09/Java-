class Ellipse{
    double area(){
        double halfMinor = 5;
        double halfMajor = 4;
        final double pie = 3.14;
        double areaCircle = pie * halfMinor * halfMajor;
        return areaCircle;

 }
    public static void main(String[] args) {
        Ellipse e1 = new Ellipse();
        double x = e1.area();
        System.out.println(x);
    }
    }
