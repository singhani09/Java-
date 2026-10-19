class Squ{
    void area(){
        double length = 34;
        double areaS = length * length;
        System.out.println(areaS);
    }
}
class Square{
    public static void main(String[] args){
        Squ s1 = new Squ();
        s1.area();
    }
}