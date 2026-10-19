class Triangle
{
    void AreaCircle(){
        double Base = 20;
        double height = 10;
        double Area = 0.5 * Base * height;
        System.out.println(Area);
    }
    public static void main(String[] args){
        new Triangle().AreaCircle();
    }
    
}