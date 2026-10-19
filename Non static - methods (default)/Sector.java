class Sector
{
     void Area(){
        double Radius = 5;
        double theta = Math.PI/2;
        double area = 0.5 * Radius * Radius * theta;
        System.out.println(area);
    }
    public static void main(String[] args) {
       new Sector().Area(); 
    }
}