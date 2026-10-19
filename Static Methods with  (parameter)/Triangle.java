class Tri{
    static void area( double base, double height){
        double area = 0.5 * base* height;
        System.out.println(area);

    }
}
class Triangle{
    public static void main(String[] args) {
        Tri.area(4,5);
        
    }
    
}