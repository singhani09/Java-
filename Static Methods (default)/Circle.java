class Create
{
    static void area(){
        final double pie = 3.14;
        double r = 32;
        double Area = pie * r * r;
        System.out.println(Area);
    }
}
class Circle {
    public static void main(String[] args){
        Create.area();
    }
}