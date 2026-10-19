class Sector{
    static void area(double radius){
        double theta = Math.PI/2;
        double area = 0.5 * radius * radius * theta;
        System.out.println(area);
    }
    public static void main(String[] args) {
        area(7);
        
    }}
        
    
 