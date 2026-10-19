class Parallelogram
{
     void Area(){
        double base = 23;
        double verticalHeight = 12;
        double area = base * verticalHeight;
        System.out.println(area);
    }
    public static void main(String[] args) {
        new Parallelogram().Area();
    }
}