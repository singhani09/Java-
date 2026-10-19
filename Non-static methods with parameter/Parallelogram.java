class Parallelogram{
    void Area(double base,double height){
        double area = base * height;
        System.out.println(area);
    }
    public static void main(String[] args){
        new Parallelogram().Area(74,67);
    }
}