class Circ{
    void area(double r){
        final double pie = 3.142;
        double areaC = pie * r * r;
        System.out.println(areaC);
    }
    
}
class Circle{
    public static void main(String [] args){
        Circ c1 = new Circ();
        c1.area(6);
    }
    
}