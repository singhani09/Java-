class Sector{
    double area(){
        double radius = 32;
        double theta = Math.PI/2;
        double area = 0.5 * radius * radius * theta;
        return area;

    }
    public static void main(String[] args) {
        Sector s1 = new Sector();
        double x = s1.area();
    }}
