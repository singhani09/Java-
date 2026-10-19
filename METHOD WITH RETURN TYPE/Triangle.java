class Triangle
{
    static double AreaCircle(){
        double Base = 20;
        double height = 10;
        double area = 0.5 * Base * height;
        return (area);
    }
    public static void main(String[] args){
       double x = AreaCircle();
       System.out.println(x);
    }
    
}