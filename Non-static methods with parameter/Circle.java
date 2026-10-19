class Circle{
    void area(double radiusCircle){
        final double pie = 3.14;
        double areaCircle = pie * radiusCircle * radiusCircle;
        System.out.println(areaCircle);
    }
    public static void main(String[] args) {
        new Circle().area(7);
    }
}