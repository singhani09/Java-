class Squ{
    double area(){
        double length = 5;
        double areaS = length * length;
        return areaS;
    }
}
class Square{
    public static void main(String[] args){
        Squ s1 = new Squ();
        double x = s1.area();
    }
}