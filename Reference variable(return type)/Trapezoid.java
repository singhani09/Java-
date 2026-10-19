class Trapezoid{
    double area(){
        double verticalHeight = 21;
        double parallelSidea = 15;
        double parallelSideb = 12;
        double areaTrapezoid = 0.5 * (parallelSidea + parallelSideb)* verticalHeight;
        return areaTrapezoid;
    }
    public static void main(String[] args){
        Trapezoid t1 = new Trapezoid();
        double x = t1.area();
    
}
}